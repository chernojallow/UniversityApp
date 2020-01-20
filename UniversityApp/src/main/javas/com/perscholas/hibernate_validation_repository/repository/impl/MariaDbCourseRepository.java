package com.perscholas.hibernate_validation_repository.repository.impl;


import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
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

import com.perscholas.hibernate_validation_repository.models.Course;
import com.perscholas.hibernate_validation_repository.repositoryIn.CourseRepository;



@Repository("mariaDbCourseRepository")
public class MariaDbCourseRepository implements CourseRepository {
	
	@Autowired
	private NamedParameterJdbcTemplate mariaDbJdbcTemplate;

	@Override
	public Integer createCourse(Course c) {
		Integer id = -1;

		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("courseName", c.getCourseName());
		params.addValue("roomNumber", c.getRoomNumber());
		params.addValue("building", c.getBuilding());
		String createStudentSql = "insert into case_study.course (courseName, roomNumber,building) values "
				+ "(:courseName,:roomNumber,:building)";
	
		KeyHolder keyHolder = new GeneratedKeyHolder();
		Integer createResult = mariaDbJdbcTemplate.update(createStudentSql, 
				params, keyHolder);

		if (createResult > 0) {
		
			id = keyHolder.getKey().intValue();
		}
		return id;
	}

	@Override
	public List<Course> getAllCourse() throws ClassNotFoundException, IOException, SQLException {
		String selectCourses = "SELECT * FROM case_study.course";

		List<Course> result = mariaDbJdbcTemplate.query(selectCourses, new CourseMapper());
		return result;
	}
	private final class CourseMapper implements RowMapper<Course> {
		@Override
		public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
			Course c = new Course();
			c.setCourseId(rs.getInt(1));
			c.setCourseName(rs.getString(2));
			c.setRoomNumber(rs.getString(3));
			c.setBuilding(rs.getString(4));
			return c;
		}
	}
}