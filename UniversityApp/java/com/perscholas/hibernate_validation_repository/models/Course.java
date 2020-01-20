package com.perscholas.hibernate_validation_repository.models;

import java.sql.Date;
import java.sql.Timestamp;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//import java.util.Date;


public class Course { 
    
	
	@Id
	@GeneratedValue
    int coursId;
    
    @Size(min = 5, max = 25, message = "Name must be between 5 and 25 characters long.")
    @NotBlank(message = "CourseName is required.")
    private String courseName;
    
    @NotBlank(message = "RoomNumber is required.")
    private String roomNumber;
//    Date  time;
    
    @Size(min = 5, max = 25, message = "Name must be between 5 and 25 characters long.")
    @NotBlank(message = "Building is required.")
    private String building;


    public int getCourseId() {
        return coursId;
    }

    public void setCourseId(int coursId) {
        this.coursId = coursId;
    }

  

  


//    public Date getTime() {
//        return time;
//    }

//    public void setTime(Date time) {
//        this.time = time;
//    }

    public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public int getCoursId() {
		return coursId;
	}

	public void setCoursId(int coursId) {
		this.coursId = coursId;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }
   
    
}