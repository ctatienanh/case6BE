package com.example.case6be.repositorys;

import com.example.case6be.models.Notification;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.List;

public interface INotificationRepo extends CrudRepository<Notification,Integer> {
    @Query(nativeQuery = true,value = "SELECT * FROM case6.notification where user_sv_id = :id")
    List<Notification> findByid(@Param("id") long id);

}
