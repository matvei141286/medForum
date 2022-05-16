package org.example.service;

import org.example.domain.User;
public interface IUserService {
    public User createUser(String surname, String name, String patronymic, String birthday, String email, String mobilePhone);
}
