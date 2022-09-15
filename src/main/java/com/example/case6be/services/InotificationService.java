package com.example.case6be.services;

import com.example.case6be.models.Notification;
import com.example.case6be.models.SumSpending;
import com.example.case6be.models.Sumnotification;

import java.util.List;

public interface InotificationService {
    Notification save(Notification notification);
    List<Notification> findall(long id);
    Sumnotification count(long id);

}
