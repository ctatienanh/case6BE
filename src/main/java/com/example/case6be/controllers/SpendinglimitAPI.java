package com.example.case6be.controllers;

import com.example.case6be.models.SpendingLimit;
import com.example.case6be.services.IspendingLimitservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/spendinglimit")
public class SpendinglimitAPI {
    @Autowired
    IspendingLimitservice ispendingLimitservice;


    @PostMapping
    public void save(@RequestBody SpendingLimit spendingLimit) {
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        spendingLimit.setDate1(date);
        ispendingLimitservice.save(spendingLimit);
    }

    @PostMapping("/edit")
    public void edit(@RequestBody SpendingLimit spendingLimit) {
        ispendingLimitservice.save(spendingLimit);
    }


    @GetMapping("/{id}")
    public List<SpendingLimit> finall(@PathVariable long id) {
        return ispendingLimitservice.fillallbyid(id);
    }

    @GetMapping("/delete/{id}")
    public void delete(@PathVariable long id){
        ispendingLimitservice.dalete(id);
    }
}
