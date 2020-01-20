package com.perscholas.hibernate_validation_repository.repositoryIn;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.perscholas.hibernate_validation_repository.models.Register;

public interface UserRepository {


	Integer addUser(Register user);
	Register findUserByUsername(Register input);
//	Integer addUserTest(RegisterTest userTest);
	List<Register> getAllByUserId(Integer userId) throws ClassNotFoundException, IOException, SQLException;

}
