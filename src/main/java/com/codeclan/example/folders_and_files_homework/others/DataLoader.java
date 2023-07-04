package com.codeclan.example.folders_and_files_homework.others;

import com.codeclan.example.folders_and_files_homework.models.File;
import com.codeclan.example.folders_and_files_homework.repository.FileRepository;
import com.codeclan.example.folders_and_files_homework.repository.FolderRepository;
import com.codeclan.example.folders_and_files_homework.models.Person;
import com.codeclan.example.folders_and_files_homework.models.Folder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import com.codeclan.example.folders_and_files_homework.repository.PersonRepository;

import java.util.ArrayList;

@Profile("!test")
@Component //Comment this out if you do not to run the data loader.
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRepository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    PersonRepository personRepository;


    File file;
    Folder folder;
    Person person;
    ArrayList<File> files;
    ArrayList<Folder> folders;

    public DataLoader() {

    }

    public void run(ApplicationArguments args) {
        File file = new File("index", "html", 10, folder);
        files.add(file);
        Folder folder = new Folder("Test", files, person);
        folders.add(folder);
        Person person = new Person("Ben", folders);
        fileRepository.save(file);
        folderRepository.save(folder);
        personRepository.save(person);


    }
}
