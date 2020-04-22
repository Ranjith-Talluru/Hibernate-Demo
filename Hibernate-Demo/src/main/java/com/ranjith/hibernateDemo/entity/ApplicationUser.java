package com.ranjith.hibernateDemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "JWT_USER", schema = "public")
public class ApplicationUser {

	@Id
	@Column(name = "USERNAME")
	private String username;

	@Column(name = "PASSWORD")
	private String password;

}
