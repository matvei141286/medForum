package org.example.service;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.enums.User;
import org.example.repository.UserRepository;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        if(!validationEmail(email)) {
            System.out.println("User has incorrect email");
            System.exit(1);
            return null;
        }
        if(!validationPhone(mobilePhone)) {
            System.out.println("User has incorrect phone");
            System.exit(1);
            return null;
        }
        countUsers++;
        User newUser = new User(surname, name, patronymic, birthday, email, mobilePhone, countUsers);
        repoUsers.addUser(newUser);
        return newUser;
    }
    private boolean validationEmail(String email){
        String EMAIL_PATTERN = "\\w+([\\.-]?\\w+)*@\\w+([\\.-]?\\w+)*\\.\\w{2,4}";
        Pattern pat;
        Matcher mat;
        pat = Pattern.compile(EMAIL_PATTERN);
        mat = pat.matcher(email);
        boolean matches = mat.matches();
        return matches;
    }
    private boolean validationPhone(String phone){
        String PHONE_PATTERN = "^\\+?[0-9\\-\\s]*$";
        Pattern pat;
        Matcher mat;
        pat = Pattern.compile(PHONE_PATTERN);
        mat = pat.matcher(phone);
        boolean matches = mat.matches();
        return matches;
    }
}

