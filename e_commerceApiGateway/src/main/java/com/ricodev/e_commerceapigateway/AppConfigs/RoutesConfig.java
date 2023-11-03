package com.ricodev.e_commerceapigateway.AppConfigs;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoutesConfig {
    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder){
        return  builder.routes().build();
    }

    public  RouteLocator  shopServiceCircuitBreaker(RouteLocatorBuilder builder){
        return  builder.routes()
                .route(path->path.path("/v2/api/shops/**")
                        .filters(f->f.circuitBreaker(config -> config
                                .setName("shopServiceCircuitBreaker")
                                .setFallbackUri("foward:/fallback/fallbackForDownService")))
                                .uri("lb://products-service")).build();


        );
    }
}
