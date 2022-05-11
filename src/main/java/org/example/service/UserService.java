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

    public void  getUserInfo(User user){
        System.out.println("ID: " + user.getId());
        System.out.println("Surname: " + user.getSurname());
        System.out.println("Name: " + user.getName());
        System.out.println("Patronymic: " + user.getPatronymic());
        System.out.println("Birthday: " + user.getBirthday());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Phone: " + user.getMobilePhone());
        System.out.println("***********************************************");
        System.out.println();

    }

}
