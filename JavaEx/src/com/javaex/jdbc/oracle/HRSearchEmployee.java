package com.javaex.jdbc.oracle;

import java.util.Scanner;
import java.sql.*;

// 실습2: 사원 검색 프로그램
// 클래스 Scanner를 사용하여 사원 이름을 입력 받아 사원 정보를 검색하는 프로그램을 작성해 봅시다
// - 부분 이름 검색이 가능해야 합니다
// - 성, 이름 컬럼에 대해 OR 검색이 되어야 합니다
// - 출력 사원 정보는 이름 성, Email, 전화번호, 입사일입니다
// - HRSearchEmployees 프로젝트를 만들고 HRSearchEmployee 클래스에서 실행되어야 합니다

public class HRSearchEmployee {
	private static String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		System.out.print("검색어:");
		String keyword = scanner.next();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "HR", "hr");
			String sql = "SELECT first_name || ' ' || last_name as name, " +
					" email, phone_number, hire_date FROM employees " +
					" WHERE lower(first_name) LIKE '%" + keyword.toLowerCase() + "%' OR " +
					" lower(last_name) LIKE '%" + keyword.toLowerCase() + "%'";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				String name = rs.getString("name");
				String email = rs.getString("email");
				String phoneNumber = rs.getString("phone_number");
				String hireDate = rs.getString("hire_date");
				
				System.out.printf("%s: %s, %s, %s%n",
						name, email, phoneNumber, hireDate);
			}
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		} catch (SQLException e) {
			System.err.println("SQLError!");
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		scanner.close();
	}

}