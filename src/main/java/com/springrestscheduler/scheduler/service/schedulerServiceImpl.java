package com.springrestscheduler.scheduler.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrestscheduler.scheduler.Dao.SchedulerDao;
import com.springrestscheduler.scheduler.entities.Students;

@Service
public class schedulerServiceImpl implements schedulerService {


	@Autowired
	private SchedulerDao schedulerDao;
	
	public schedulerServiceImpl() {
		
	}
	
	@Override
	public List<Students> getStudents(){
		return schedulerDao.findAll();
	}
	
	@Override
	public Students AddStudent(Students students) {
		schedulerDao.save(students);
		return students;
	}
	 
}
