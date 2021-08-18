package ru.geekbrains;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {

    Map<String, String> phoneBook = new HashMap<>();

    private String surname;
    private String phoneNumber;

    public String getSurname() {
        return surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void add(String number, String surname) {
        if (!phoneBook.containsKey(number)) {
            phoneBook.put(number, surname);
            System.out.printf("Пользователь с фамилией %s, и номером %s успешно добавлен в телефонную книгу\n", surname, number);
        } else {
            System.out.printf("Этот %s номер принадлежит другому человеку\n", number);
        }
    }

    public void getPerson(String surname) {
        for (Map.Entry<String, String> element : phoneBook.entrySet()) {
            String key = element.getKey();
            String name = element.getValue();
            if (name.equals(surname)) {
                System.out.printf("По фамилии %s найден номер %s\n", name, key);
            }
        }
    }
}
