package com.keshar.activemqexample.consumer;

import com.keshar.activemqexample.config.MessageConfig;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {


    @JmsListener(destination = MessageConfig.QUEUE)
    public void listerner(String message) {
        System.out.println("Message received..>>" + message);
    }

}
