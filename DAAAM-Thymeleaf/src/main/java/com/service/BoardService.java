package com.service;

import java.util.List;

import com.model.Board;

public interface BoardService {

	List<Board>getAllBoards();
	void saveBoard(Board board);
}
