package com.example.case6be.services;

import com.example.case6be.models.SpendingGoal;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IspendingGoalService {
    Iterable<SpendingGoal> findAll();

    SpendingGoal findById(int id);


    List<SpendingGoal> finByiduser(int id);

    SpendingGoal save(SpendingGoal spendingGoal);

    void delete(int id);

    SpendingGoal findByName(long id, String name );
}
