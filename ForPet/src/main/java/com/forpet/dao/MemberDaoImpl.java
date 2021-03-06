package com.forpet.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.forpet.model.vo.Member;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Autowired
	private SqlSessionTemplate session;

	@Override
	public Member selectOne(Member m) {
		return session.selectOne("member.selectOne",m);
	}

	@Override
	public int insertMember(Member m) {
		// TODO Auto-generated method stub
		return session.insert("member.insertMember",m);
	}
	
	
	
	
}
