package com.keshar.activemqexample.config;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;

@EnableJms
@Configuration
public class MessageConfig {
    public static final String QUEUE = "keshar_queue";

    @Value("${activemq.broker-url}")
    private String brokerUrl;

    @Bean
    public Queue queue() {
        return new ActiveMQQueue(QUEUE);
    }

//    @Bean
//    public ActiveMQConnectionFactory activeMQConnectionFactory() {
//        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory();
//        connectionFactory.setBrokerURL(brokerUrl);
//        return connectionFactory;
//    }
//
//    @Bean
//    public JmsTemplate jmsTemplate() {
//        return new JmsTemplate(activeMQConnectionFactory());
//    }
}
