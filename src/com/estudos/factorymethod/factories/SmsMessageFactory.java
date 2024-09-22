package com.estudos.factorymethod.factories;

import com.estudos.factorymethod.context.Message;
import com.estudos.factorymethod.context.Sms;

public class SmsMessageFactory extends MessageFactory {
    @Override
    public Message createMessage() {
        return new Sms();
    }
}
