package com.example.case6be.repositorys;

import com.example.case6be.models.AddUser;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IadduserRepo extends CrudRepository<AddUser, Long> {
    @Query(nativeQuery = true,value = "SELECT * FROM case6.add_user where user_ph_id = :id")
    List<AddUser> findAllByid(@Param("id") long id);
}
