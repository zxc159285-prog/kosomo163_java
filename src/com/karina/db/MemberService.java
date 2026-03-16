package com.karina.db;

public class MemberService {

	public static void main(String[] args) {
		String id = "admin";
		String pw = "1234";
		String name = "홍길동";
		Member member = new Member(id, pw, name);
		member.id=id;
		member.pw=pw;
		member.name=name;
		
		MemberDAO dao = new MemberDAO();
		dao.addMember(member);
	}

}
