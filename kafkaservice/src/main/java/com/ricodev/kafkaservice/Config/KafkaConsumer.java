package com.ricodev.kafkaservice.Config;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringSerializer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.config.KafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;

import org.springframework.kafka.listener.ConcurrentMessageListenerContainer;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaConsumer {

    //  !  we need to hold our bootstrap sever url
    @Value("${spring.kafka.bootstrap-server}")
// !   define the producer configurations
    private String  bootstrapServer;
    public Map<String ,Object> consumerConfig()
    {
        HashMap<String,Object> props= new HashMap<>();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,bootstrapServer);
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringSerializer.class);
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,StringSerializer.class);

        return  props;
    }
    //   !  define a consumer factory
    @Bean
    public ConsumerFactory<String ,String > consumerFactory(){
        return  new DefaultKafkaConsumerFactory<>(consumerConfig());
    }

//    ? listener container
//    ? receives all messages

    @Bean
    public KafkaListenerContainerFactory<
            ConcurrentMessageListenerContainer<String ,String>>
            factory(ConsumerFactory<String ,String > consumerFactory){
        ConcurrentKafkaListenerContainerFactory<String ,String > factory=
                new ConcurrentKafkaListenerContainerFactory<>();
        factory.setConsumerFactory(consumerFactory);

        return  factory;
    }
}
