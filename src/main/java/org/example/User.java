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
    private int id; //уникальный id пользователя

    private Date dateRegistration = new Date(); // дата регистрации пользователя
    private String surname; //фамилия пользователя
    private String name; //имя пользователя
    private String patronymic; //отчество пользователя
    private String birthday; //дата рождения пользователя
    private String email; //email пользователя
    private String mobilePhone; //номер телефона пользователя



    public User(String surname, String name, String patronymic, String birthday, String email, String mobilePhone, int id) {
        this.surname = surname;
        this.name =name;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.email= email;
        this.mobilePhone = mobilePhone;
        this.id = id;
    }
}
