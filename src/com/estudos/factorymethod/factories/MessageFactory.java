package com.estudos.factorymethod.factories;

import com.estudos.factorymethod.context.Message;
import com.estudos.factorymethod.context.Email;

public class MessageFactory {

    public Message createMessage() {
        return new Email();
    }
}
