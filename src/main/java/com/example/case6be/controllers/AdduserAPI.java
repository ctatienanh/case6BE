package com.example.case6be.controllers;

import com.example.case6be.models.AddUser;
import com.example.case6be.models.Notification;
import com.example.case6be.services.IaddUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/adduser")
public class AdduserAPI {
    @Autowired
    IaddUserService iaddUserService;

    @PostMapping
    public void adduser(@RequestBody AddUser addUser){
        iaddUserService.save(addUser);
    }

    @GetMapping("/show/{id}")
    public List<AddUser> getallbyid(@PathVariable long id){
        return iaddUserService.finallbyid(id);
    }


}
