package com.store;



import com.store.model.Magazine;
import com.store.repository.MagazineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EntityScan(basePackages = {"model"})
//@ComponentScan(basePackageClasses = {repository.MagazineRepository.class})
public class StoreApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(StoreApplication.class, args);
    }

    @Autowired
    MagazineRepository magazineRepository;
    @Override
    public void run(String... args) throws Exception {
        this.magazineRepository.save(new Magazine("Fruit"));
        this.magazineRepository.save(new Magazine("jbhda"));
        this.magazineRepository.save(new Magazine("bsdfis"));
    }
}
