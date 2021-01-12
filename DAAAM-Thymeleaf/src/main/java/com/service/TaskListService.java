package com.service;

import java.util.List;


import com.model.TaskList;

public interface TaskListService {

	List<TaskList>getAllTaskLists();
	void saveTaskList(TaskList taskList);
	
}
