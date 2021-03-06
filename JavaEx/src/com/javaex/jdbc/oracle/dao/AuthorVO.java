package com.javaex.jdbc.oracle.dao;

// VO 객체
// - 처리 로직을 갖지 않는다
// - 순수 데이터를 가지는 객체
// - 기본생성자가 있어야 한다
// toString, equals 등은 오버라이드 하기도 한다

// 1. VO | 2. DAO<I>: 인터페이스 | 3. 실체 클래스 | 4. 테스트 앱
public class AuthorVO {
	// 필드
	private Long authorId; // VO 객체에서는 기본타입 대신 Wrapper 사용
	private String authorName;
	private String authorDesc;
	
	// 생성자 - 기본 생성자가 필요
	public AuthorVO() {
	}
	public AuthorVO(String name, String desc) {
		authorName = name;
		authorDesc = desc;
	}
	
	public AuthorVO(Long id, String name, String desc) {
		this(name, desc); 
		authorId = id;
	}
	
	// getter & setter
	public Long getAuthorId() {
		return authorId;
	}
	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAuthorDesc() {
		return authorDesc == null ? "": authorDesc;
	}
	public void setAuthorDesc(String authorDesc) {
		this.authorDesc = authorDesc;
	}
	
	// toString
	@Override
	public String toString() {
		return "AuthorVO [authorId=" + authorId + ", authorName=" + authorName + ", authorDesc=" + authorDesc + "]";
	}
	
	
	


}
