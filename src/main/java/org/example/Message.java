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


public class Message {
    private static int count = 0; //счетчик созданных сообщений для генерации уникального id сообщения
    private int id; //уникальное ID сообщения

    private Date date = new Date(); //дата создания сообщения
    private String text; //текст сообщения

    private  User user; //пользователь, создавший сообщение
    private List<Media> listMedia = new ArrayList<Media>(); //список прикрепленных медиафайлов к сообщению
    private StatusMessage status; //статус сообщения  DELIVERED/UNDELIVERED

    public enum StatusMessage {
        DELIVERED,
        UNDELIVERED;
    }

    Message(String text, User user){
        this.text = text;
        Message.incrementCount();
        this.id = Message.getCount();
        this.user = user;

    }

    //Инкрементирование счетчика сообщения
    public static void incrementCount() {
        Message.count++;
    }

    //Получение количества сообщений
    public static int getCount() {
        return Message.count;
    }

    public void addMedia(Media media) {
        this.listMedia.add(media);
    }



}
