package com.mugeeth.homemicroservices.HomeController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {
    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/home") //http:localhost:8081/home
    public String home(){
        String products = restTemplate.getForObject("http://PRODUCT/products",String.class);
        return products;
    }
}
