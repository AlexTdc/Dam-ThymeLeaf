package com.service;

import java.util.List;

import com.model.Board;
import com.model.Task;

public interface TaskService {

	List<Task>getAllTasks();
	void saveTask(Task task);
	
}
