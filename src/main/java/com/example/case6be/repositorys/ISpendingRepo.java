package com.example.case6be.repositorys;

import com.example.case6be.models.Spending;
import com.example.case6be.models.SumSpending;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.sql.Date;
import java.util.List;

public interface ISpendingRepo extends PagingAndSortingRepository<Spending,Integer> {
    @Query(nativeQuery = true,value = "SELECT count(name) as Sumspen FROM case6.spending where user_id = :id")
    SumSpending countByname (@Param("id") long id);
    @Query(nativeQuery = true,value = "SELECT * FROM case6.spending where user_id = :id")
    List<Spending> findAll (@Param("id") long id);
    @Query(nativeQuery = true,value = "SELECT * FROM spending where user_id = :id && spending.date between :day1 and :day2" )
    List<Spending> findByDay(@Param("id") long id, @Param("day1") java.sql.Date day1, @Param("day2") Date day2);
}
