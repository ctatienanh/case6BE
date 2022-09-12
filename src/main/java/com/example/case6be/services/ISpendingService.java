package com.example.case6be.services;

import com.example.case6be.models.Spending;
import com.example.case6be.models.SumSpending;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.sql.Date;
import java.util.List;

public interface ISpendingService {
    List<Spending> findAll(long id);

    Spending save(Spending spending);

    void delete(int id);

    SumSpending count(long id);

    List<Spending> findByDay(long id, java.sql.Date day1, Date day2);


}
