package pmsConnectivity;
import java.sql.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
/**
 * Servlet implementation class Form_6
 */
@WebServlet("/Form_6")
public class Form_6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connections connection=new Connections();
		int qualification=Integer.parseInt(request.getParameter("qualification"));
		int relevant_experience=Integer.parseInt(request.getParameter("relevant_experience"));
		int communication_skills=Integer.parseInt(request.getParameter("communication_skills"));
		int team_building=Integer.parseInt(request.getParameter("team_building"));
		int leadership_abilities=Integer.parseInt(request.getParameter("leadership_abilities"));
		int total_rating=Integer.parseInt(request.getParameter("total_rating"));
		int overall_marks=Integer.parseInt(request.getParameter("overall_marks"));
		Connection con=null;
		Statement stm=null;
		PrintWriter out=response.getWriter();
		try {
			con=connection.getConnection();
			stm=con.createStatement();
			int i=stm.executeUpdate("insert into t_irctc_potential_appraisal(QUALIFICATION,RELEVANT_EXPERIENCE,COMMUNICATION_SKILLS,TEAM_BUILDING,LEADERSHIP_ABILITIES,SUBMIT_DATE,TOTAL_RATING,TOTAL_MARKS) values ("+qualification+","+relevant_experience+","+communication_skills+","+team_building+","+leadership_abilities+",now(),"+total_rating+","+overall_marks+")");
			if(i==1) {
				response.sendRedirect("7.jsp");
			}
			connection.dbClose(null, stm, con);
		}catch(Exception e) {
			out.print(e);
		}
		out.close();
	}
}
