package com.ricodev.e_commerceapigateway.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController

public class FallBackController {

    @PostMapping("/shopServiceFallBack")
    public ResponseEntity<?> fallback(){

        return  ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR) .body("we are facing some isues with the shop service please conact us ");
    }
}
