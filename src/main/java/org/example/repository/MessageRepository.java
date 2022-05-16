package org.example.repository;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.domain.Message;

import java.util.*;
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class MessageRepository implements MessageRepositoryInterface {
    private static MessageRepository messageRepository;
    private List<Message> listMessages = new ArrayList<>();

    private MessageRepository() {};//закрытие конструктора

    public static MessageRepository getMessageRepository() {
        if (messageRepository == null) {
            messageRepository = new MessageRepository();
        }
        return messageRepository;
    }
    //Добавление нового пользователя
    public void addMessage(Message message){
        listMessages.add(message);
    }
    //поиск пользователя по ID
    public Message getMessageById(int id){
        for (Message message: listMessages){
            if(message.getId() == id) {
                return message;
            }
        }
        System.out.println("The message was not found");
        return null;
    }
    public boolean deleteMessageById(int id){
        for (Message message: listMessages){
            if(message.getId() == id) {
                this.listMessages.remove(message);
                System.out.println("The message with ID = "+ id +" was deleted");
                return true;
            }
        }
        System.out.println("The message with same ID was not found");
        return false;
    }
    //получение пользователей в виде массива
    public Message[] getMessages(){
        return listMessages.toArray(new Message[listMessages.size()]);
    }
}
