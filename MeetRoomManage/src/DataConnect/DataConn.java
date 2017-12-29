package DataConnect;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.SQLException;
import Model.*;

public class DataConn {
	private static Connection getConn()
	{
		String driver = "com.mysql.jdbc.Driver";
	    String url = "jdbc:mysql://localhost:3306/meetingmanage?userSSL=true";
	    String username = "root";
	    String password = "qc54*Uz";
	    Connection conn = null;
	    try {
	        Class.forName(driver); //classLoader,���ض�Ӧ����
	        conn = (Connection) DriverManager.getConnection(url, username, password);
	    } catch (ClassNotFoundException e) {
	        e.printStackTrace();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return conn;
	}
	
	public  int login(String userName,String passWord) {
	    Connection conn = getConn();
	    String sql = "select * from tbl_user where UserName='"+userName+"'";	    
	    try {
	    	Statement stat=conn.createStatement();
	        ResultSet rs = stat.executeQuery(sql);
	          while (rs.next()) {
	            String pass=rs.getString("PassWord");
	            if(pass.equals(passWord))
	            		return 1;
	            else 
	            	return 2;
	          	}
			stat.close();
			conn.close();
	    } catch (SQLException e) {
	       
	        return 3;
	    }
	    return 4;
	}

	public String GetRole(String userName)
	{
	 	Connection conn = getConn();
	    String sql = "select * from tbl_user where UserName='"+userName+"'";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	          while (rs.next()) {
	            String role=rs.getString("Role");
	            	return role;
	          	}
	          pstmt.close();
				conn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return null;
	    }
	    return null;
	}
	
	public List<UserModel> GetAllUser()
	{
	 	Connection conn = getConn();
	    String sql = "select * from tbl_user where Role='�û�'";
	    PreparedStatement pstmt;
	    try {
	    	List<UserModel> list = new ArrayList<UserModel>();
	    	UserModel user= null;
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	          while (rs.next()) {
	        	  user= new UserModel();
	             user.UserName=rs.getString("UserName");
	             user.PassWord=rs.getString("PassWord");
	             user.Role=rs.getString("Role");
	             list.add(user);
	          	}
	          
	          pstmt.close();
			conn.close();
	          return list;
	          
	    } catch (SQLException e) {
	        e.printStackTrace();
	        return null;
	    }
	}
	
	public void SetMeeting(String id,String meetingName,String includePeo)
	{
	 	Connection conn = getConn();
	    String sql = "INSERT INTO tbl_meetingset (Id, MeetingName, IncludePeo) VALUES ('"+id+"', '"+meetingName+"', '"+includePeo+"');";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.execute();
	        pstmt.close();
			conn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}
		
	public  List<Meeting> GetMeetingbyUser(String UserId)
	{
	 	Connection conn = getConn();
	    String sql = "select * from tbl_meetingset ";
	    PreparedStatement pstmt;
	    try {
	    	List<Meeting> list = new ArrayList<Meeting>();
	    	Meeting meeting= null;
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	          while (rs.next()) {
	        	  meeting= new Meeting();
	        	  meeting.Id=rs.getString("Id");
	        	  meeting.MeetingName=rs.getString("MeetingName");
	        	  meeting.IncludePeo=rs.getString("IncludePeo");
	        	  meeting.FinalTime=rs.getString("FinalTime");
	              list.add(meeting);
	          	}
	          List<Meeting> result = new ArrayList<Meeting>();
	          for(int i =0; i<list.size();i++)
	          {
	        	 if( list.get(i).IncludePeo.contains(UserId))
	        	 {
	        		 result.add(list.get(i));
	        	 }	        	  
	          }
	          pstmt.close();
			conn.close();
	          return result;
	    }
	    catch(SQLException e){
	    	e.printStackTrace();
	        return null;
	    }
	}

	public SpaceTimeModel GetSpacebyUaM(String UserName,String MeetingId)
	{
	 	Connection conn = getConn();
	    String sql = "select * from tbl_spacetime where  UserName='"+UserName+"' and MeetingId='" +MeetingId+"'";
	    PreparedStatement pstmt;
	    try{
	    	SpaceTimeModel spaceModel= null;
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	          while (rs.next()) {
	        	  spaceModel= new SpaceTimeModel();
	        	  spaceModel.Id=rs.getString("Id");
	        	  spaceModel.UserName=rs.getString("UserName");
	        	  spaceModel.SpaceTime=rs.getString("SpaceTime");
	        	  spaceModel.MeetingId=rs.getString("MeetingId");
	          }
	          if(spaceModel!=null)
	        	  return spaceModel;
	          else 
	        	  return null;
	    }
	    catch(SQLException e){
	    	e.printStackTrace();
	        return null;
	    }
	}

	public void SetSpeaceTime (String Id,String UserName,String SpaceTime,String  MeetingId)
	{
		Connection conn = getConn();
	    String sql = "INSERT INTO tbl_spacetime (Id, UserName, SpaceTime,MeetingId) VALUES ('"+Id+"', '"+UserName+"', '"+SpaceTime+"','"+MeetingId+"')";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.execute();
	        pstmt.close();
			conn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	}

	public  List<Meeting> GetAllMeeting()
	{
	 	Connection conn = getConn();
	    String sql = "select * from tbl_meetingset ";
	    PreparedStatement pstmt;
	    try {
	    	List<Meeting> list = new ArrayList<Meeting>();
	    	Meeting meeting= null;
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	          while (rs.next()) {
	        	  meeting= new Meeting();
	        	  meeting.Id=rs.getString("Id");
	        	  meeting.MeetingName=rs.getString("MeetingName");
	        	  meeting.IncludePeo=rs.getString("IncludePeo");
	        	  meeting.FinalTime=rs.getString("FinalTime");
	              list.add(meeting);
	          	}
	          pstmt.close();
			  conn.close();
	          return list;
	    }
	    catch(SQLException e){
	    	e.printStackTrace();
	        return null;
	    }
	}
	
	public List<SpaceTimeModel> GetSpacebyMeeting(String MeetingId)
	{
		Connection conn = getConn();
	    String sql = "select * from tbl_spacetime where  MeetingId='" +MeetingId+"'";
	    PreparedStatement pstmt;
	    try{
	    	List<SpaceTimeModel> list=new ArrayList<SpaceTimeModel>();
	    	SpaceTimeModel spaceModel= null;
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        ResultSet rs = pstmt.executeQuery();
	          while (rs.next()) {
	        	  spaceModel= new SpaceTimeModel();
	        	  spaceModel.Id=rs.getString("Id");
	        	  spaceModel.UserName=rs.getString("UserName");
	        	  spaceModel.SpaceTime=rs.getString("SpaceTime");
	        	  spaceModel.MeetingId=rs.getString("MeetingId");
	        	  list.add(spaceModel);
	          }
	          if(list.size()!=0)
	        	  return list;
	          else 
	        	  return null;
	        	 
	    }
	    catch(SQLException e){
	    	e.printStackTrace();
	        return null;
	    }
		
	}

	public void SaveFinalTime(String Id,String FinalTime)
	{
		Connection conn = getConn();
	    String sql = "UPDATE  tbl_meetingset  SET  FinalTime ='"+FinalTime+"' WHERE Id='"+Id+"'";
	    PreparedStatement pstmt;
	    try {
	        pstmt = (PreparedStatement)conn.prepareStatement(sql);
	        pstmt.execute();
	        pstmt.close();
			conn.close();
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
		
	}
}

	
