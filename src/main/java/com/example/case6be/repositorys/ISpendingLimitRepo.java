package com.example.case6be.repositorys;

import com.example.case6be.models.SpendingLimit;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ISpendingLimitRepo extends CrudRepository<SpendingLimit,Long> {

    @Query(nativeQuery = true,value = "SELECT * FROM case6.spending_limit where user_id =:id")
    List<SpendingLimit> findByid(@Param("id")long id);


}
