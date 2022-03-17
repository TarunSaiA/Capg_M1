package day6_mar14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class DeleteEx {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new OracleDriver());
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "tarun", "tarun66");
		System.out.println("connected sucessfully");
		
		String qry = "delete from student where regno=104";
		Statement st = conn.createStatement();
		st.execute(qry);
		System.out.println("deleted successfully");

	}

}
