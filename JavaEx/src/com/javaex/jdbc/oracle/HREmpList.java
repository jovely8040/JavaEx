package com.javaex.jdbc.oracle;

import java.sql.*;

// 실습1
// hr/hr 계정의 사원 이름과 매니저 이름을 함께 출력해 봅시다
// - 사원 이름은 이름 성 순으로 표기합니다
// - 정렬은 사원 이름 내림차순입니다
// - HREmpList 프로젝트를 만들고 HREmpList 클래스에서 실행되어야 합니다

public class HREmpList {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager
					.getConnection(dburl, "hr", "hr");
			String sql = "SELECT emp.first_name || ' ' || emp.last_name as name, " +
					" mgr.first_name || ' ' || mgr.last_name mgr_name " +
					" FROM employees emp, employees mgr " +
					" WHERE emp.manager_id = mgr.employee_id " +
					" ORDER BY name DESC";
			stmt = conn.createStatement();
			//	질의 수행
			rs = stmt.executeQuery(sql);

			while(rs.next()) {
				String name = rs.getString("name");
				String mgrName = rs.getString("mgr_name");

				System.out.printf("Name: %s, Manager: %s%n", name, mgrName);
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
	}

}