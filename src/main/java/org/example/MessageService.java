package org.example;

import java.util.Date;

public class MessageService {
    private static MessageService messageService;
    private int countMessages;
    private Message temporaryMessage;


    private MessageRepository repoMessages = MessageRepository.getMessageRepository();

    private MessageService() {};//закрытие конструктора
    //еализация Singleton
    public static MessageService getMessageService() {
        if (messageService == null) {
            messageService = new MessageService();
        }
        return messageService;
    }

    public Message createMessage (String text, User fromUser, User toUser){
        countMessages++;
        Message newMessage = new Message(text, fromUser, toUser, countMessages);
        repoMessages.addMessage(newMessage);
        return newMessage;
    }
    public void  getMessageInfo(Message message){
        System.out.println("Date: " + message.getDate());
        System.out.println("From: " + message.getFromUser());
        System.out.println("To: " + message.getToUser());
        System.out.println("Text: " + message.getText());


    }

}
