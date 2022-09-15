package com.example.case6be.services.impl;

import com.example.case6be.models.Notification;
import com.example.case6be.models.Sumnotification;
import com.example.case6be.repositorys.INotificationRepo;
import com.example.case6be.services.InotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NotificationService implements InotificationService {
    @Autowired
    INotificationRepo iNotificationRepo;

    @Override
    public Notification save(Notification notification) {
        return iNotificationRepo.save(notification);
    }



    @Override
    public List<Notification> findall(long id) {
        return iNotificationRepo.findByid(id);
    }

    @Override
    public Sumnotification count(long id) {
        return iNotificationRepo.countBynotification(id);
    }
}
