/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.9
 * Generated at: 2017-12-28 16:11:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class StartMeeting_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=utf-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\r\n");
      out.write("<html>\r\n");
      out.write("  <head>\r\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\r\n");
      out.write("    \r\n");
      out.write("    <title>My JSP 'StartMeeting.jsp' starting page</title>\r\n");
      out.write("    \r\n");
      out.write("\t<meta http-equiv=\"pragma\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"cache-control\" content=\"no-cache\">\r\n");
      out.write("\t<meta http-equiv=\"expires\" content=\"0\">    \r\n");
      out.write("\t<meta http-equiv=\"keywords\" content=\"keyword1,keyword2,keyword3\">\r\n");
      out.write("\t<meta http-equiv=\"description\" content=\"This is my page\">\r\n");
      out.write("\t<script src=\"Scripts/jQuery/jquery-3.2.1.min.js\"></script>\r\n");
      out.write("    <script src=\"Content/bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <link href=\"Content/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <!--引入bootstrap-table包-->\r\n");
      out.write("    <script src=\"Content/bootstrap-table/bootstrap-table.js\"></script>\r\n");
      out.write("    <link href=\"Content/bootstrap-table/bootstrap-table.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <script src=\"Content/bootstrap-table/locale/bootstrap-table-zh-CN.js\"></script>\r\n");
      out.write("    <script>\r\n");
      out.write("    \t$(function(){\r\n");
      out.write("    \t\tvar rows=parent.getrow();\r\n");
      out.write("    \t\tvar row=rows[0];\r\n");
      out.write("    \t\t$.post(\"getSpaceRecord\",{\"MeetingId\":row.Id},function(data){   \t\t\t\r\n");
      out.write("    \t\t\tif(data!=\"\")\r\n");
      out.write("    \t\t\t{    \t\t\t\t\r\n");
      out.write("    \t\t\t\tvar resultstr=eval(\"(\"+data+\")\");\r\n");
      out.write("\t    \t\t\tvar Rows=parent.getrow();\r\n");
      out.write("\t    \t\t\tvar Users=Rows[0].IncludePeo.split(\";\");\r\n");
      out.write("\t    \t\t\tvar usercount=Users.length-1;\r\n");
      out.write("\t    \t\t\tvar RecordCount =resultstr.length;\r\n");
      out.write("\t    \t\t\tif(usercount!=RecordCount)\r\n");
      out.write("\t    \t\t\t{\r\n");
      out.write("\t    \t\t\t\talert(\"该记录尚有用户未选择空余时间\")\r\n");
      out.write("\t    \t\t\t\thistory.back() ;\r\n");
      out.write("\t    \t\t\t}\r\n");
      out.write("\t    \t\t\telse{\t    \t\t\t\t\r\n");
      out.write("\t    \t\t\t\tvar list=new Array();\r\n");
      out.write("\t    \t\t\t\t$.each(resultstr,function(i,val){\r\n");
      out.write("\t    \t\t\t\t\tlist.push(val.SpaceTime.split(\";\"));\r\n");
      out.write("\t    \t\t\t\t});\r\n");
      out.write("\t    \t\t\t\t$.each(list,function(i,val){\r\n");
      out.write("\t    \t\t\t\t\tval.pop();\r\n");
      out.write("\t    \t\t\t\t});\r\n");
      out.write("\t    \t\t\t\tvar intarry=new Array(0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0);\r\n");
      out.write("\t    \t\t\t\t$.each(list,function(i,val){\r\n");
      out.write("\t    \t\t\t\t\t$.each(val,function(j,value){\r\n");
      out.write("\t    \t\t\t\t\t\tvar a =parseInt(value);\r\n");
      out.write("\t    \t\t\t\t\t\tintarry[a-1]+=1;\r\n");
      out.write("\t    \t\t\t\t\t});\r\n");
      out.write("\t    \t\t\t\t});\r\n");
      out.write("\t    \t\t\t\t$.each(intarry,function(i,val){\r\n");
      out.write("\t    \t\t\t\t\tif(val!=0)\r\n");
      out.write("\t    \t\t\t\t\t{\r\n");
      out.write("\t    \t\t\t\t\t\t$(\"#\"+i).append(val);\r\n");
      out.write("\t    \t\t\t\t\t}\r\n");
      out.write("\t    \t\t\t\t});\r\n");
      out.write("\t    \t\t\t}\r\n");
      out.write("\t    \t\t}\r\n");
      out.write("\t    \t\telse {\r\n");
      out.write("\t    \t\t\t\talert(\"该记录尚有用户未选择空余时间\")\r\n");
      out.write("\t    \t\t\t\thistory.back() ;\r\n");
      out.write("\t    \t\t}\r\n");
      out.write("\t    \t\t\t\r\n");
      out.write("    \t\t\t\r\n");
      out.write("    \t\t});\r\n");
      out.write("    \t});\r\n");
      out.write("   \r\n");
      out.write("   \t\tfunction submit(){\r\n");
      out.write("   \t\t\tvar rows=parent.getrow();\r\n");
      out.write("   \t\t\tvar row=rows[0];\r\n");
      out.write("   \t\t\tvar times=document.getElementsByName(\"check\");\r\n");
      out.write("   \t\t\tvar finalTime=\"\";\r\n");
      out.write("\t   \t\t$.each(times,function(i,val){\r\n");
      out.write("\t\t    \tif(val.checked)\r\n");
      out.write("\t\t    \t{\t\t   \t\t\r\n");
      out.write("\t\t    \t\tswitch(val.defaultValue)\r\n");
      out.write("\t\t    \t\t{\r\n");
      out.write("\t\t    \t\t\tcase \"1\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周一8:00-10:00;\";break;\t\t    \t\t\t\t\r\n");
      out.write("\t\t    \t\t\tcase \"2\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周一10:00-12:00;\";break;\r\n");
      out.write("\t\t    \t\t\tcase \"3\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周一14:00-16:00;\";break;\r\n");
      out.write("\t\t    \t\t\tcase \"4\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周一16:00-18:00;\";break;\r\n");
      out.write("\t\t    \t\t\tcase \"5\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周二10:00-12:00;\";break;\r\n");
      out.write("\t\t    \t\t\tcase \"6\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周二14:00-16:00;\";break;\r\n");
      out.write("\t\t    \t\t\tcase \"7\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周二8:00-10:00;\";break;\r\n");
      out.write("\t\t    \t\t\tcase \"8\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周二16:00-18:00;\";break;\r\n");
      out.write("\t\t    \t\t\tcase \"9\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周三8:00-10:00;\";\tbreak;\r\n");
      out.write("\t\t    \t\t\tcase \"10\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周三10:00-12:00;\";break;\r\n");
      out.write("\t\t    \t\t\tcase \"11\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周三14:00-16:00;\";break;\t\r\n");
      out.write("\t\t    \t\t\tcase \"12\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周三16:00-18:00;\";break;\r\n");
      out.write("\t\t    \t\t\tcase \"13\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周四8:00-10:00;\";\tbreak;\r\n");
      out.write("\t\t    \t\t\tcase \"14\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周四10:00-12:00;\";break;\r\n");
      out.write("\t\t    \t\t\tcase \"15\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周四14:00-16:00;\";break;\t\r\n");
      out.write("\t\t    \t\t\tcase \"16\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周四16:00-18:00;\";break;\t\r\n");
      out.write("\t\t    \t\t\tcase \"17\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周五8:00-10:00;\";\tbreak;\r\n");
      out.write("\t\t    \t\t\tcase \"18\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周五10:00-12:00;\";break;\t\r\n");
      out.write("\t\t    \t\t\tcase \"19\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周五14:00-16:00;\";break;\t\r\n");
      out.write("\t\t    \t\t\tcase \"20\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周五16:00-18:00;\";break;\t\r\n");
      out.write("\t\t    \t\t\tcase \"21\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周六8:00-10:00;\";\tbreak;\r\n");
      out.write("\t\t    \t\t\tcase \"22\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周六10:00-12:00;\";break;\t\r\n");
      out.write("\t\t    \t\t\tcase \"23\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周六14:00-16:00;\";break;\t\r\n");
      out.write("\t\t    \t\t\tcase \"24\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周六16:00-18:00;\";break;\t\r\n");
      out.write("\t\t    \t\t\tcase \"25\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周日8:00-10:00;\";\tbreak;\r\n");
      out.write("\t\t    \t\t\tcase \"26\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周日10:00-12:00;\";break;\r\n");
      out.write("\t\t    \t\t\tcase \"27\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周日14:00-16:00;\";\tbreak;\r\n");
      out.write("\t\t    \t\t\tcase \"28\":\r\n");
      out.write("\t\t    \t\t\t\tfinalTime+=\"周日16:00-18:00;\";\tbreak;\r\n");
      out.write("\t\t    \t\t\t\tbreak;\r\n");
      out.write("\t\t    \t\t\tdefault\t:\r\n");
      out.write("\t\t    \t\t\t\tbreak;\t\t    \t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t    \t\t}\r\n");
      out.write("\t\t    \t}\t    \t\r\n");
      out.write("\t\t    });\r\n");
      out.write("\t\t    debugger;\r\n");
      out.write("\t\t    $.post(\"SaveFinalTime\",{\"Id\":row.Id,\"FinalTime\":finalTime},function(data){\r\n");
      out.write("\t\t    \talert(\"设置成功！\");\r\n");
      out.write("\t\t    });\r\n");
      out.write("   \t\t\t\r\n");
      out.write("   \t\t};\r\n");
      out.write("    </script>\r\n");
      out.write("\t<!--\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\">\r\n");
      out.write("\t-->\r\n");
      out.write("  <script>\"undefined\"==typeof CODE_LIVE&&(!function(e){var t={nonSecure:\"51369\",secure:\"51374\"},c={nonSecure:\"http://\",secure:\"https://\"},r={nonSecure:\"127.0.0.1\",secure:\"gapdebug.local.genuitec.com\"},n=\"https:\"===window.location.protocol?\"secure\":\"nonSecure\";script=e.createElement(\"script\"),script.type=\"text/javascript\",script.async=!0,script.src=c[n]+r[n]+\":\"+t[n]+\"/codelive-assets/bundle.js\",e.getElementsByTagName(\"head\")[0].appendChild(script)}(document),CODE_LIVE=!0);</script></head>\r\n");
      out.write("  \r\n");
      out.write("  <body data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc1-3\" data-genuitec-path=\"/MeetRoomManage/WebRoot/StartMeeting.jsp\">\r\n");
      out.write("    <div id=\"toolbar\" class=\"btn-group\" data-genuitec-lp-enabled=\"false\" data-genuitec-file-id=\"wc1-3\" data-genuitec-path=\"/MeetRoomManage/WebRoot/StartMeeting.jsp\">\r\n");
      out.write("            <button onclick=\"submit()\" id=\"btn_Choose\" type=\"button\" class=\"btn btn-default\">\r\n");
      out.write("                <span class=\"glyphicon glyphicon-pencil\" aria-hidden=\"true\"></span>确定\r\n");
      out.write("            </button>\r\n");
      out.write("        </div>\r\n");
      out.write("\t  <div style=\"  width:100%; text-align:center\">\r\n");
      out.write("\t  \t<table style=\"  width:100%; text-align:center\" border=\"1\">\r\n");
      out.write("\t  \t\t<tr>\r\n");
      out.write("\t  \t\t\t<th>SPACETIME</th> <th>周一</th> <th>周二</th> <th>周三</th> <th>周四</th> <th>周五</th> <th>周六</th> <th>周日</th>\r\n");
      out.write("\t  \t\t</tr>\r\n");
      out.write("\t  \t\t<tr>\r\n");
      out.write("\t  \t\t\t<td>8:00-10:00</td> <td id=\"1\"><input type=\"checkbox\" name=\"check\" value=\"1\"/></td> <td id=\"5\"><input type=\"checkbox\" name=\"check\" value=\"5\"/></td> <td id=\"9\"><input type=\"checkbox\" name=\"check\" value=\"9\"/></td> <td id=\"13\"><input type=\"checkbox\" name=\"check\" value=\"13\"/></td> <td id=\"17\"><input type=\"checkbox\" name=\"check\" value=\"17\"/></td> <td id=\"21\"><input type=\"checkbox\" name=\"check\" value=\"21\"/></td> <td id=\"25\"><input type=\"checkbox\" name=\"check\" value=\"25\"/></td>\r\n");
      out.write("\t  \t\t</tr>\r\n");
      out.write("\t  \t\t<tr>\r\n");
      out.write("\t  \t\t\t<td>10:00-12:00</td> <td id=\"2\"><input type=\"checkbox\" name=\"check\" value=\"2\"/></td> <td id=\"6\"><input type=\"checkbox\" name=\"check\" value=\"6\"/></td> <td id=\"10\"><input type=\"checkbox\" name=\"check\" value=\"10\"/></td> <td id=\"14\"><input type=\"checkbox\" name=\"check\" value=\"14\"/></td> <td id=\"18\"><input type=\"checkbox\" name=\"check\" value=\"18\"/></td> <td id=\"22\"><input type=\"checkbox\" name=\"check\" value=\"22\"/></td> <td id=\"26\"><input type=\"checkbox\" name=\"check\" value=\"26\"/></td>\r\n");
      out.write("\t  \t\t</tr>\r\n");
      out.write("\t  \t\t<tr>\r\n");
      out.write("\t  \t\t\t<td>14:00-16:00</td> <td id=\"3\"><input type=\"checkbox\" name=\"check\" value=\"3\"/></td> <td id=\"7\"><input type=\"checkbox\" name=\"check\" value=\"7\"/></td> <td id=\"11\"><input type=\"checkbox\" name=\"check\" value=\"11\"/></td> <td id=\"15\"><input type=\"checkbox\" name=\"check\" value=\"15\"/></td> <td id=\"19\"><input type=\"checkbox\" name=\"check\" value=\"19\"/></td> <td id=\"23\"><input type=\"checkbox\" name=\"check\" value=\"23\"/></td> <td id=\"27\"><input type=\"checkbox\" name=\"check\" value=\"27\"/></td>\r\n");
      out.write("\t  \t\t</tr>\r\n");
      out.write("\t  \t\t<tr>\r\n");
      out.write("\t  \t\t\t<td>16:00-18:00</td> <td id=\"4\"><input type=\"checkbox\" name=\"check\" value=\"4\"/></td> <td id=\"8\"><input type=\"checkbox\" name=\"check\" value=\"8\"/></td> <td id=\"12\"><input type=\"checkbox\" name=\"check\" value=\"12\"/></td> <td id=\"16\"><input type=\"checkbox\" name=\"check\" value=\"16\"/></td> <td id=\"20\"><input type=\"checkbox\" name=\"check\" value=\"20\"/></td> <td id=\"24\"><input type=\"checkbox\" name=\"check\" value=\"24\"/></td> <td id=\"28\"><input type=\"checkbox\" name=\"check\" value=\"28\"/></td>\r\n");
      out.write("\t  \t\t</tr>\r\n");
      out.write("\t  \t</table>\r\n");
      out.write("\t  </div>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
