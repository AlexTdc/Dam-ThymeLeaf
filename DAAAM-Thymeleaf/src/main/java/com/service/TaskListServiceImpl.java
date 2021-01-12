package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.TaskList;
import com.repository.TaskListRepository;
@Service
public class TaskListServiceImpl implements TaskListService{
@Autowired
TaskListRepository taskListRepository;
	
	@Override
	public List<TaskList> getAllTaskLists() {
		// TODO Auto-generated method stub
		return taskListRepository.findAll();
	}

	@Override
	public void saveTaskList(TaskList taskList) {
		// TODO Auto-generated method stub
		taskListRepository.save(taskList);
	}

}
