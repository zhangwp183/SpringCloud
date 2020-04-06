package com.sinosoft.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Value;
import java.util.List;

@RestController
public class MemberController {
    @Value("${server.port}")
    private String serverPort;
    private int count =800;
    @RequestMapping("/getMemberUser")
    public List<String> getMemberUser(HttpServletRequest request){
        String name=request.getParameter("name");
        List<String>  list =new ArrayList<>();
        list.add("葫芦娃");
        list.add(serverPort);
        list.add(count+"");
        System.out.println("name : "+name);
 /*       try {
            System.out.println("count:"+count);
            Thread.sleep(count);
            count+=100;
            if(count>1100){
                count=800;
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        if(name!=null&& !"".equals(name)){

            list.add(name);
        }
        System.out.println(list.toString());
        return list;
    }


    @RequestMapping("/getMemberServiceApi")
    public String getMemberServiceApi() {
        return "this is 会员 服务工程"+serverPort;
    }
}
