package lesson5_hw;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что один
 * человек может иметь несколько телефонов.
 */
public class PhoneContakts {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> book = new HashMap<>();
        Scanner sc = new Scanner(System.in);
           
        while (true) {
            System.out.println("Введите текст_цифры для добавления| q для выхода");
            String input = sc.nextLine();
            int number = Integer.parseInt(input.split("_")[1]);
            String name = input.split("_")[0];

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            addContact(book, name, number);
            System.out.println("Записная книга =" + book.entrySet());
        }
        sc.close();
    }

    private static void addContact(Map<String, ArrayList<Integer>> book, String name, int phone) {

        boolean repeatName = false;
        boolean repeatPhone = false;

        if (book.size() > 0) {
            if (book.containsKey(name)) { // если имя есть
                System.out.println("имя уже есть");
                repeatName = true;
            }

            if (repeatName) {
                for (Integer value : book.get(name)) {
                    if (value == phone) {
                        System.out.println("есть совпадение номера");
                        repeatPhone = true;
                        break;
                    }
                }
            }
        }

        if (!repeatName & !repeatPhone) { // если нет повторов номера и имени
            book.put(name, new ArrayList<Integer>());
            book.get(name).add(phone);
        }
        if (repeatName & !repeatPhone) { // если есть повтор имени, но нет такого номера
            book.get(name).add(phone);
        }

    }
}
