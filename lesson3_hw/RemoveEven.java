/**
 * Пусть дан произвольный список целых чисел. Удалить из него чётные числа.
 */
package lesson3_hw;

import java.util.ArrayList;

public class RemoveEven {
    public static void main(String[] args) {
        int size = 10;
        ArrayList<Integer> arr = new ArrayList<Integer>(size);

        for (int i = 0; i < size; i++) { // неполучилось получить размер списка
            arr.add((int) (Math.random() * (200 + 1)) - 100); // 200 является диапазоном от -100 до +100 включительно
        }
        System.out.println(arr);

        for (int i = 0; i < arr.size(); i++) {
            if ((int) arr.get(i) % 2 == 0) {
                arr.remove(i);
                i--;
            }
        }
        System.out.println(arr);

    }

}
