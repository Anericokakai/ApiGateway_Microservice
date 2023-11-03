package com.ricodev.e_commerceapigateway.OpenFeign;


import com.ricodev.e_commerceapigateway.Tdo.ShopResponse;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@EnableFeignClients
@FeignClient(value = "shop-service",path = "/v2/api/shops")
public interface ShopServiceClient {

    @PostMapping("{contextpath}")
  public   ShopResponse   createNewShop(@PathVariable("contextpath") String  contextPath);

}
