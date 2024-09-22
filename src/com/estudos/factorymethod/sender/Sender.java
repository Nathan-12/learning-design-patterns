package com.estudos.factorymethod.sender;

import com.estudos.factorymethod.context.Message;
import com.estudos.factorymethod.factories.MessageFactory;

public class Sender {

    MessageFactory messageFactory;

    Sender(MessageFactory messageFactory) {
        this.messageFactory = messageFactory;
    }

    public void execute() {
        Message message = messageFactory.createMessage();
        message.setText("Hello World its my message.");
        message.send();
    }
}
