package pmsConnectivity;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.io.*;
/**
 * Servlet implementation class Form_1
 */
@WebServlet("/Form_1")
public class Form_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connections connection=new Connections();
		String[] KRA = new String[9];
		int[] target = new int[9];
		int[] max_marks = new int[9];
		int i=1;
		while(i<=8 && request.getParameter("KRA["+i+"]")!="" && request.getParameter("target["+i+"]") != "" && request.getParameter("max_marks["+i+"]")!=""){
			 KRA[i]=request.getParameter("KRA["+i+"]");
			 target[i]=Integer.parseInt(request.getParameter("target["+i+"]"));
			 max_marks[i]=Integer.parseInt(request.getParameter("max_marks["+i+"]"));
			 i++;
		}
		i=1;
		Connection con=null;
		Statement stm=null;
		PrintWriter out=response.getWriter();	
			try {
				con=connection.getConnection();
				while(i<=8 && KRA[i]!=null) {
					stm=con.createStatement();
					stm.executeUpdate("insert into t_irctc_performance_planning(KEY_RESULT_AREA,TARGET,MAXIMUM_MARKS) values ('"+KRA[i]+"',"+target[i]+","+max_marks[i]+")");
					i++;
				}
				connection.dbClose(null, stm, con);
			}catch(Exception e) {
				out.print(e);
			}
			out.close();
	}
	}
