package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.RepositoryDefinition;
import org.springframework.stereotype.Repository;

import com.model.Task;


@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {

}
