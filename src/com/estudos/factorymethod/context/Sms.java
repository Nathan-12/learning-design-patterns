package com.estudos.factorymethod.context;

public class Sms extends Message {

    @Override
    public void send() {
        System.out.println("Sending sms with text: " + text);
    }
}
