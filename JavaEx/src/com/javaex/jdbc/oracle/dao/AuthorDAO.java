package com.javaex.jdbc.oracle.dao;

import java.util.List;
// 인터페이스 설계 장점:
// 설계도가 있으므로 메인로직 개발자가 로직이 수행되기 위해서는 이런 정보가 필요하구나~하고 확인 가능함
public interface AuthorDAO {
	public List<AuthorVO> getList(); // 전체 목록
	public List<AuthorVO> search(String keyword); // 검색 목록
	public AuthorVO get(Long id); // 저장 정보 확인
	public boolean insert(AuthorVO vo); // 삽입
	public boolean update(AuthorVO vo); // 갱신
	public boolean delete(Long id); // 삭제
	
}
