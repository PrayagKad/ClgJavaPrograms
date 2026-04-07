package com.app.hbm;

import jakarta.persistence.*;

@Entity
@Table
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int phnid;

    private Long number;

    @OneToOne(mappedBy = "phone")
    private Person person; // mapped to table person using column phone as it is common in both tables




}