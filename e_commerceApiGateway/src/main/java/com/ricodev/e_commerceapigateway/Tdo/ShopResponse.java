package com.ricodev.e_commerceapigateway.Tdo;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data

public class ShopResponse {


        private String shopName;

        private  String shopLocation;

        private String shopContact;
        private String storeNumber;
    }


