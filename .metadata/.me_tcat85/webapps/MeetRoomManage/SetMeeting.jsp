<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
if(session.getAttribute("isLogin")!=null&&session.getAttribute("userType")!=null){
	Boolean att= (Boolean)session.getAttribute("isLogin");
	String role= session.getAttribute("userType").toString();
	if(!att)
	out.print("<script>alert('未登陆，请重试！！！');history.back() ;</script>");
	else if(!role.equals("管理员"))
	{
	out.print("<script>alert('您无权操作此页面！');history.back() ;</script>");
	}
}
else
	out.print("<script> alert('未登陆，请重试！！！');history.back() ;</script>");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>SetMeeting</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <script type="text/javascript" src="jquery-3.2.1.min.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script>
	$(function(){
	
	$.post("GetUser",function(data){
		var result = eval("(" + data + ")")
		var myform=$("#main");
		$.each(result,function(i,val){
			var inputStr="<input type='checkbox' name='user' value='"+val.UserName+"''/>"+val.UserName;
			myform.append(inputStr);
		});
		
		
	});
	});
	
	
	function CreatMeeting(){
	var meetingName=$("#MeetingName").val();
	var users=document.getElementsByName("user");
	var userlist="";
    $.each(users,function(i,val){
    	if(val.checked)
    	{
    		userlist+=val.defaultValue+";";
    	}
    });   
		$.post("CreatMeeting",{"MeetingName":meetingName ,"users":userlist},function(data){
			alert('创建会议成功！'); 
		});
	};
</script>
  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"51369",secure:"51374"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-1" data-genuitec-path="/MeetRoomManage/WebRoot/SetMeeting.jsp">
	<div  style=" margin: 200px 200px 200px 0px; width:100%; text-align:center" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-1" data-genuitec-path="/MeetRoomManage/WebRoot/SetMeeting.jsp">
		<table style="margin: 200px 200px 200px 0px; width:100%;text-align:center">
		<tr>
			<td>
				会议名称：<input id="MeetingName" type="text" name="MeetingName" /><br>		                   
			</td>
		</tr>
		<tr>
			<td>
			<form id ="main">
			 与会人员：
			</form>
			</td>
		</tr>	
		<tr>
			<td>
				<button onclick="CreatMeeting()">创建会议</button>
			</td>
		</tr>
		</table>
			
	</div>

  </body>
</html>
