package org.example.repository;

import org.example.domain.Message;

public interface MessageRepositoryInterface {
    void addMessage(Message message);
    Message[] getMessages();
    Message getMessageById(int id);
    boolean deleteMessageById(int id);
}
