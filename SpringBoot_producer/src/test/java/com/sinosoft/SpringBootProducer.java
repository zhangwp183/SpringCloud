package com.sinosoft;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsMessagingTemplate;

//@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=ActivemqProducerApp.class)
public class SpringBootProducer {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void p2pSender(){
        /**
         * Parm1 队列名称 或 主题名称
         * Parm2 消息内容
         *
         */
        jmsMessagingTemplate.convertAndSend("springboot_queue",
                "SpringBoot Message");

    }


}
