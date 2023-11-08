package com.ricodev.kafkaservice.Service;

import lombok.AllArgsConstructor;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.logging.Logger;

@Service
@AllArgsConstructor
public class KafkaProducer {
    private KafkaTemplate<String ,String > kafkaTemplate;
    private  static  final org.slf4j.Logger LOGGER =  LoggerFactory.getLogger(KafkaProducer.class);
    public  void  sendMessage(String message){
        LOGGER.info(message);
        kafkaTemplate.send("test",message);

    }
}
