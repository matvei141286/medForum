package org.example;

import org.example.enums.User;
import org.example.service.MessageService;
import org.example.service.UserService;
public class ForumApp {
    public static void main(String[] args) {
        UserService userService = UserService.getUserService();
        MessageService messageService = MessageService.getMessageService();
        User user1 = userService.createUser("Ivanov", "Ivan", "Ivanovich","1990", "ivanov@mail.ru","+79005553344");
        User user2 = userService.createUser("Sidorov", "Dmitrii","Nicolaevich", "1987","sidorov@mail.ru", "+79103456789");
        //userService.getUserInfo(user1);
        //userService.getUserInfo(user2);
        messageService.createMessage("First message without media", user1, user2); //создание первого текстового сообщения
        messageService.sendMessage();//отправка первого сообщения
        messageService.getMessageInfo(messageService.getRepoMessages().getMessageById(1)); //вывод сохраненного сообщения
    }
}
