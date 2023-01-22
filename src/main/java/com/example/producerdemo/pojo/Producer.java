package com.example.producerdemo.pojo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = true)
    private String first_name;

    @Column(nullable = true)
    private  String last_name;

    @Column
    private String middle_name;

    @Temporal(TemporalType.DATE)
    @Column(nullable = true)
    private Date dob;

}