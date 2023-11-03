//package com.ricodev.e_commerceapigateway.filters;
//
//import org.springframework.http.server.reactive.ServerHttpRequest;
//import org.springframework.stereotype.Component;
//
//import java.util.*;
//import java.util.function.Predicate;
//
//@Component
//public class Validator {
//    public  static  final List<String> openApiEndPoints= List.of(
//            "/authorize/auth/**",
//            "/authorize/**",
//            "v2/api/products/**",
//            "v2/api/shops/home/**",
//            "/eureka/**"
//    );
//
//
//    public Predicate<ServerHttpRequest> isSecure=
//            request -> openApiEndPoints
//                    .stream()
//                    .noneMatch((uri->request.getURI()
//                            .getPath().contains(uri)));
//
//}
