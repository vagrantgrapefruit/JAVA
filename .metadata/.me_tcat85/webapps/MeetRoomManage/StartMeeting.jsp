<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
if(session.getAttribute("isLogin")!=null&&session.getAttribute("userType")!=null){
	Boolean att= (Boolean)session.getAttribute("isLogin");
	String role= session.getAttribute("userType").toString();
	if(!att)
	out.print("<script>alert('未登陆，请重试！！！');history.back() ;</script>");
	else if(!role.equals("老板"))
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
    
    <title>My JSP 'StartMeeting.jsp' starting page</title>
    
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
    	$(function(){
    		var rows=parent.getrow();
    		var row=rows[0];
    		$.post("getSpaceRecord",{"MeetingId":row.Id},function(data){   			
    			if(data!="")
    			{    				
    				var resultstr=eval("("+data+")");
	    			var Rows=parent.getrow();
	    			var Users=Rows[0].IncludePeo.split(";");
	    			var usercount=Users.length-1;
	    			var RecordCount =resultstr.length;
	    			if(usercount!=RecordCount)
	    			{
	    				alert("该记录尚有用户未选择空余时间")
	    				history.back() ;
	    			}
	    			else{	    				
	    				var list=new Array();
	    				$.each(resultstr,function(i,val){
	    					list.push(val.SpaceTime.split(";"));
	    				});
	    				$.each(list,function(i,val){
	    					val.pop();
	    				});
	    				var intarry=new Array(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);
	    				$.each(list,function(i,val){
	    					$.each(val,function(j,value){
	    						var a =parseInt(value);
	    						intarry[a-1]+=1;
	    					});
	    				});
	    				$.each(intarry,function(i,val){
	    					if(val!=0)
	    					{
	    						$("#"+i).append(val);
	    					}
	    				});
	    			}
	    		}
	    		else {
	    				alert("该记录尚有用户未选择空余时间")
	    				history.back() ;
	    		}
	    			
    			
    		});
    	});
   
   		function submit(){
   			var rows=parent.getrow();
   			var row=rows[0];
   			var times=document.getElementsByName("check");
   			var finalTime="";
	   		$.each(times,function(i,val){
		    	if(val.checked)
		    	{		   		
		    		switch(val.defaultValue)
		    		{
		    			case "1":
		    				finalTime+="周一8:00-10:00;";break;		    				
		    			case "2":
		    				finalTime+="周一10:00-12:00;";break;
		    			case "3":
		    				finalTime+="周一14:00-16:00;";break;
		    			case "4":
		    				finalTime+="周一16:00-18:00;";break;
		    			case "5":
		    				finalTime+="周二10:00-12:00;";break;
		    			case "6":
		    				finalTime+="周二14:00-16:00;";break;
		    			case "7":
		    				finalTime+="周二8:00-10:00;";break;
		    			case "8":
		    				finalTime+="周二16:00-18:00;";break;
		    			case "9":
		    				finalTime+="周三8:00-10:00;";	break;
		    			case "10":
		    				finalTime+="周三10:00-12:00;";break;
		    			case "11":
		    				finalTime+="周三14:00-16:00;";break;	
		    			case "12":
		    				finalTime+="周三16:00-18:00;";break;
		    			case "13":
		    				finalTime+="周四8:00-10:00;";	break;
		    			case "14":
		    				finalTime+="周四10:00-12:00;";break;
		    			case "15":
		    				finalTime+="周四14:00-16:00;";break;	
		    			case "16":
		    				finalTime+="周四16:00-18:00;";break;	
		    			case "17":
		    				finalTime+="周五8:00-10:00;";	break;
		    			case "18":
		    				finalTime+="周五10:00-12:00;";break;	
		    			case "19":
		    				finalTime+="周五14:00-16:00;";break;	
		    			case "20":
		    				finalTime+="周五16:00-18:00;";break;	
		    			case "21":
		    				finalTime+="周六8:00-10:00;";	break;
		    			case "22":
		    				finalTime+="周六10:00-12:00;";break;	
		    			case "23":
		    				finalTime+="周六14:00-16:00;";break;	
		    			case "24":
		    				finalTime+="周六16:00-18:00;";break;	
		    			case "25":
		    				finalTime+="周日8:00-10:00;";	break;
		    			case "26":
		    				finalTime+="周日10:00-12:00;";break;
		    			case "27":
		    				finalTime+="周日14:00-16:00;";	break;
		    			case "28":
		    				finalTime+="周日16:00-18:00;";	break;
		    				break;
		    			default	:
		    				break;		    									
		    		}
		    	}	    	
		    });
		    debugger;
		    $.post("SaveFinalTime",{"Id":row.Id,"FinalTime":finalTime},function(data){
		    	alert("设置成功！");history.back() ;
		    });
   			
   		};
    </script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  <script>"undefined"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:"51369",secure:"51374"},c={nonSecure:"http://",secure:"https://"},r={nonSecure:"127.0.0.1",secure:"gapdebug.local.genuitec.com"},n="https:"===window.location.protocol?"secure":"nonSecure";script=e.createElement("script"),script.type="text/javascript",script.async=!0,script.src=c[n]+r[n]+":"+t[n]+"/codelive-assets/bundle.js",e.getElementsByTagName("head")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>
  
  <body data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-3" data-genuitec-path="/MeetRoomManage/WebRoot/StartMeeting.jsp">
    <div id="toolbar" class="btn-group" data-genuitec-lp-enabled="false" data-genuitec-file-id="wc1-3" data-genuitec-path="/MeetRoomManage/WebRoot/StartMeeting.jsp">
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
	  			<td>8:00-10:00</td> <td id="1"><input type="checkbox" name="check" value="1"/></td> <td id="5"><input type="checkbox" name="check" value="5"/></td> <td id="9"><input type="checkbox" name="check" value="9"/></td> <td id="13"><input type="checkbox" name="check" value="13"/></td> <td id="17"><input type="checkbox" name="check" value="17"/></td> <td id="21"><input type="checkbox" name="check" value="21"/></td> <td id="25"><input type="checkbox" name="check" value="25"/></td>
	  		</tr>
	  		<tr>
	  			<td>10:00-12:00</td> <td id="2"><input type="checkbox" name="check" value="2"/></td> <td id="6"><input type="checkbox" name="check" value="6"/></td> <td id="10"><input type="checkbox" name="check" value="10"/></td> <td id="14"><input type="checkbox" name="check" value="14"/></td> <td id="18"><input type="checkbox" name="check" value="18"/></td> <td id="22"><input type="checkbox" name="check" value="22"/></td> <td id="26"><input type="checkbox" name="check" value="26"/></td>
	  		</tr>
	  		<tr>
	  			<td>14:00-16:00</td> <td id="3"><input type="checkbox" name="check" value="3"/></td> <td id="7"><input type="checkbox" name="check" value="7"/></td> <td id="11"><input type="checkbox" name="check" value="11"/></td> <td id="15"><input type="checkbox" name="check" value="15"/></td> <td id="19"><input type="checkbox" name="check" value="19"/></td> <td id="23"><input type="checkbox" name="check" value="23"/></td> <td id="27"><input type="checkbox" name="check" value="27"/></td>
	  		</tr>
	  		<tr>
	  			<td>16:00-18:00</td> <td id="4"><input type="checkbox" name="check" value="4"/></td> <td id="8"><input type="checkbox" name="check" value="8"/></td> <td id="12"><input type="checkbox" name="check" value="12"/></td> <td id="16"><input type="checkbox" name="check" value="16"/></td> <td id="20"><input type="checkbox" name="check" value="20"/></td> <td id="24"><input type="checkbox" name="check" value="24"/></td> <td id="28"><input type="checkbox" name="check" value="28"/></td>
	  		</tr>
	  	</table>
	  </div>
  </body>
</html>
