package com.codeclan.example.folders_and_files_homework.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="folder")
public class Folder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "titles")
    private String title;
    @OneToMany(mappedBy = "folder")
    private List<File> files;
    @ManyToOne
    @JoinColumn(name = "person_id", nullable = false)
    private Person person;

    public Folder() {
    }

    public Folder(String title, List<File> files, Person person) {
        this.title = title;
        this.files = files;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
