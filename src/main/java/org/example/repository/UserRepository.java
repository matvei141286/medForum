package org.example.repository;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.domain.User;

import java.util.*;
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class UserRepository implements IUserRepository {
    //список для сохранения User
    private List<User> listUsers = new ArrayList<>();
    private static UserRepository userRepository;
    private UserRepository() {};//закрытие конструктора

    //реализация Singleton
    public static UserRepository getUserRepository() {
        if (userRepository == null) {
            userRepository = new UserRepository();
        }
        return userRepository;
    }
    //Добавление нового пользователя
    public void addUser(User user){
        listUsers.add(user);
    }
    //поиск пользователя по ID
    public User getUserById(int id){
        for (User user: listUsers){
            if(user.getId() == id) {
                return user;
            }
        }
        System.out.println("The user was not found");
        return null;
    }
}
