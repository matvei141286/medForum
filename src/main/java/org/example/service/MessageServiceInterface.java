package org.example.service;


import org.example.enums.User;
import org.example.domain.Media;
import org.example.domain.Message;


public interface MessageServiceInterface {
    public Message createMessage (String text, User fromUser, User toUser);
    public void  getMessageInfo(Message message);

    public boolean sendMessage();

    public boolean addMedia(Media media);
}
