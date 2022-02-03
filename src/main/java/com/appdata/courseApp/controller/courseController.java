package com.appdata.courseApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.appdata.courseApp.model.courseModel;
import com.appdata.courseApp.service.courseService;
import java.util.List;

@RestController
@CrossOrigin
public class courseController {
	
	@Autowired
	courseService courseService;

	@GetMapping("/courses")
	public List<courseModel> getCourse()
	{
		return courseService.getCourse();
	}
	@PostMapping("/addData")
	public courseModel addCourse(@RequestBody courseModel courseModel)
	{
		return courseService.addCourse(courseModel);
	}
	
	@GetMapping("/getData/{id}")
	public courseModel getCourse(@PathVariable long id)
	{
		return courseService.getCourse(id);
	}
	
	@PutMapping("/updateData")
	public courseModel updateCourse(@RequestBody courseModel courseModel)
	{
		return courseService.updateCourse(courseModel);
	}
	
	@DeleteMapping("/deleteData/{id}")
	public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String id)
	{
		try
		{
			this.courseService.deleteCourse(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch (Exception e) {
		return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
