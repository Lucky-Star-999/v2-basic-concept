package com.example.v2basicconcept.repository;

import com.example.v2basicconcept.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
