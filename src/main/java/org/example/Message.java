package org.example;

import lombok.*;

import java.util.*;


@Getter
@Setter
@ToString
@EqualsAndHashCode
@RequiredArgsConstructor


public class Message {


    private Date date = new Date(); //дата создания сообщения
    private  final String text; //текст сообщения

    private final User user; //пользователь, создавший сообщение
    private List<Media> listMedia = new ArrayList<>(); //список прикрепленных медиафайлов к сообщению
    private StatusMessage status; //статус сообщения  DELIVERED/UNDELIVERED




    //Инкрементирование счетчика сообщения


    public void addMedia(Media media) {
        this.listMedia.add(media);
    }



}
