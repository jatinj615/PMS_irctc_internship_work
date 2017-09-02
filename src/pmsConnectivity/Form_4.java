package pmsConnectivity;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class Form_4
 */
@WebServlet("/Form_4")
public class Form_4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@SuppressWarnings("null")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connections connection=new Connections();
		int cost_consciousness=Integer.parseInt(request.getParameter("cost_consciousness"));
		int quality_consciousness=Integer.parseInt(request.getParameter("quality_consciousness"));
		int resource_management=Integer.parseInt(request.getParameter("resource_management"));
		int safety_health=Integer.parseInt(request.getParameter("safety_health"));
		int effective_communication=-1;
		int analytical_ability=-1;
		int business_knowledge=-1;
		int innovation=-1;
		int team_building=-1;
		int leadership=-1;
		if(request.getParameter("effective_communication") !="")
			{ effective_communication=Integer.parseInt(request.getParameter("effective_communication"));}
		if(request.getParameter("analytical_ability")!="")	
			{analytical_ability=Integer.parseInt(request.getParameter("analytical_ability"));}
		if(request.getParameter("business_knowledge")!="")
			{business_knowledge=Integer.parseInt(request.getParameter("business_knowledge"));}
		if(request.getParameter("innovation")!=null)
			{innovation=Integer.parseInt(request.getParameter("innovation"));}
		if(request.getParameter("team_building")!="")
			{team_building=Integer.parseInt(request.getParameter("team_building"));}
		if(request.getParameter("leadership")!="")
			{leadership=Integer.parseInt(request.getParameter("leadership"));}
		int total_rating=Integer.parseInt(request.getParameter("total_rating"));
		int overall_marks=Integer.parseInt(request.getParameter("overall_marks"));
		Connection con=null;
		Statement stm=null;
		PrintWriter out=response.getWriter();
		try {
			con=connection.getConnection();
			stm=con.createStatement();
			int i=stm.executeUpdate("insert into t_irctc_mgr_competency(COST_CONSIOUSNESS,QUALITY_CONSIOUSNESS,ORG_RES_ADM_ABILITY,SAFETY_HEALTH_CONSI,EFFECTIVE_COMMUNICATION,SYSTEMATIC_TA_ABILITY,BUSINESS_ENV_KNOWLEDGE,INNOVATION_CREATIVITY,TEAM_BUILD_SKILLS,INSPIRE_LEADERSHIP,SUBMIT_DATE,TOTAL_RATING,TOTAL_MARKS) values("+cost_consciousness+","+quality_consciousness+","+resource_management+","+safety_health+","+effective_communication+","+analytical_ability+","+business_knowledge+","+innovation+","+team_building+","+leadership+",now(),"+total_rating+","+overall_marks+");");
			if(i==1) {
				response.sendRedirect("5.jsp");
			}
			connection.dbClose(null, stm, con);
		}catch(Exception e) {
			out.print(e);
		}
		out.close();
	}

}
