package org.example.repository;

import org.example.enums.User;

public interface UserRepositoryInterface {

    public void addUser(User user);

    public User[] getUsers();

}
