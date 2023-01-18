package com.app.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.NewEnquiry;



public interface NewEnquiryRepo  extends JpaRepository<NewEnquiry ,Integer>{

}
