package org.example.service;

import org.example.domain.Media;
import org.example.domain.Message;
import org.example.domain.User;
public interface IMessageService {
    Message createMessage (String text, User fromUser, User toUser);
    void  getMessageInfo(Message message);
    boolean sendMessage();
    boolean addMedia(Media media);
}
