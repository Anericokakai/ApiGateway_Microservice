package com.ricodev.kafkaservice.Controller;


import com.ricodev.kafkaservice.Service.KafkaJsonProducer;
import com.ricodev.kafkaservice.Service.KafkaProducer;
import com.ricodev.kafkaservice.tdo.UserJson;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/messages")
@RequiredArgsConstructor
public class MessageController {

    private final   KafkaProducer kafkaProducer;
 private  final KafkaJsonProducer kafkaJsonProducer;
    @PostMapping
    public ResponseEntity<?> publishMessage(@RequestBody String  messageRequest){
kafkaProducer.sendMessage(messageRequest);

return ResponseEntity.ok().body("message sent to the topic");

    }

    @PostMapping("/new")
    public  ResponseEntity<?> saveUser(@RequestBody UserJson userJson){
        kafkaJsonProducer.sendMessage(userJson);
        return  ResponseEntity.status(200).body(" Json sent kafka topic");

    }


}
