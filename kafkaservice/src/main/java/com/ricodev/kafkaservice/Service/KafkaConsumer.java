package com.ricodev.kafkaservice.Service;

import com.ricodev.kafkaservice.tdo.UserJson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumer {
    private  static  final Logger LOGGER = LoggerFactory.getLogger(KafkaConsumer.class);

//    ? consumer of type string from a topic
    @KafkaListener(topics = "test",groupId = "mygroup")
    public  void  consumer(String  message){
        LOGGER.info(String.format("message received -> %s",message));

    }
    @KafkaListener(topics = "test_json",groupId = "mygroup")
    public  void   secondConsumer (UserJson userJson){

        LOGGER.info(String.format("message consumed by the consumer -> %s",userJson.getPassword()));
    }
}
