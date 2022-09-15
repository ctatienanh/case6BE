package com.example.case6be.services.impl;

import com.example.case6be.models.SpendingLimit;
import com.example.case6be.repositorys.ISpendingLimitRepo;
import com.example.case6be.services.IspendingLimitservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Spendinglimitservice implements IspendingLimitservice {
    @Autowired
    ISpendingLimitRepo iSpendingLimitRepo;

    @Override
    public void save(SpendingLimit spendingLimit) {
        iSpendingLimitRepo.save(spendingLimit);
    }
}
