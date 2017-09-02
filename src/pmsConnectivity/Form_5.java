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
 * Servlet implementation class Form_5
 */
@WebServlet("/Form_5")
public class Form_5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connections connection=new Connections();
		int fairness_transparency=Integer.parseInt(request.getParameter("fairness_transparency")) ;
		int ethical_behaviour=Integer.parseInt(request.getParameter("ethical_behaviour")) ;
		int discipline=Integer.parseInt(request.getParameter("discipline")) ;
		int trust=Integer.parseInt(request.getParameter("trust")) ;
		int involvement_collaboration=Integer.parseInt(request.getParameter("involvement_collaboration")) ;
		int total_ratings=Integer.parseInt(request.getParameter("total_ratings")) ;
		int overall_marks=Integer.parseInt(request.getParameter("overall_marks")) ;
		Connection con=null;
		Statement stm=null;
		PrintWriter out=response.getWriter();
		try {
			con=connection.getConnection();
			stm=con.createStatement();
			int i=stm.executeUpdate("insert into t_irctc_values(FAIRNESS_TRANSPARENCY,ETHICAL_BEHAVIOUR,DISCIPLINE,TRUST,INVOLVEMENT_COLLABORATION,SUBMIT_DATE,TOTAL_RATING,TOTAL_MARKS) values("+fairness_transparency+","+ethical_behaviour+","+discipline+","+trust+","+involvement_collaboration+",now(),"+total_ratings+","+overall_marks+",)");
			if(i==1) {
				response.sendRedirect("6.jsp");
			}
			connection.dbClose(null, stm, con);
		}catch(Exception e) {
			out.print(e);
		}
		out.close();
	}

}
