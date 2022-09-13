package com.example.case6be.models;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class AddUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private AppUser user_sv;
    @ManyToOne
    private AppUser user_ph;
}
