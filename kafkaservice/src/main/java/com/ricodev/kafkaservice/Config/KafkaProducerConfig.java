package com.ricodev.kafkaservice.Config;


import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaProducerConfig {

//  !  we need to hold our bootstrap sever url
    @Value("${spring.kafka.bootstrap-server}")
// !   define the producer configurations
    private String  bootstrapServer;
    public Map<String ,Object>  producerConfig()
    {
        HashMap<String,Object> props= new HashMap<>();
        props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServer);
        props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,StringSerializer.class);

        return  props;
    }
//   !  define a producer factory
    @Bean
    public ProducerFactory<String ,String > producerFactory(){
        return  new DefaultKafkaProducerFactory<>(producerConfig());
    }
//    ! define kafka templates
    @Bean
    public KafkaTemplate<String ,String > kafkaTemplate(ProducerFactory<String ,String > producerFactory){

        return  new KafkaTemplate<>(producerFactory);
    }

}
