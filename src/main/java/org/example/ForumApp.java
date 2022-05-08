package org.example;


import java.util.*;

public class ForumApp {
    public static void main(String[] args) {

        //Создание пользователя
        User user = new User("Demchenko", "Matvei", "Vladimirovich", "14/12/1986", "matvei141286@mail.ru", "89081364011");
        user.writeMessage("First message", user);
        user.sendMessage();//отправка первого сообщения
        user.writeMessage("Second message", user);
        user.saveMessage(); //сохранение второго сообщения в черновиках

        Video video1 = new Video("first", "mp4", "20Mb"); //Создание первого видеофайла
        user.writeMessage("Third message", user); //Создание третьего текстового сообщения
        user.addMedia(video1); //прикрепление видеофайла к третьему сообщению
        user.sendMessage(); //отправка третьего сообщения

        Photo photo1 = new Photo("first", "jpg", "3Mb");
        user.writeMessage("Fourth message", user); //Создание четвертого текстового сообщения
        user.addMedia(photo1); //прикрепление картинки к четвертому сообщению
        user.sendMessage(); //отправка четвертого сообщения



        /* Отладочный вывод отправленного и сохраненного в черновике сообщения
        Message array[] =new  Message[user.getDraftMessages().size()];
        array =user.getDraftMessages().toArray(array);
        System.out.println(array[0].getText());

        Message array2[] =new  Message[user.getSendMessages().size()];
        array2 =user.getSendMessages().toArray(array2);
        System.out.println(array2[0].getText());
        */

        /* блок тестирования прикрепеления видеофайла к третьему сообщению
        Message array3[] = new  Message[user.getSendMessages().size()];
        array3 =user.getSendMessages().toArray(array3);
        Media array4[] = new Media[array3[1].getListMedia().size()];
        array4 = array3[1].getListMedia().toArray(array4);
        System.out.println(array4[0].getName());
        System.out.println(array4[0].getFileExtension());
        System.out.println(array4[0].getSize());
        System.out.println(array4[0].getTypeMedia());
        System.out.println(array4[0].getDateCreation());
        */

        // блок тестирования прикрепеления картинки к четвертому сообщению
        /*
        Message array5[] = new  Message[user.getSendMessages().size()];
        array5 =user.getSendMessages().toArray(array5);
        Media array6[] = new Media[array5[2].getListMedia().size()];
        array6 = array5[2].getListMedia().toArray(array6);
        System.out.println(array6[0].getName());
        System.out.println(array6[0].getFileExtension());
        System.out.println(array6[0].getSize());
        System.out.println(array6[0].getTypeMedia());
        System.out.println(array6[0].getDateCreation());
        */


        //Проверка MessageBox
        /*
        List<Message> listMessageBox = new ArrayList<Message>();
        listMessageBox = MessageBox.getList();
        System.out.println(listMessageBox.size());
        */


    }
}
