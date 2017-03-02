package com.kennywoo.lrn.mail;

import org.springframework.mail.MailSender;

/**
 * Created by kennywoo on 2017/3/2.
 */
public class SimpleOrderManager implements OrderManager {

    private MailSender mailSender;

    @Override
    public void placeOrder(Order order) {

    }
}
