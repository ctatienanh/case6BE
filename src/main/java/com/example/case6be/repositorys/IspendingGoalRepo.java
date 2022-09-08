package com.example.case6be.repositorys;

import com.example.case6be.models.SpendingGoal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;


import java.util.List;

public interface IspendingGoalRepo extends JpaRepository<SpendingGoal,Integer> {
    List<SpendingGoal> findAllByNameContaining(String name);

    @Query(nativeQuery = true,value = "SELECT * FROM case6.spending_goal where id =:id")

    SpendingGoal findById(int id);

    @Query(nativeQuery = true,value = "SELECT * FROM case6.spending_goal where user_id =:id")
    List<SpendingGoal> checknamebyid(int id);
    @Query(nativeQuery = true,value = "SELECT * FROM case6.spending_goal where  user_id = :id && name = :namee ")
    SpendingGoal findByName(@Param("id") long id , @Param("namee") String namee);

}
