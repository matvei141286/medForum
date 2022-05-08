package org.example;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode

//Класс для хранения всех отправленных сообщений
public class MessageBox {
    private static List<Message> list = new ArrayList<Message>();

    public static void addMessage(Message message) {
        list.add(message);
    }

    public static List<Message> getList() {
        return MessageBox.list;
    }
}
