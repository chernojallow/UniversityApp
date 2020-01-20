package com.perscholas.hibernate_validation_repository.repositoryIn;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.perscholas.hibernate_validation_repository.models.CareerService;


public interface CareerServiceRepository {
	Integer createCareerService(CareerService careerS);
	List<CareerService> getAllStudents() throws ClassNotFoundException, IOException, SQLException;

}