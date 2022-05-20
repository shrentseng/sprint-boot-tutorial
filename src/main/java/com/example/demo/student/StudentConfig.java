package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student shren = new Student(
                    1L,
                    "Shren",
                    "lspss94076@gmail.com",
                    LocalDate.of(1998, Month.NOVEMBER, 9)
            );

            Student alex = new Student(
                    2L,
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1979, Month.MAY, 5)
            );

            repository.saveAll(List.of(shren, alex));
        };
    }
}
