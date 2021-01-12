package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Task;
import com.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService {

	@Autowired
	TaskRepository taskRepository;
	@Override
	public List<Task> getAllTasks() {
		// TODO Auto-generated method stub
		return taskRepository.findAll();
	}

	@Override
	public void saveTask(Task task) {
		this.taskRepository.save(task);
		
	}

}
