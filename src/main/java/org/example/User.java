package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import java.util.*;
//import java.text.SimpleDateFormat;
@Getter
@Setter
@ToString
@EqualsAndHashCode



public class User {
    private static int countUser= 0; //cчетчик созданных пользователей
    private int id; //уникальный id пользователя

    private Date dateRegistration = new Date(); // дата регистрации пользователя
    private String surname; //фамилия пользователя
    private String name; //имя пользователя
    private String patronymic; //отчество пользователя
    private String birthday; //дата рождения пользователя
    private String email; //email пользователя
    private String mobilePhone; //номер телефона пользователя

    private Message message = null; //переменная для хранения набираемого сообщения

    private List<Message> draftMessages = new ArrayList<>(); //черновики сообщений

    private List<Message> sendMessages = new ArrayList<>(); //отправленные сообщения пользователя

    User(String surname, String name, String patronymic, String birthday, String email, String mobilePhone) {
        this.surname = surname;
        this.name =name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.email= email;
        this.mobilePhone = mobilePhone;
        User.incrementCountUser();
        this.id= User.getCountUser();
    }

    //икрементирование счетчика пользователя
    public static void incrementCountUser() {
        User.countUser++;
    }

    //получение количества пользователей
    public static int getCountUser() {
        return User.countUser;
    }



    //Ввод текста сообщения
    public void writeMessage(String text, User user) {
        this.message = new Message(text, user);
    }

    //Прикрепление медиафайла к сообщению
    public boolean addMedia(Media media) {

        //Проверка существования сообщения и  добавление медиафайла к сообщению
        if (this.message != null) {
            this.message.addMedia(media);
            return true;
        } else return false;

    }

    // Отправка сообщения
    public void sendMessage() {
        this.message.setStatus(org.example.StatusMessage.DELIVERED);
        this.sendMessages.add(this.message);
        ForumApp.addMessage(this.message);
        this.message = null;
    }

    //сохранение неотправленного сообщения в MessageBox
    public void saveMessage() {
        this.message.setStatus(org.example.StatusMessage.UNDELIVERED);
        this.draftMessages.add(this.message);
        this.message = null;
    }




}
