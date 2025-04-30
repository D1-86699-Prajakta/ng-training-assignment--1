package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Task;
import com.example.demo.service.TaskService;

@RestController
@RequestMapping("/api")
public class TaskController {

	@Autowired
	private TaskService service;
	
	@PostMapping("/task")
	public Task creatingTask(@RequestParam Task task)
	{
		return service.createTask(task);
	}
}
