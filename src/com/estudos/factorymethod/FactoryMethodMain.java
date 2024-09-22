package com.estudos.factorymethod;

import com.estudos.factorymethod.factories.MessageFactory;
import com.estudos.factorymethod.factories.SmsMessageFactory;
import com.estudos.factorymethod.sender.Sender;

public class FactoryMethodMain {
    public static void main(String[] args) {
        Sender senderEmail = new Sender(new MessageFactory());
        senderEmail.execute();

        Sender senderSMS = new Sender(new SmsMessageFactory());
        senderSMS.execute();
    }
}
