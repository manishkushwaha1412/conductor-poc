package com.perfios.conductor.poc.controller;

import com.perfios.conductor.poc.service.EmailServiceUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("notification")
public class NotificationController {


    @Autowired
    private EmailServiceUtil emailServiceUtil;

    @GetMapping("notify")
    public String sendAlert(){
        return emailServiceUtil.sendMessage();
    }


}
