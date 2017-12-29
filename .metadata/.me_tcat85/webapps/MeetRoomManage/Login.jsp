<%@ page language="java" import="java.util.*" import="DataConnect.DataConn"  pageEncoding="UTF-8"%>
<jsp:useBean id="conn" class="DataConnect.DataConn"></jsp:useBean>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String userName = request.getParameter("UserName");
String passWord = request.getParameter("PassWord");
if(userName!=null){
if(conn.login(userName,passWord)==1)
{
	String role = conn.GetRole(userName);
	session.setAttribute("user",userName);
	session.setAttribute("userType",role);
	session.setAttribute("isLogin", true);

	
	if(role.equals("用户"))
	{
		response.sendRedirect("Choose.jsp");
	}
	else if(role.equals("老板"))
	{
	response.sendRedirect("BossChoose.jsp");
	}
	else if(role.equals("管理员"))
	{
	response.sendRedirect("SetMeeting.jsp");
	}
}
else{
	out.println("用户名或密码有误！！！！");
}
}
%>

<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'Login.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="jquery-3.2.1.min.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"51369",secure:"51374"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-0" data-genuitec-path="/MeetRoomManage/WebRoot/Login.jsp">
  	<div style=" margin: 200px 200px 200px 0px; width:100%; text-align:center" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-0" data-genuitec-path="/MeetRoomManage/WebRoot/Login.jsp">
	  <form action="Login.jsp">
	    <div >
	    	用户名：<input type="text" name="UserName" /><br/>
	    </div>
	    <div >
	    	密 &nbsp;&nbsp;码：<input type="password" name="PassWord" /><br/>
	    </div>
	    <input type="submit" value="登陆">
	  </form>
	</div>  
  </body>
</html>
