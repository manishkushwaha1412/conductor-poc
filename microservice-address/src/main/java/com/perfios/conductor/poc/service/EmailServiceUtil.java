package com.perfios.conductor.poc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Component;


@Component
public class EmailServiceUtil {

    @Autowired
    private JavaMailSender mailSender;

    public String sendMessage(){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("notification@perfios.com");
        message.setTo("manish.k@perfios.com");
        message.setSubject("Workflow Alert !!");
        message.setText("Dear customer, \n\nyour workflow has been failed with below message \n\n Invalid customer found \n\n Regards,\nSupport Team");
        mailSender.send(message);
        System.out.println("Alert Message sent successfully !!!!!");
        return "Success";
    }







}
