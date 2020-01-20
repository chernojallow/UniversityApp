package com.perscholas.hibernate_validation_repository.repositoryIn;



import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.perscholas.hibernate_validation_repository.models.Course;

public interface CourseRepository {
	Integer createCourse(Course c);
	List<Course> getAllCourse() throws ClassNotFoundException, IOException, SQLException;

}