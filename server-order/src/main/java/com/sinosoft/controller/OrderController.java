package com.sinosoft.controller;

import com.sinosoft.service.OrderMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
@RestController
public class OrderController {
    @Autowired
    private OrderMemberService orderMemberService;

    @RequestMapping("/getOrder")
    public String getOrder(HttpServletRequest request){
        String order=request.getParameter("order");
        //region Description
        if(order==null||"".equals(order)){
            order="AAAA"	;
        }else{
            order+="   BBB";
        }
        //endregion
        System.out.println("进入 OrderController1111");
        return order;
    }


    @RequestMapping("/getOrderMember")
    public String getOrderMember(HttpServletRequest request){
        System.out.println("进入getOrderMember ");
        List<String> order=orderMemberService.getMemberUser();
        return order.toString();
    }

    /**
     * 测试负载均衡
     * @param request
     * @return
     */
    @RequestMapping("/getOrderMemberBlance")
    public String getOrderMemberBlance(HttpServletRequest request){
        //region Description
        System.out.println("进入getOrderMember ");
        String  order=orderMemberService.getMemberUserBlance();
        return order;
        //endregion
    }






}
