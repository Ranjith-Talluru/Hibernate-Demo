package com.ranjith.hibernateDemo.entity;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="Users", schema = "public")
public class User {
	
	@Column(name="FIRSTNAME")
	private String fistName;
	
	@Column(name="LASTNAME")
	private String lastName;
	
	@Id
	@Column(name="EMAILID")
	private String emailId;
	
	@Column(name="PASSWORD")
	private String password;
	
	@Column(name="CRAETEDDATE")
	private Timestamp createdDate;
	
	@Column(name="UPDATEDDATE")
	private Timestamp updatedDate;
}
