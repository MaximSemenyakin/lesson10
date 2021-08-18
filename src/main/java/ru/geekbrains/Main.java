package ru.geekbrains;

import java.util.*;

/*

1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). Найти и вывести список уникальных слов,
из которых состоит массив (дубликаты не считаем). Посчитать, сколько раз встречается каждое слово.

2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров. В этот телефонный
справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии
должны выводиться все телефоны. Желательно не добавлять лишний функционал (дополнительные поля (имя, отчество, адрес),
взаимодействие с пользователем через консоль и т.д). Консоль использовать только для вывода результатов проверки
телефонного справочника.

 */

public class Main {

    public static void main(String[] args) {

        //Задача 1
        List<String> words = new ArrayList<>(Arrays.asList(
                "shared",
                "always",
                "lesson",
                "geekbrains",
                "java",
                "android",
                "main",
                "compare",
                "shared",
                "android",
                "source",
                "weather",
                "return",
                "geekbrains",
                "junit"
        ));

        Set<String> arr = new HashSet<>(words);
        System.out.println("Количество уникальных слов в списке: " + arr.size() + "\n");

        printUniqueWords(words);

        System.out.println("\n********   Задача 2   ********\n");

        //Задача 2
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("89662345454", "Petrov");
        phoneBook.add("89765436756", "Ivanov");
        phoneBook.add("89765523743", "Pupkin");
        phoneBook.add("89854835489", "Ivanov");
        phoneBook.add("43759275423", "Reshetov");
        phoneBook.add("93248592243", "Razin");
        phoneBook.add("93485092543", "Lazarenko");
        phoneBook.add("34857293452", "Petrov");
        phoneBook.add("28347592453", "Nikulin");
        phoneBook.add("84237592293", "Vasilenko");
        phoneBook.add("82475284562", "Vasilenko");
        phoneBook.add("27486583287", "Vasilenko");


        System.out.println();

        phoneBook.getPerson("Vasilenko");
        phoneBook.getPerson("Petrov");
        phoneBook.getPerson("Lazarenko");
        phoneBook.getPerson("Razin");

    }

    public static void printUniqueWords(List<String> array) {
        Set<String> tempArr = new LinkedHashSet<>();
        for (String arr : array) {
            String a = arr.toLowerCase(Locale.ROOT);
            tempArr.add(a);
        }

        for (String temp : tempArr) {
            int count = 0;
            for (String arr : array) {
                String a = arr.toLowerCase(Locale.ROOT);
                if (temp.equals(a)) count++;
            }
            System.out.println("*** " + temp + " ***" + " повторяется в списке: " + count);
        }
    }

}
