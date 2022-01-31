package com.cdac.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

}
