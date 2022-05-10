package org.example;

public class UserService {
    public int countUsers;

    public User createUser(String surname, String name, String patronymic, String birthday, String email, String mobilePhone){
        countUsers++;
        return new User(surname, name, patronymic, birthday, email, mobilePhone, countUsers);
    }

    public void  getUserInfo(User user){
        System.out.println("ID: " + user.getId());
        System.out.println("Surname: " + user.getSurname());
        System.out.println("Name: " + user.getName());
        System.out.println("Patronymic: " + user.getPatronymic());
        System.out.println("Birthday: " + user.getBirthday());
        System.out.println("Email: " + user.getEmail());
        System.out.println("Phone: " + user.getMobilePhone());

    }

}
