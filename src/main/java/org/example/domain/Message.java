package org.example.domain;

import lombok.*;
import org.example.enums.StatusMessage;
import org.example.enums.User;
import java.util.*;
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class Message {
    private int id; //ID сообщения
    private Date date = new Date(); //дата создания сообщения
    private String text; //текст сообщения
    private User fromUser; //отправитель сообщения
    private User toUser; //адресат
    private List<Media> listMedia = new ArrayList<>(); //список прикрепленных медиафайлов к сообщению
    private StatusMessage status; //статус сообщения  DELIVERED/UNDELIVERED
    public Message(String text, User fromUser, User toUser,  int id){
        this.text = text;
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.id =id;
    }
}
