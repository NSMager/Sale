package com.zb.src.Servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

@org.springframework.stereotype.Service
public class Service {

    @Autowired
    RestTemplate restTemplate;

    public String rest(String userName){
      return  restTemplate.getForObject("http://PROVIDER/showUser?userName="+userName,String.class);
    }
}
