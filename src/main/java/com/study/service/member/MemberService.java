package com.study.service.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.domain.member.MemberDto;
import com.study.mapper.member.MemberMapper;

@Service
public class MemberService {
	
	@Autowired
	private MemberMapper mapper;

	public int insert(MemberDto member) {
		
		return mapper.insert(member);
	}

	public List<MemberDto> list() {
		return mapper.selectAll();
	}

	public MemberDto getById(String id) {
		return mapper.selectById(id);
	}

	public int modify(MemberDto member) {
		int cnt = 0;
		
		try {
			return mapper.update(member);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cnt; 
	}

	public int remove(String id) {
		return mapper.deleteById(id);
	}

	public MemberDto getByEmail(String email) {
		return mapper.selectByEmail(email);
	}

	public MemberDto getByNickName(String nickName) {
		return mapper.getByNickName(nickName);
	}

}






