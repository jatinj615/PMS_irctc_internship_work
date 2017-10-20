package pmsConnectivity;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Connections {
	public java.sql.Connection getConnection() throws Exception{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/PMS","root","1234");
			return con;
		}catch(Exception e) {
			System.out.println(e);
			throw new Exception("Server Is Down");
		}
}
public void dbClose(ResultSet rs,Statement stm,Connection con) {
	try{
		if (rs != null) {
			rs.close();
		}
		if (stm != null) {
			stm.close();
		}
		if (con != null) {
			con.close();
		}
	}
	catch(SQLException e) { e.printStackTrace();}
}
public void dbClose(ResultSet rs,PreparedStatement ps,Connection con) {
	try{
		if (rs != null) {
			rs.close();
		}
		if (ps != null) {
			ps.close();
		}
		if (con != null) {
			con.close();
		}
	}
	catch(SQLException e) { e.printStackTrace();}
}
}
