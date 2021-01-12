package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.model.Subtask;

@Repository
public interface SubTaskRepository extends JpaRepository<Subtask, Integer>{

}
