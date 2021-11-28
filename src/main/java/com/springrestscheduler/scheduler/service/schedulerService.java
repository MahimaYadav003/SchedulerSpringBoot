package com.springrestscheduler.scheduler.service;

import java.util.List;

import com.springrestscheduler.scheduler.entities.Students;
public interface schedulerService {

	public List<Students> getStudents();

	public Students AddStudent(Students students);
	
}
