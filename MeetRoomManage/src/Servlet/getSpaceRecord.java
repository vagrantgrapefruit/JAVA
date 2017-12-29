package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import DataConnect.DataConn;
import Model.SpaceTimeModel;

/**
 * Servlet implementation class getSpaceRecord
 */
@WebServlet("/getSpaceRecord")
public class getSpaceRecord extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getSpaceRecord() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		String  MeetingId= request.getParameter("MeetingId");
		PrintWriter out = response.getWriter();
		//获取数据
		DataConn conn= new DataConn();
		List<SpaceTimeModel> list=new ArrayList<SpaceTimeModel>();
		if(conn.GetSpacebyMeeting( MeetingId)!=null)
			{
				list=conn.GetSpacebyMeeting( MeetingId);
				//转换成json输出到页面
		        Gson gson = new Gson();
		        String json = gson.toJson(list);
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
