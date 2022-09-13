package com.example.case6be.services.impl;

import com.example.case6be.models.AddUser;
import com.example.case6be.repositorys.IadduserRepo;
import com.example.case6be.services.IaddUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdduserService implements IaddUserService {
    @Autowired
    IadduserRepo iadduserRepo;

    @Override
    public void save(AddUser addUser) {
        iadduserRepo.save(addUser);
    }

    @Override
    public List<AddUser> finallbyid(long id) {
        return iadduserRepo.findAllByid(id);
    }
}
