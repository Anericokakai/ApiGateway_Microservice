package com.ricodev.kafkaservice.Service;

import com.ricodev.kafkaservice.tdo.UserJson;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.support.KafkaHeaders;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class KafkaJsonProducer {
    private  final KafkaTemplate<String, UserJson>  kafkaTemplate;

    private  static  final Logger LOGGER= LoggerFactory.getLogger(KafkaJsonProducer.class);
public  void sendMessage(UserJson user){
LOGGER.info(String.format("message sent -> %s",user));
    Message<UserJson> message= MessageBuilder.withPayload(user)
            .setHeader(KafkaHeaders.TOPIC,"test_json")
            .build();
    kafkaTemplate.send(message);
}


}
