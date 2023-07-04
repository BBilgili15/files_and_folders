package com.codeclan.example.folders_and_files_homework.repository;

import com.codeclan.example.folders_and_files_homework.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
