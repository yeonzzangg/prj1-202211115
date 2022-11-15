package com.study.service.board;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.study.domain.board.ReplyDto;
import com.study.mapper.board.ReplyMapper;

@Service
public class ReplyService {
	
	@Autowired
	private ReplyMapper mapper;

	public int addReply(ReplyDto reply) {
		return mapper.insert(reply);
	}

	public List<ReplyDto> listReplyByBoardId(int boardId) {
		return mapper.selectReplyByBoardId(boardId);
	}

	public int removeById(int id) {
		return mapper.deleteById(id);
	}

	public ReplyDto getById(int id) {
		return mapper.selectById(id);
	}

	public int modify(ReplyDto reply) {
		return mapper.update(reply);
	}

}





