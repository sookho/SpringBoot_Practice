package com.example.producerdemo.service;

import com.example.producerdemo.pojo.Producer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProducerService {
    List<Producer> getAll();
    Producer insert(Producer p);
}
