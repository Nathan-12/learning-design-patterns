package com.estudos.factorymethod.context;

public class Email extends Message {

    @Override
    public void send() {
        System.out.println("Sending email with text: " + text);
    }
}
