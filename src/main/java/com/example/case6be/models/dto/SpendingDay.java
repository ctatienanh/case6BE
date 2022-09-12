package com.example.case6be.models.dto;

import lombok.Data;

import java.sql.Date;
@Data
public class SpendingDay {
    private long idUser;
    private Date day1;
    private Date day2;
}
