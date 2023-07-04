package com.codeclan.example.folders_and_files_homework.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="people")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "names")
    private String name;
    @OneToMany(mappedBy = "person")
    private List<Folder> folders;

    public Person() {
    }

    public Person(String name, List<Folder> folders) {
        this.name = name;
        this.folders = folders;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Folder> getFolders() {
        return folders;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }
}
