package com.appdata.courseApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appdata.courseApp.model.courseModel;

//this is used to save data
@Repository
public interface courseRepository extends JpaRepository<courseModel, Long> {


}
