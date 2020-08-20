package com.store.model;

import org.springframework.stereotype.Service;

import javax.persistence.*;

@Entity
@Table(name = "magazine")
@Service
public class Magazine {
    @Id
    @Column(name = "magazine_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int magazine_id;

    @Column(name = "magazine_name")
    private String magazine_name;

    public Magazine() {

    }



    public int getMagazine_id() {
        return magazine_id;
    }

    public void setMagazine_id(int magazine_id) {
        this.magazine_id = magazine_id;
    }

    public String getMagazine_name() {
        return magazine_name;
    }

    public void setMagazine_name(String magazine_name) {
        this.magazine_name = magazine_name;
    }
}
