package com.codeclan.example.folders_and_files_homework.repository;

import com.codeclan.example.folders_and_files_homework.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
