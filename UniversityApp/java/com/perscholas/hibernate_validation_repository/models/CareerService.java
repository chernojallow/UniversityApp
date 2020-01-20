package com.perscholas.hibernate_validation_repository.models;


//import java.security.Timestamp;
//import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;


//import java.util.Date;

public class CareerService {
  
@Id
@GeneratedValue
int careerId;
  
@Size(min = 5, max = 25, message = "Name must be between 5 and 25 characters long.")
@NotBlank(message = "Name is required.")
  private String name;

@Size(min = 5, max = 25, message = "Description must be between 5 and 25 characters long.")
@NotBlank(message = "Description is required.")
  private String description;

@Size(min = 5, max = 25, message = "Location must be between 5 and 25 characters long.")
@NotBlank(message = "Location is required.")
  private String location;



//@Column(name="dateTime",columnDefinition="TIMESTAMP")

//  private LocalDateTime dateTime;
//@DateTimeFormat(pattern = "dd-MM-yyyy")
 
  private String  dateTime;
	
  

	public CareerService() {};
	
	public CareerService(String name, String description, String location) {
		this.name = name;
		this.description = description;
		this.location = location;
		
	}
	
   public int getCareerId() {
       return careerId;
   }

   public void setCareerId(int careerId) {
       this.careerId = careerId;
   }

   public String getName() {
       return name;
   }

   public void setName(String name) {
       this.name = name;
   }

   public String getDescription() {
       return description;
   }

   public void setDescription(String description) {
       this.description = description;
   }


   
   public String getLocation() {
  	 return location;
   }
   
   public void setLocation(String location) {
  	 this.location = location;
   }
   

	public String getDateTime() {
	return dateTime;
}

public void setDateTime(String dateTime) {
	this.dateTime = dateTime;
}

	public String toString() {
		return "Career [careerId=" + careerId + ", name=" + name + "description=" + description + "location=" + location
				+ ", dateTime=" + dateTime  
			+ "]";
	}
	
	
	
  }