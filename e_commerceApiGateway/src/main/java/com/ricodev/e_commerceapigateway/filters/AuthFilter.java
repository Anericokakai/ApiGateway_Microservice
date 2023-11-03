//package com.ricodev.e_commerceapigateway.filters;
//
//import com.ricodev.e_commerceapigateway.OpenFeign.ShopServiceClient;
//import lombok.AllArgsConstructor;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.gateway.filter.GatewayFilter;
//import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
//import org.springframework.http.HttpHeaders;
//import org.springframework.stereotype.Component;
//import org.springframework.web.client.RestTemplate;
//
//@Component
//
//public class AuthFilter   {
//
//    @Autowired
//    private  Validator validator;
//    @Autowired
//    private RestTemplate restTemplate;
//
//
//    private    ShopServiceClient shopServiceClient;
//
//    @Override
//    public GatewayFilter apply(Config config) {
//        return ((exchange, chain) -> {
//
//            if(!validator.isSecure.test(exchange.getRequest())){
//                System.out.println(exchange.getRequest());
////? check if header contains token
//                if(exchange.getRequest()
//                        .getHeaders()
//                        .containsKey(HttpHeaders.AUTHORIZATION)){
//                    throw  new RuntimeException(" inavlid request , all request should have a token");
//                }
////                ? if the token exist extract it from the header
//                String  authToken=exchange
//                        .getRequest()
//                        .getHeaders()
//                        .get(HttpHeaders.AUTHORIZATION)
//                        .get(0);
//
//
////? check if the header beggins with bearer and its not null
//                if(authToken!=null && authToken.startsWith("Bearer")){
//
////                    ? remove the token from the bearer
//                    authToken=authToken.substring(7);
//
//                }
//
////                we can now validate the token using restTemplate for now
//
//                try{
//
//                    shopServiceClient.createNewShop(exchange.getRequest().getPath().contextPath().value());
//
//                } catch (Exception ex
//                ){
//                    throw new RuntimeException("failed to communicate");
//                }
//
//            }
//
//            return  chain.filter(exchange);
//
//        });
//    }
//
//    public  static  class  Config{
//
//    }
//    public AuthFilter() {
//        super( Config.class);
//    }
//
//
//
//
//
//
//
//}
