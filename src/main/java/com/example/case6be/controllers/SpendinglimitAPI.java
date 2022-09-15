package com.example.case6be.controllers;

import com.example.case6be.models.SpendingLimit;
import com.example.case6be.models.dto.SpendingDay;
import com.example.case6be.services.IspendingLimitservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/spendinglimit")
public class SpendinglimitAPI {
    @Autowired
    IspendingLimitservice ispendingLimitservice;


    @PostMapping
    public  void save(@RequestBody SpendingDay spendingDay ){
        System.out.println(spendingDay);
    }

}
