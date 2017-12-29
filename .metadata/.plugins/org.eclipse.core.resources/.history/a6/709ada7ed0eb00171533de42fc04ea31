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

<!DOCTYPE html>

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>会议记录</title>
    <script src="Scripts/jQuery/jquery-3.2.1.min.js"></script>
    <script src="Content/bootstrap/js/bootstrap.min.js"></script>
    <link href="Content/bootstrap/css/bootstrap.min.css" rel="stylesheet" />
    <!--引入bootstrap-table包-->
    <script src="Content/bootstrap-table/bootstrap-table.js"></script>
    <link href="Content/bootstrap-table/bootstrap-table.css" rel="stylesheet" />
    <script src="Content/bootstrap-table/locale/bootstrap-table-zh-CN.js"></script>
    <script src="Scripts/getMeeting.js"></script>
    <script>
    </script>
</head>
<body>
        <div id="toolbar" class="btn-group">
            <button id="btn_Choose" type="button" class="btn btn-default">
                <span class="glyphicon glyphicon-pencil" aria-hidden="true"></span>选择空闲时间
            </button>
        </div>
        <table id="tb_departments"></table>
    <div class="modal fade" id="ModuleModal">
    <div class="modal-dialog"style="width:800px" >
        <div class="modal-content">
            <div class="modal-header">
                 <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                <h4 class="modal-title" id="NoPermissionModalLabel"></h4>
            </div>
            <div class="modal-body">
                <iframe id="Moduleiframe" width="100%" height="50%" frameborder="0"style="height:250px;overflow:auto; "></iframe>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default " data-dismiss="modal">    关  闭    </button>
            </div>
        </div>
    </div>
</div>
</body>
</html>