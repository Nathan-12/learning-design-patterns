package com.estudos.factorymethod.context;

public abstract class Message {
    String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public abstract void send();
}
