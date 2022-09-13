package com.example.case6be.services;

import com.example.case6be.models.Notification;

import java.util.List;

public interface InotificationService {
    Notification save(Notification notification);
    List<Notification> findall(long id);
}
