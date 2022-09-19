package com.example.case6be.services;

import com.example.case6be.models.AddUser;

import java.util.List;

public interface IaddUserService {
    void save(AddUser addUser);

    List<AddUser> finallbyid(long id);
    void delete(long id);


}
