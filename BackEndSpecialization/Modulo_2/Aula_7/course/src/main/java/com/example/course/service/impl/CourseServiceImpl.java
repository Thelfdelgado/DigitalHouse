package com.example.course.service.impl;

import com.example.course.service.CourseService;
import com.example.course.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private SubscriptionService subscriptionService;

    public String getSubscriptionPort(){
        return subscriptionService.getPort();
    }
}
