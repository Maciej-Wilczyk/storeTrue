package controller;


import model.Magazine;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class MagazineController {

    private List<Magazine> magazines;

    public MagazineController() {
        magazines = new ArrayList<>();
        magazines.add(new Magazine("owoce"));
    }

    @GetMapping("/magazine")
    public List<Magazine> getMagazine() {
        return magazines;
    }

    @GetMapping("/a")
    public String getA() {
        return "aaa";
    }

//    @GetMapping("/magazine")
//    public List<Magazine> getMagazine()
//    {
//        return this.magazineRepository.findAll();
//    }
}
