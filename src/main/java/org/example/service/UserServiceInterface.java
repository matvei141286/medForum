package org.example.service;

import org.example.enums.User;


public interface UserServiceInterface {

    public User createUser(String surname, String name, String patronymic, String birthday, String email, String mobilePhone);

    public void  getUserInfo(User user);


}
