package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Member;
import com.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService {
@Autowired
MemberRepository repo;

	@Override
	public List<Member> getAllMembers() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void saveMember(Member member) {
		// TODO Auto-generated method stub
		repo.save(member);
	}

}
