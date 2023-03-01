package seminar6;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/* 1. Напишите метод, который заполнит массив из 1000 элементов случайными числами от 0 до 24. 
1.5. Создайте метод, в который передайте заполненный выше массив, и с помощью Set вычислите процент уникальных значений в данном массиве, и верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] array = new int[1000];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(25);
        }
        System.out.println(caclPercent(array));
    }

    private static float caclPercent(int[] array) {
        Set<Integer> uniqe = new HashSet<>();
        for (int index = 0; index < array.length; index++) {
            uniqe.add(array[index]);
        }
        return uniqe.size()*100/(float)array.length;
    }
}
