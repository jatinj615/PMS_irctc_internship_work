package pmsConnectivity;
import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class Form_3
 */
@WebServlet("/Form_3")
public class Form_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connections connection=new Connections();
		int relevant_qualification=Integer.parseInt(request.getParameter("relevant_qualification"));
		int job_knowledge=-1;
		int rules_sop=-1;
		int team_work=-1;
		int decision_making=-1;
		if(request.getParameter("job_knowledge")!=""){
			job_knowledge=Integer.parseInt(request.getParameter("job_knowledge"));
		}
		if(request.getParameter("rules_sop")!=""){
			rules_sop=Integer.parseInt(request.getParameter("rules_sop"));
		}
		if(request.getParameter("team_work")!="") {
			team_work=Integer.parseInt(request.getParameter("team_work"));
		}
		if(request.getParameter("decision_making")!="") {
			decision_making=Integer.parseInt(request.getParameter("decision_making"));
		}
		int total_rating=Integer.parseInt(request.getParameter("total_rating"));
		int overall_marks=Integer.parseInt(request.getParameter("overall_marks"));
		Connection con=null;
		Statement stm=null;
		PrintWriter out=response.getWriter();
		try {
			con=connection.getConnection();
			stm=con.createStatement();
			int i=stm.executeUpdate("insert into t_irctc_tech_competency(RELEVANT_QUALIFICATION,JOB_KNOWLEDGE,RULES_SOP,TEAM_WORK,DECISION_MAKING,SUBMIT_DATE,TOTAL_RATING,TOTAL_MARKS) values("+relevant_qualification+","+job_knowledge+","+rules_sop+","+team_work+","+decision_making+",now(),"+total_rating+","+overall_marks+") ;");
			if(i==1) {
				response.sendRedirect("4.jsp");
			}
			connection.dbClose(null, stm, con);
		}catch(Exception e) {
			out.print(e);
		}
		out.close();
	}
}
