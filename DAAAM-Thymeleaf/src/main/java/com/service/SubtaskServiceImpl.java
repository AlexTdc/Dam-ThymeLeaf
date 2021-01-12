package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Subtask;
import com.repository.SubTaskRepository;

@Service
public class SubtaskServiceImpl implements SubtaskService{

	@Autowired
	SubTaskRepository repo;
	@Override
	public List<Subtask> getAllSubtasks() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void saveSubtask(Subtask subtask) {
		// TODO Auto-generated method stub
		repo.save(subtask);
	}

}
