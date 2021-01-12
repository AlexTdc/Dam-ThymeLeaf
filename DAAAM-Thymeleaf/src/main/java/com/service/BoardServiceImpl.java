package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Board;
import com.repository.BoardRepository;
@Service
public class BoardServiceImpl implements BoardService {

	
	@Autowired
	private BoardRepository boardRepository;
	
	@Override
	public List<Board> getAllBoards() {
		// TODO Auto-generated method stub
		return boardRepository.findAll();
	}

	@Override
	public void saveBoard(Board board) {
		// TODO Auto-generated method stub
		this.boardRepository.save(board);
	}
	
	

}
