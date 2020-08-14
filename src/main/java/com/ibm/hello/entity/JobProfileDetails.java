package com.ibm.hello.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "JOB_PROFILE_DETAILS")
public class JobProfileDetails {
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "datePosted")
	private LocalDate datePosted;

	@Column(name = "datePosted")
	private String interviewId;

	@Column(name = "datePosted")
	private String jobPosition;

	@Column(name = "datePosted")
	private String jobLocation;

	@Column(name = "datePosted")
	private String experienceReq;
	
	@Column(name = "datePosted")
	private String company;

	@Column(name = "datePosted")
	private String status;


}
