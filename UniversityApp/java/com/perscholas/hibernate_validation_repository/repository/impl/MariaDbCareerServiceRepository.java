package com.perscholas.hibernate_validation_repository.repository.impl;


import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.perscholas.hibernate_validation_repository.models.CareerService;
import com.perscholas.hibernate_validation_repository.repositoryIn.CareerServiceRepository;

@Repository("mariaDbCareerServiceRepository")
public class MariaDbCareerServiceRepository implements CareerServiceRepository {
	
	@Autowired
	private NamedParameterJdbcTemplate mariaDbJdbcTemplate;

	@Override
	public Integer createCareerService(CareerService careerS) {
		Integer id = -1;

		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("name", careerS.getName());
		params.addValue("description", careerS.getDescription());
		params.addValue("location", careerS.getLocation());
		params.addValue("dateTime", careerS.getDateTime());
		

	
		String createStudentSql = "insert into case_study.careerService (name, description,location, dateTime) values "
				+ "(:name,:description,:location, :dateTime)";

		KeyHolder keyHolder = new GeneratedKeyHolder();
		Integer createResult = mariaDbJdbcTemplate.update(createStudentSql, 
				params, keyHolder);

		if (createResult > 0) {
	
			id = keyHolder.getKey().intValue();
		}
		return id;
	}

	
	@Override
	public List<CareerService> getAllStudents() throws ClassNotFoundException, IOException, SQLException {
		String selectCareerS = "SELECT * FROM case_study.careerService";
		List<CareerService> result = mariaDbJdbcTemplate.query(selectCareerS, new StudentMapper());
		return result;
	}
	private final class StudentMapper implements RowMapper<CareerService> {
		@Override
		public CareerService mapRow(ResultSet rs, int rowNum) throws SQLException {
			CareerService careerS = new CareerService();
			careerS.setCareerId(rs.getInt(1));
			careerS.setName(rs.getString(2));
			careerS.setDescription(rs.getString(3));
			careerS.setLocation(rs.getString(4));
			careerS.setDateTime(rs.getString(5));
			
			
			return careerS;
		}
	}
}