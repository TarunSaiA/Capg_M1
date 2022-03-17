package day6_mar14_jdbc;

import java.sql.*;
import java.util.Scanner;

import oracle.jdbc.OracleDriver;

public class TestDb {
	public static void main(String[] args) throws SQLException {
		
		Scanner sc = new Scanner(System.in);
		/*
		 * int a = sc.nextInt(); String b = sc.nextLine(); sc.nextLine(); int c =
		 * sc.nextInt(); int d = sc.nextInt();
		 */
		
		DriverManager.registerDriver(new OracleDriver());
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = DriverManager.getConnection(url, "tarun", "tarun66");
		System.out.println("connected sucessfully");
		
		/*
		 * Statement st = conn.createStatement(); String qry1 =
		 * "insert into student values(101,'tarun',60,70)"; st.executeUpdate(qry1);
		 * System.out.println("inserted");
		 */
		
		String qry2 = "insert into student values(?,?,?,?)";
		PreparedStatement pst = conn.prepareStatement(qry2);
		/*
		 * pst.setInt(1, 102); pst.setString(2, "lucky"); pst.setInt(3, 45);
		 * pst.setInt(4, 55); pst.executeUpdate();
		 */
		
		System.out.println("enter regno");
		pst.setInt(1,sc.nextInt());
		System.out.println("enter name");
		pst.setString(2, sc.next());
		System.out.println("enter sub1 marks");
		pst.setInt(3, sc.nextInt());
		System.out.println("enter sub2 marks");
		pst.setInt(4, sc.nextInt());
		pst.executeUpdate();
		System.out.println("inserted");
	}
}
