package org.example.service;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.enums.User;
import org.example.domain.Media;
import org.example.domain.Message;
import org.example.repository.MessageRepository;

@Getter
@Setter
@ToString
@EqualsAndHashCode

public class MessageService implements MessageServiceInterface {
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
        //repoMessages.addMessage(newMessage);
        this.temporaryMessage = newMessage;
        return newMessage;
    }
    public boolean sendMessage() {
        if (this.temporaryMessage != null) {
            repoMessages.addMessage(this.temporaryMessage);
            this.temporaryMessage = null;
            return true;
        }
        return false;
    }
    public boolean addMedia(Media media) {
        if (this.temporaryMessage != null) {
            this.temporaryMessage.getListMedia().add(media);
            return true;
        }
        return false;
    }
    public void  getMessageInfo(Message message){
        System.out.println("Date: " + message.getDate());
        System.out.println("From: " + message.getFromUser());
        System.out.println("To: " + message.getToUser());
        System.out.println("Text: " + message.getText());
    }
}
