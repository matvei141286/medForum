package org.example;

import lombok.*;

import java.util.*;


@Getter
@Setter
@ToString
@EqualsAndHashCode



public class Message {


    private Date date; //дата создания сообщения
    private String text; //текст сообщения
    private User fromUser; //отправитель сообщения
    private User toUser; //адресат
    private List<Media> listMedia = new ArrayList<>(); //список прикрепленных медиафайлов к сообщению
    private StatusMessage status; //статус сообщения  DELIVERED/UNDELIVERED

    public Message(String text, User fromUser, User toUser, Date date){
        this.text = text;
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.date = date;

    }




    public void addMedia(Media media) {
        this.listMedia.add(media);
    }



}
