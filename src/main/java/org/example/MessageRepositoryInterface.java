package org.example;

public interface MessageRepositoryInterface {
    public void addMessage(Message message);
    public Message[] getMessages();

    public boolean deleteMessageById(int id);

}
