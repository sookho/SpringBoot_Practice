package com.example.restdemo1.pojo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Entity // specify this is an entity
@Table(name = "student") // mapping to the table in database
@AllArgsConstructor
public class Student {

    @Id // primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column // mapping to the table column
    private String name;

    @Column
    private String phone;

    public Student() {
    }


}
