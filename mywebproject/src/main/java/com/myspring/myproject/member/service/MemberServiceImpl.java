package com.myspring.myproject.member.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.myspring.myproject.member.dao.MemberDAO;
import com.myspring.myproject.member.vo.MemberVO;

// https://jayviii.tistory.com/21 ����.

@Service("memberService")
@Transactional(propagation = Propagation.REQUIRED)  // Ʈ������� ���񽺿��� ó��. https://devlog-wjdrbs96.tistory.com/424 Ʈ����� ����
public class MemberServiceImpl implements MemberService {
	@Autowired
	private MemberDAO memberDAO; 
	
	@Override
	public MemberVO login(Map loginMap) throws Exception {
		return memberDAO.login(loginMap);
	}
	
	@Override
	public List MemberList()
	{
		List memberList = memberDAO.SelectmemberList();
		return memberList;
	}
	
	
	
}
