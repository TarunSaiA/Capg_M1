package day6_mar14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import oracle.jdbc.OracleDriver;

public class UpdateEx {

	public static void main(String[] args) throws SQLException {
		DriverManager.registerDriver(new OracleDriver());
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "tarun", "tarun66");
		System.out.println("connected sucessfully");
		
		String qry = "update student set sub1=?,sub2=? where regno=?";
		PreparedStatement pst = conn.prepareStatement(qry);
		pst.setInt(1, 73);
		pst.setInt(2, 56);
		pst.setInt(3, 104);
		pst.executeUpdate();
		System.out.println("updated");
	}

}
