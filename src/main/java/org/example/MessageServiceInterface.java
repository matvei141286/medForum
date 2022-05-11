package org.example;

public interface MessageServiceInterface {
    public Message createMessage (String text, User fromUser, User toUser);
    public void  getMessageInfo(Message message);

    public boolean sendMessage();

    public boolean addMedia(Media media);
}
