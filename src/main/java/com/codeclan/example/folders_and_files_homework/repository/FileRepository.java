package com.codeclan.example.folders_and_files_homework.repository;

import com.codeclan.example.folders_and_files_homework.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
