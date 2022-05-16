package org.example.service;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.enums.User;
import org.example.repository.UserRepository;
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UserService implements UserServiceInterface {
    private int countUsers;
    private UserRepository repoUsers =  UserRepository.getUserRepository();
    private static UserService userService;
    private UserService() {};//закрытие конструктора
    //реализация Singleton
    public static UserService getUserService() {
        if (userService == null) {
            userService = new UserService();
        }
        return userService;
    }
    public User createUser(String surname, String name, String patronymic, String birthday, String email, String mobilePhone){
        countUsers++;
        User newUser = new User(surname, name, patronymic, birthday, email, mobilePhone, countUsers);
        repoUsers.addUser(newUser);
        return newUser;
    }
}
