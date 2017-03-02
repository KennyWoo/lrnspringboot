package com.kennywoo.lrn.mq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Size;

/**
 * Created by kennywoo on 2017/3/2.
 */
//@Component
//@Validated
public class MyKafkaBean {

    private final KafkaTemplate kafkaTemplate;

//    @Autowired
    public MyKafkaBean(KafkaTemplate kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

//    @KafkaListener(topics = "someTopic")
    public void processMessage(String content) {

    }

    public void xxxxxx(@Size(min = 8, max = 10) String code) {

    }
}
