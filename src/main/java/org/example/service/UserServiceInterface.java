package org.example.service;

import org.example.enums.User;

public interface UserServiceInterface {
    User createUser(String surname, String name, String patronymic, String birthday, String email, String mobilePhone);
}
