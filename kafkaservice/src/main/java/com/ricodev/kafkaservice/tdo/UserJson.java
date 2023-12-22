package com.ricodev.kafkaservice.tdo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Data
@Builder
@NoArgsConstructor
public class UserJson {
    private  String  name;
    private String  email;
    private String  password;

}
