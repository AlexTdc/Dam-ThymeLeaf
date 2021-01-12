package com.service;

import java.util.List;

import com.model.Member;

public interface MemberService {

	List<Member>getAllMembers();
	void saveMember(Member member);
	
}
