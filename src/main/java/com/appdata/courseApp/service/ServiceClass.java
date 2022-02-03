package com.appdata.courseApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.appdata.courseApp.model.courseModel;
import com.appdata.courseApp.repository.courseRepository;

@Service
public class ServiceClass implements courseService {

	@Autowired
	private courseRepository courseRepository;
	
	@Override
	public List<courseModel> getCourse() {
		return courseRepository.findAll();
	}

	@Override
	public courseModel addCourse(courseModel courseModel) {
		return courseRepository.save(courseModel);
	}

	@Override
	public courseModel getCourse(long id) {
		return courseRepository.getOne(id);
	}

	@Override
	public courseModel updateCourse(courseModel courseModel) {
		return courseRepository.save(courseModel);
	}

	@Override
	public void deleteCourse(long parseLong) {
		courseModel cm = courseRepository.getOne(parseLong);
		courseRepository.delete(cm);

	}

}
