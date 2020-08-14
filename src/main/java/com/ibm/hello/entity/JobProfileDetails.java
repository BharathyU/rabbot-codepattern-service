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
	
	@Column(name = "DATE_POSTED")
	private LocalDate datePosted;

	@Column(name = "INTERVIEW_ID")
	private String interviewId;

	@Column(name = "JOB_POSITION")
	private String jobPosition;

	@Column(name = "JOB_LOCATION")
	private String jobLocation;

	@Column(name = "EXPERIENCE_REQ")
	private String experienceReq;
	
	@Column(name = "COMPANY")
	private String company;

	@Column(name = "STATUS")
	private String status;

}
