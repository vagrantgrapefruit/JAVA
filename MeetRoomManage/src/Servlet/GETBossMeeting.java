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
import Model.Meeting;
import Model.MeetingTable;

/**
 * Servlet implementation class GETBossMeeting
 */
@WebServlet("/GETBossMeeting")
public class GETBossMeeting extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GETBossMeeting() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");
		//ͨ��session��ȡ�û���
		HttpSession session= request.getSession();
		String UserId=session.getAttribute("user").toString();
		PrintWriter out = response.getWriter();
		//������ݿ��е�����
		DataConn conn= new DataConn();
		List<Meeting> list =new ArrayList();
		list=conn.GetAllMeeting();
		int total=list.size();
		MeetingTable table =new MeetingTable();
		table.total=total;
		table.rows=list;
		//ת����json�����ҳ��
        Gson gson = new Gson();
        String json = gson.toJson(table);
        out.write(json);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
