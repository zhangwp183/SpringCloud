package com.sinosoft.listenter;

import org.apache.activemq.Message;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;

@Component
public class MsgListenter {

    @JmsListener(destination = "springboot_queue",containerFactory="jmsListenerContainerFactory")
    public void  reciverMessage(Message message){
        if (message instanceof TextMessage){
            TextMessage textMessage=(TextMessage)message;
            try {
                System.out.println("接受消息"+textMessage.getText());
               // textMessage.acknowledge(); 手动确认
            } catch (JMSException e) {
                e.printStackTrace();
            }
        }
    }


}
