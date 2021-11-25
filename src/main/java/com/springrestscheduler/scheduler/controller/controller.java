package com.springrestscheduler.scheduler.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.springrestscheduler.scheduler.entities.Students;
import com.springrestscheduler.scheduler.service.schedulerService;

@CrossOrigin(origins = "https://schedulerdata.herokuapp.com/")

@RestController
@RequestMapping(value="/scheduler")
public class controller {

	@Autowired
	private schedulerService schedulerservice;
	
	@GetMapping("/students")
	public List<Students> getStudents(){
		return this.schedulerservice.getStudents();
	}
	
	@GetMapping("/students/{studentsId}")
	public Students getCourse(@PathVariable long studentsId){
		return this.schedulerservice.getStudent(studentsId);
	}
	
	@PostMapping(path="/insert",consumes="application/json")
	public Students AddCourse(@RequestBody Students students){
		return this.schedulerservice.AddStudent(students);
	}
	
	
	@PutMapping("/update")
	public Students UpdateCourse(@RequestBody Students students){
		return this.schedulerservice.UpdateStudent(students);
	}
	
//	@DeleteMapping("/delete/{Id}")
//	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable long Id){
//		return this.schedulerservice.delteCourse(Id);
//	}
}

