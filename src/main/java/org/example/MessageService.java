package org.example;

import java.util.Date;

public class MessageService {
    public Message createMessage (String text, User fromUser, User toUser){
        Date date = new Date();
        return new Message(text, fromUser, toUser, date);
    }
    public void  getMessageInfo(Message message){
        System.out.println("Date: " + message.getDate());
        System.out.println("From: " + message.getFromUser());
        System.out.println("To: " + message.getToUser());
        System.out.println("Text: " + message.getText());


    }

}
