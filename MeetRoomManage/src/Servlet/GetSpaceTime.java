package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import Model.*;
import DataConnect.DataConn;

/**
 * Servlet implementation class GetSpaceTime
 */
@WebServlet("/GetSpaceTime")
public class GetSpaceTime extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetSpaceTime() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		//通过session获取用户名
		HttpSession session= request.getSession();
		String UserName=session.getAttribute("user").toString();
		String  MeetingId= request.getParameter("MeetingId");
		PrintWriter out = response.getWriter();
		//获取数据
		DataConn conn= new DataConn();
		SpaceTimeModel sTModel=null;
		if(conn.GetSpacebyUaM(UserName, MeetingId)!=null)
		{
			sTModel=conn.GetSpacebyUaM(UserName, MeetingId);
			//转换成json输出到页面
	        Gson gson = new Gson();
	        String json = gson.toJson(sTModel);
	        out.write(json);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
