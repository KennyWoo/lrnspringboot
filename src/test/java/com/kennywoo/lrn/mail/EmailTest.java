package com.kennywoo.lrn.mail;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by kennywoo on 2017/3/2.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
public class EmailTest {

//    @Autowired
    private JavaMailSender mailSender;

    @Test
    public void sendSimpleMail() {
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("xxxxxx@gmail.com");
        message.setTo("xxxxxx@gmail.com");
        message.setSubject("test mail");
        message.setText("test text");

        mailSender.send(message);
    }

    @Test
    public void sendAttachmentsMail() {
        MimeMessage message = mailSender.createMimeMessage();
    }

    @Test
    public void sendTemplateMail() throws MessagingException {
        MimeMessage message = mailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        helper.setFrom("");
        helper.setTo("");
        helper.setSubject("");

        Map<String, Object> model = new HashMap<>();
        model.put("username", "Tom");
//        String text = VelocityEngineUtils
    }

}
