package org.example;


import java.util.*;

public class ForumApp {

    private static List<Message> listMessage = new ArrayList<>(); //список для хранения отправленных сообщений

    public static void main(String[] args) {











    }

    // сохранение отправленного сообщения в списке
    public static void addMessage(Message message) {
        listMessage.add(message);
    }

    public static List<Message> getListMessage() {return listMessage;}

}
