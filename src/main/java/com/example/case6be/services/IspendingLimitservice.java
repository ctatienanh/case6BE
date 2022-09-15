package com.example.case6be.services;

import com.example.case6be.models.SpendingLimit;

import java.util.List;

public interface IspendingLimitservice {
    void save(SpendingLimit spendingLimit);
    List<SpendingLimit> fillallbyid(long id);
}
