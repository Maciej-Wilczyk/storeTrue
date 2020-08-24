package com.store.controller;


import com.store.model.Magazine;

import com.store.model.Product;
import com.store.repository.MagazineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class MagazineController {



    public MagazineController() {

    }

    @Autowired
    MagazineRepository magazineRepository;


    @GetMapping("/a")
    public ResponseEntity<String> getA() {
        return new ResponseEntity<String>("aa",HttpStatus.OK);
    }

    @GetMapping("/magazine")
    public List<Magazine> getMagazine()
    {
        return this.magazineRepository.findAll();
    }


}
