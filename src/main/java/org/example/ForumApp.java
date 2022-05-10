package org.example;


import java.util.*;

public class ForumApp {

    private static List<Message> listMessage = new ArrayList<>(); //список для хранения отправленных сообщений

    public static void main(String[] args) {

        //Создание пользователя
        User user = new User("Demchenko", "Matvei", "Vladimirovich", "14/12/1986", "matvei141286@mail.ru", "89081364011");
        user.writeMessage("First message", user);
        user.sendMessage();//отправка первого сообщения
        user.writeMessage("Second message", user);
        user.saveMessage(); //сохранение второго сообщения в черновиках

        Video video1 = new Video("first", "mp4", "20Mb"); //Создание первого видеофайла
        user.writeMessage("Third message", user); //Создание третьего текстового сообщения
        user.addMedia(video1); //прикрепление видеофайла к третьему сообщению
        user.sendMessage(); //отправка третьего сообщения

        Photo photo1 = new Photo("first", "jpg", "3Mb");
        user.writeMessage("Fourth message", user); //Создание четвертого текстового сообщения
        user.addMedia(photo1); //прикрепление картинки к четвертому сообщению
        user.sendMessage(); //отправка четвертого сообщения



    }

    // сохранение отправленного сообщения в списке
    public static void addMessage(Message message) {
        listMessage.add(message);
    }

    public static List<Message> getListMessage() {return listMessage;}

}
