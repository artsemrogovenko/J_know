package lesson5_hw;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Пусть дан список сотрудников: Иван, Пётр, Антон и так далее. Написать
 * программу, которая найдет и выведет повторяющиеся имена с количеством
 * повторений. Отсортировать по убыванию популярности.
 */
public class ListWorkers {
    public static void main(String[] args) {
        Map<Integer, String> lst = new LinkedHashMap<>();
        Map<String, Integer> dict = new TreeMap<>();
        lst.put(1, "Семён");
        lst.put(2, "Иван");
        lst.put(3, "Пётр");
        lst.put(4, "Антон");
        lst.put(5, "Семён");
        lst.put(6, "Пётр");
        lst.put(7, "Антон");
        lst.put(8, "Семён");
        lst.put(9, "Пётр");
        lst.put(10, "Сергей");
        lst.put(11, "Семён");


        for (Map.Entry<Integer, String> entry : lst.entrySet()) { // подсчет сколько сотрудников с одинаковым именем
            String key = entry.getValue();

            if (dict.containsKey(key)) { // если имя есть
                int count = dict.get(key) + 1;
                dict.put(key, count);
            } else { // если нету имени добавить
                dict.put(key, 1);
            }
        }

        System.out.println(dict);        
        showPopularity(dict);
    }

    private static void showPopularity(Map<String, Integer> dict) {
        int[] popularity = new int[dict.size()];

        int index = 0;
        for (Map.Entry<String, Integer> entry : dict.entrySet()) { // заполнение массива значениями из списка имен
            popularity[index] = entry.getValue();
            index++;
        }

        for (int j = 0; j < popularity.length; j++) { // сортировка
            for (int i = 0; i < popularity.length - 1; i++) {
                if (popularity[i] < popularity[i + 1]) {
                    int temp = popularity[i];
                    popularity[i] = popularity[i + 1];
                    popularity[i + 1] = temp;
                }
            }
        }

        for (int i = 0; i < popularity.length; i++) { // отображение по убыванию

            for (Map.Entry<String, Integer> entry : dict.entrySet()) {
                String key = entry.getKey();
                int value = entry.getValue();

                if (value == popularity[i]) {
                    System.out.print(entry+" ");
                    dict.remove(key);
                    break;
                }
            }
        }
    }


}
