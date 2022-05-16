package org.example.service;

import org.example.enums.User;
import org.example.domain.Media;
import org.example.domain.Message;
public interface MessageServiceInterface {
    Message createMessage (String text, User fromUser, User toUser);
    void  getMessageInfo(Message message);
    boolean sendMessage();
    boolean addMedia(Media media);
}
