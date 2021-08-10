package com.javaex.jdbc.oracle;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

// 실습3__pstmt: 급여 검색 프로그램 작성
// 사용자로부터 최소 급여와 최대 급여를 입력 받아 급여가 이 범위 내에 속하는
// 사원 의 정보를 출력하는 프로그램을 작성해 봅시다
// - 정렬은 salary 오름차순입니다
// - HRSalary 프로젝트의 HRSalary 클래스에서 실행되어야 합니다
// - 결과 예시
//	2000 10000
// ============================================================
//	Kevin Freeney 		3000
//	Donald Oconnell 	4000
//	Pat Fay 			90000

public class HRSalaryPstmt {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		Scanner scanner = new Scanner(System.in);

		System.out.print("최소급여:");
		int minSalary = scanner.nextInt();
		System.out.print("최대급여:");
		int maxSalary = scanner.nextInt();

		if (minSalary > maxSalary) {
			//	값을 바꾼다
			int temp = minSalary;
			minSalary = maxSalary;
			maxSalary = temp;
		}

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "hr", "hr");

			String sql = "SELECT first_name || ' ' || last_name as name, salary " +
					" FROM employees " +
					" WHERE salary BETWEEN " + minSalary + " AND " + maxSalary + 
					" ORDER BY salary";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while(rs.next()) {
				System.out.printf("%s\t%d%n", 
						rs.getString("name"), 
						rs.getInt(2));
			}
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패!");
		} catch (SQLException e) {
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
