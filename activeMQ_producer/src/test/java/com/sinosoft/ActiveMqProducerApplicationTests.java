package com.sinosoft;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes=ActiveMqProducerApplication.class)
public class ActiveMqProducerApplicationTests {
    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    public void p2pSender() {
        /**
         * Parm1 队列名称 或 主题名称
         * Parm2 消息内容
         *
         */
        jmsMessagingTemplate.convertAndSend("springboot_queue",
                "SpringBoot Message");

    }
}