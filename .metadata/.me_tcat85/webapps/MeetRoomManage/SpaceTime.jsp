<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
if(session.getAttribute("isLogin")!=null&&session.getAttribute("userType")!=null){
	Boolean att= (Boolean)session.getAttribute("isLogin");
	String role= session.getAttribute("userType").toString();
	if(!att)
	out.print("<script>alert('未登陆，请重试！！！');history.back() ;</script>");
	else if(!role.equals("用户"))
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
    <base href="">
    
    <title>My JSP 'SpaceTime.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
    <script src="Scripts/jQuery/jquery-3.2.1.min.js"></script>
    <script src="Content/bootstrap/js/bootstrap.min.js"></script>
    <link href="Content/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
    <!--引入bootstrap-table包-->
    <script src="Content/bootstrap-table/bootstrap-table.js"></script>
    <link href="Content/bootstrap-table/bootstrap-table.css" rel="stylesheet" />
    <script src="Content/bootstrap-table/locale/bootstrap-table-zh-CN.js"></script>
    <script>
    
    function submit(){
    debugger;
    	var rows=parent.getrow();
	    var row=rows[0];
    	var times=document.getElementsByName("check");
		var spaceTime="";
	    $.each(times,function(i,val){
	    	if(val.checked)
	    	{
	    		spaceTime+=val.defaultValue+";";
	    	}	    	
	    });
	    debugger;
	    $.post("CreateSpaceTime",{"SpaceTime":spaceTime ,"MeetingId":row.Id},function(data){
			alert('选择空闲时间成功！'); 
			history.back() ;
		});
    };

    </script>
  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"51369",secure:"51374"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-2" data-genuitec-path="/MeetRoomManage/WebRoot/SpaceTime.jsp">
        <div id="toolbar" class="btn-group" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-2" data-genuitec-path="/MeetRoomManage/WebRoot/SpaceTime.jsp">
            <button onclick="submit()" id="btn_Choose" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>确定
            </button>
        </div>
	  <div style="  width:100%; text-align:center">
	  	<table style="  width:100%; text-align:center" border="1">
	  		<tr>
	  			<th>SPACETIME</th> <th>周一</th> <th>周二</th> <th>周三</th> <th>周四</th> <th>周五</th> <th>周六</th> <th>周日</th>
	  		</tr>
	  		<tr>
	  			<td>8:00-10:00</td> <td><input type="checkbox" name="check" value="1"/></td> <td><input type="checkbox" name="check" value="5"/></td> <td><input type="checkbox" name="check" value="9"/></td> <td><input type="checkbox" name="check" value="13"/></td> <td><input type="checkbox" name="check" value="17"/></td> <td><input type="checkbox" name="check" value="21"/></td> <td><input type="checkbox" name="check" value="25"/></td>
	  		</tr>
	  		<tr>
	  			<td>10:00-12:00</td> <td><input type="checkbox" name="check" value="2"/></td> <td><input type="checkbox" name="check" value="6"/></td> <td><input type="checkbox" name="check" value="10"/></td> <td><input type="checkbox" name="check" value="14"/></td> <td><input type="checkbox" name="check" value="18"/></td> <td><input type="checkbox" name="check" value="22"/></td> <td><input type="checkbox" name="check" value="26"/></td>
	  		</tr>
	  		<tr>
	  			<td>14:00-16:00</td> <td><input type="checkbox" name="check" value="3"/></td> <td><input type="checkbox" name="check" value="7"/></td> <td><input type="checkbox" name="check" value="11"/></td> <td><input type="checkbox" name="check" value="15"/></td> <td><input type="checkbox" name="check" value="19"/></td> <td><input type="checkbox" name="check" value="23"/></td> <td><input type="checkbox" name="check" value="27"/></td>
	  		</tr>
	  		<tr>
	  			<td>16:00-18:00</td> <td><input type="checkbox" name="check" value="4"/></td> <td><input type="checkbox" name="check" value="8"/></td> <td><input type="checkbox" name="check" value="12"/></td> <td><input type="checkbox" name="check" value="16"/></td> <td><input type="checkbox" name="check" value="20"/></td> <td><input type="checkbox" name="check" value="24"/></td> <td><input type="checkbox" name="check" value="28"/></td>
	  		</tr>
	  	</table>
	  </div>
  </body>
</html>