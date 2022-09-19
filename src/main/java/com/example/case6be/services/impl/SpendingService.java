package com.example.case6be.services.impl;

import com.example.case6be.models.AppUser;
import com.example.case6be.models.Spending;
import com.example.case6be.models.SumSpending;
import com.example.case6be.repositorys.ISpendingRepo;
import com.example.case6be.services.ISpendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public class SpendingService implements ISpendingService {
    @Autowired
    ISpendingRepo iSpendingRepo;


    @Override
    public List<Spending> finByiduser(int id) {
        return iSpendingRepo.checknamespendingbyid(id);
    }

    @Override
    public Spending save(Spending spending) {
        return iSpendingRepo.save(spending);
    }

    @Override
    public void delete(int id) {
        iSpendingRepo.deleteById(id);
    }

    @Override
    public SumSpending count(long id) {
        return iSpendingRepo.countByname(id);
    }

    @Override
    public List<Spending> findByDay(long id, java.sql.Date day1, Date day2) {
        return iSpendingRepo.findByDay(id,day1,day2);
    }

    @Override
    public List<Spending> finByDetail(long id, String namespending) {
        return iSpendingRepo.findByDetail(id,namespending);
    }
}
