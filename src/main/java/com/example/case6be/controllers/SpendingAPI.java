package com.example.case6be.controllers;

import com.example.case6be.models.Spending;
import com.example.case6be.models.SpendingGoal;
import com.example.case6be.models.SumSpending;
import com.example.case6be.services.ISpendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/spending")
public class SpendingAPI {
    @Autowired
    ISpendingService spendingService;
    @GetMapping("/{id}")
        public List<Spending> finByiduser(@PathVariable int id) {return  spendingService.finByiduser(id);}
    @PostMapping
    public Spending save(@RequestBody Spending spending){
        Time timeNow = Time.valueOf(java.time.LocalTime.now());
        spending.setTime(timeNow);
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        spending.setDate(date);
        return spendingService.save(spending);
    }
    @GetMapping("/showcount/{id}")
    public SumSpending showcount(@PathVariable long id){
        return spendingService.count(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id){
        spendingService.delete(id);
    }

}
