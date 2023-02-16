package lesson2_hw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * В файле содержится строка с исходными данными в такой форме:
 * {"name":"Ivanov", "country":"Russia", "city":"Moscow", "age":"null"}
 * Требуется на её основе построить и вывести на экран новую строку, в форме SQL
 * запроса:
 * SELECT * FROM students WHERE name = "Ivanov" AND country = "Russia" AND city
 * = "Moscow";
 * Для разбора строки используйте String.split.
 * Сформируйте новую строку, используя StringBuilder. Значения null не
 * включаются в запрос.
 */

public class ToSQL {
    public static void main(String[] args) {
        String filename = "lesson2_hw\\data.txt";
        String result = lineRead(filename);
        System.out.println(result);
        result = lineRemove(result, "null");
        String[] keys = { "name", "country", "city" };
        showLine(result, keys);
    }

    public String readFile(String file) {
        return lineRead(file);
    }

    private static void showLine(String inputStr, String[] keys) {
        StringBuilder show = new StringBuilder();
        show.append("SELECT * FROM students WHERE ");
        show.append(inputStr);
        for (String subline : keys) {
            if (inputStr.contains(subline)) {
                show.replace(show.indexOf(subline) - 1,
                            subline.length() + show.indexOf(subline) + 1,
                            subline);
            }
        }
        System.out.println(show.toString().replaceAll(":", "="));
    }

    private static String lineRead(String filename) {
        StringBuilder res = new StringBuilder();
        try (BufferedReader fin = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = fin.readLine()) != null) {
                res.append(line);
            }
        } catch (IOException ex) {
            System.err.println(ex);
        }
        return res.toString();
    }

    private static String lineRemove(String line, String exclude) {
        StringBuilder res = new StringBuilder();
        String[] export = line.toString().replaceAll("[{}]", "").split(",");
        if (exclude != null) {
            for (String string : export) {
                if (string.contains(exclude)) { // если встритился параметр null
                    continue;
                }
                res.append(string + " AND");
            }
        }
        res.delete(res.length() - 4, res.length());
        return res.toString();
    }

}