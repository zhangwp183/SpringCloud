package com.sinosoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class OrderMemberService {
    @Autowired
    private RestTemplate restTemplate;

    public List<String> getMemberUser(){
        System.out.println("进入getMemberUser ");
        return restTemplate.getForObject("http://server-member/getMemberUser", List.class);
    }

    public  String  getMemberUserBlance(){
        System.out.println("进入getMemberUser ");
        return restTemplate.getForObject("http://server-member/getMemberServiceApi", String.class);
    }



}

