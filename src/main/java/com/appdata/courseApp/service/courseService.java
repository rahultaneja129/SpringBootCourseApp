package com.appdata.courseApp.service;

import java.util.List;

import com.appdata.courseApp.model.courseModel;

public interface courseService {
	
	public List<courseModel> getCourse();
	
	public courseModel addCourse(courseModel courseModel);
	public courseModel getCourse(long id);
	public courseModel updateCourse(courseModel courseModel);
	public void deleteCourse(long parseLong);
	

}
