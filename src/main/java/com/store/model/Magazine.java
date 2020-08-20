package com.store.model;

import org.springframework.stereotype.Service;

import javax.persistence.*;

@Entity
@Table(name = "magazine")
@Service
public class Magazine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name")
    private String nameM;

    public Magazine() {

    }

    public Magazine(String name) {
        this.nameM = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNameM() {
        return nameM;
    }

    public void setNameM(String name) {
        this.nameM = name;
    }
}
