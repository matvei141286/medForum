package org.example.repository;

import org.example.domain.Message;

public interface MessageRepositoryInterface {
    public void addMessage(Message message);
    public Message[] getMessages();

    public Message getMessageById(int id);

    public boolean deleteMessageById(int id);

}
