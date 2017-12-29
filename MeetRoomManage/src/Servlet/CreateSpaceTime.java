package Servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DataConnect.DataConn;
import Model.*;

/**
 * Servlet implementation class CreateSpaceTime
 */
@WebServlet("/CreateSpaceTime")
public class CreateSpaceTime extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreateSpaceTime() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset=UTF-8");    
        Date date = new Date();//��ǰʱ��
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = sdf.format(date );
        //��ȡ����ֵ
        String MeetingId=request.getParameter("MeetingId");
        String SpaceTime=request.getParameter("SpaceTime");
       //ͨ��session��ȡ�û���
  		HttpSession session= request.getSession();
  		String UserName=session.getAttribute("user").toString();
  		//д���ݿ�
        DataConn con=new DataConn();
        con.SetSpeaceTime(dateString,UserName,SpaceTime,MeetingId);
        
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
