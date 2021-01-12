package com.service;

import java.util.List;

import com.model.Subtask;

public interface SubtaskService {
	List<Subtask>getAllSubtasks();
	void saveSubtask(Subtask subtask);
}
