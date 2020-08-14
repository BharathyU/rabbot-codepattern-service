package com.ibm.hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ibm.hello.entity.JobProfileDetails;


public interface JobProfileRepository extends JpaRepository<JobProfileDetails, Long> {

}
