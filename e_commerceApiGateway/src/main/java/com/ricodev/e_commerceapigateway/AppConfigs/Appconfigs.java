package com.ricodev.e_commerceapigateway.AppConfigs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Appconfigs {

    @Bean
    public RestTemplate restTemplate(){
        return  new RestTemplate();
    }
}
