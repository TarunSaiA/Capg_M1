package day6_mar14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.OracleDriver;

public class GetStudents {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new OracleDriver());
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "tarun", "tarun66");
		System.out.println("connected sucessfully");
		System.out.println();
		
		String qry = "select * from student";
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(qry);
		ResultSetMetaData rsmd = rs.getMetaData();
		
		for(int i=1;i<=rsmd.getColumnCount();i++) {
			System.out.print(rsmd.getColumnName(i)+"   ");
		}
		
		System.out.println("\n-------------------------------");
		while(rs.next())
			System.out.println(rs.getInt(1)+"      "+rs.getString("stdname")+"      "+rs.getInt(3)+"       "+rs.getInt(4));
		System.out.println();
		System.out.println("Details fetched");
		

	}

}
