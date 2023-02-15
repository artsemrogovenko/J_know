
import java.io.FileWriter;
import java.io.IOException;
import java.lang.String;
/**
  Напишите метод, который составит строку, состоящую из 100 повторений слова TEST и метод,
  который запишет эту строку в простой текстовый файл, обработайте исключения
 */
import java.util.Scanner;

public class TestWrite {

public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число повторов");
        int repeat = sc.nextInt();
        System.out.println("Какой текст");
        String text = sc.next();
        String export = buildString(repeat, text);
        System.out.println(export);
        WriteFile(export);
        sc.close();
    }

    private static String buildString(int parts, String text) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < parts; i++) {
            str.append(text);
        }
        return str.toString();
    }

    private static void WriteFile(String input) {
        FileWriter file = null;
        try {
            file = new FileWriter("seminar2\\test.txt");
            file.append(input);
        } catch (IOException exception) {
            System.err.println(exception);
        } finally {
            if (file != null) {
                try {
                    file.close();
                } catch (IOException ex) {
                    System.err.println("Ошибка: " + ex);
                }
            }
        }
    }

}
