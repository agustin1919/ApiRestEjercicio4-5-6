package com.example.SpringBoot_s456.controllers;

import com.example.SpringBoot_s456.entities.Laptop;
import com.example.SpringBoot_s456.repositories.LaptopRepository;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LaptopController {
    private LaptopRepository repository;

    public LaptopController(LaptopRepository repository){
        this.repository = repository;
    }
    @GetMapping("/api/laptop")
    public List<Laptop> findAllElements(){
        return repository.findAll();
    }
    @PostMapping("/api/laptop")
    public Laptop create(@RequestBody Laptop laptop, @RequestHeader HttpHeaders header){
        System.out.println(header.get("User-Agent"));
        return repository.save(laptop);
    }
}
