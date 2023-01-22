package com.example.producerdemo.controller;

import com.example.producerdemo.pojo.Producer;
import com.example.producerdemo.repository.ProducerRepository;
import com.example.producerdemo.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/userinfo")
public class ProducerController {
    private ProducerService producerService;

    @Autowired
    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping
    public ResponseEntity<List<Producer>> getAllUser(){
        return ResponseEntity.ok().body(producerService.getAll());
    }

    @PostMapping
    public ResponseEntity<Producer> addUser(@RequestBody Producer p){
        return ResponseEntity.ok().body(producerService.insert(p));
    }
}
