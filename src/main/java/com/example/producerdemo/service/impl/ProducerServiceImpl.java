package com.example.producerdemo.service.impl;

import com.example.producerdemo.pojo.Producer;
import com.example.producerdemo.repository.ProducerRepository;
import com.example.producerdemo.service.ProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProducerServiceImpl implements ProducerService {
    private ProducerRepository producerRepository;

    @Autowired
    public ProducerServiceImpl(ProducerRepository producerRepository) {
        this.producerRepository = producerRepository;
    }

    @Override
    public List<Producer> getAll() {
        return producerRepository.findAll();
    }

    @Override
    public Producer insert(Producer p){
        return producerRepository.save(p);
    }
}
