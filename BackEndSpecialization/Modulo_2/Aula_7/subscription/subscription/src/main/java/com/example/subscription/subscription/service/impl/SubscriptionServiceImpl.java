package com.example.subscription.subscription.service.impl;

import com.example.subscription.subscription.service.SubscriptionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionServiceImpl implements SubscriptionService {

    @Value("${server.port}")
    private String port;

    public String getPort(){
        return port;
    }
}
