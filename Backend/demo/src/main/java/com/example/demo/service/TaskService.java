package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Task;
import com.example.demo.repositoy.TaskRepository;



@Service

public class TaskService {

	@Autowired
	private TaskRepository repository;
	
   

	public Task createTask(Task task) {
		// TODO Auto-generated method stub
		return repository.save(Task); 
	}
	
}
