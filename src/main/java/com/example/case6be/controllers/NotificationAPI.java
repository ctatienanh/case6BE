package com.example.case6be.controllers;

import com.example.case6be.models.Notification;
import com.example.case6be.models.Spending;
import com.example.case6be.models.SumSpending;
import com.example.case6be.models.Sumnotification;
import com.example.case6be.services.InotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Time;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/notificationadd")
public class NotificationAPI {
    @Autowired
    InotificationService inotificationService;

    @PostMapping
    public Notification save(@RequestBody Notification notification){
        Time timeNow = Time.valueOf(java.time.LocalTime.now());
        notification.setTime(timeNow);
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        notification.setDate(date);
        return inotificationService.save(notification);
    }

    @GetMapping("/show/{id}")
    public List<Notification> getallbyid(@PathVariable long id){
        return inotificationService.findall(id);
    }
    @GetMapping("/showcount/{id}")
    public Sumnotification showcount(@PathVariable long id){
        return inotificationService.count(id);
    }
    @PostMapping("/editstatus")
    public Notification editstatus(@RequestBody Notification notification){
        notification.setStatusConfirm(true);
        return inotificationService.save(notification);

    }
}
