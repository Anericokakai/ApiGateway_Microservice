package com.ricodev.kafkaservice.Listeners;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(topics = "ricodev",groupId = "group1")
    void  listener(String  data){
        System.out.println("listener received : "+data);
    }
}
