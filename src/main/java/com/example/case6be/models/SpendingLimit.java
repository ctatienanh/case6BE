package com.example.case6be.models;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
public class SpendingLimit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date1;
    private Date date2;
    @ManyToOne
    private AppUser user;
    @ManyToOne
    private Spending spending;
    private long moneylimit;
}
