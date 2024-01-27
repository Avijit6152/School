package com.school.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.school.entity.Signup;

public interface SchoolRepository extends JpaRepository<Signup, Long> {

}
