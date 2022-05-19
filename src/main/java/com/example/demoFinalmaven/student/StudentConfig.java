package com.example.demoFinalmaven.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository){
        return args -> {
            Student mariam =  new Student(
                    1L,
                    "Mariam",
                    "mariam@gmail.com",
                    LocalDate.of(2000, Month.APRIL, 5)
            );
            Student alex =  new Student(
                    2L,
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(2004, Month.DECEMBER, 5)
            );

            studentRepository.saveAll(
                    List.of(mariam, alex)
            );
        };
    }
}
