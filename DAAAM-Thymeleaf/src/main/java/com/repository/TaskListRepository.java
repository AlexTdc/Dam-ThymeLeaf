package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.TaskList;


@Repository
public interface TaskListRepository extends JpaRepository<TaskList, Integer>{

}
