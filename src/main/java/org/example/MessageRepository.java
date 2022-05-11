package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class MessageRepository {
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
    //получение пользователей в виде массива
    public Message[] getMessages(){
        return listMessages.toArray(new Message[listMessages.size()]);
    }

}
