package com.example.case6be.models;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Data
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private AppUser user_sv;
    @ManyToOne
    private AppUser user_ph ;
    private String content;
    private Date date;
    private Time time;
    private boolean statusConfirm=false;
    private long money;

}
