package com.sinosoft;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;

import javax.jms.ConnectionFactory;
import javax.jms.Session;

/**
 * 配置类
 */
@Configuration
public class ActiveMQConfig {

    @Bean("jmsListenerContainerFactory")
    public DefaultJmsListenerContainerFactory
            defaultJmsListenerContainerFactory(ConnectionFactory  connectionFactory){
        DefaultJmsListenerContainerFactory factory=new DefaultJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        //关闭事务
        factory.setSessionTransacted(false);
        //修改消息确认机制  SpringBoot整合的ActiveMQ手动确认值为4
        factory.setSessionAcknowledgeMode(Session.AUTO_ACKNOWLEDGE);
        return factory;
    }
}
