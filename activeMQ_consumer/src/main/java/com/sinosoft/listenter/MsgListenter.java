package com.sinosoft.listenter;

import org.apache.activemq.Message;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class MsgListenter {

    @JmsListener(destination = "springboot_queue")
    public void  reciverMessage(Message message){
        if (message instanceof TextMessage){
            TextMessage textMessage=(TextMessage)message;
            try {
                System.out.println("接受消息"+textMessage.getText());
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }


}
