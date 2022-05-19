package com.example.demoFinalmaven.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository //because it is responsible for data access
public interface StudentRepository extends JpaRepository<Student, Long> {

    //SELECT * FROM student where email = ? //SQL
    //@Query("SELECT s FROM Student s WHERE s.email = ?") //JPQL
    Optional<Student> findStudentByEmail(String email);
}
