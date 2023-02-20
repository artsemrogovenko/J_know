/**Задан целочисленный список ArrayList. Найти минимальное, 
 * максимальное и среднее арифметичское этого списка.  */
package lesson3_hw;

import java.util.ArrayList;

public class MinMaxAvg {
    public static void main(String[] args) {
        int size=10;
        ArrayList<Integer> simple = new ArrayList<Integer>(size);

        for (int i = 0; i < size; i++) { // неполучилось получить размер списка
            simple.add((int) (Math.random() * (20 + 1))); // 20 является диапазоном от 0 до 20 включительно
        }

        System.out.println(simple);
        int min = 0;
        int max = 0;
        int sum = 0;
        for (Integer integer : simple) {
            if (min > integer) {
                min = integer;
            }
            if (max < integer) {
                max = integer;
            }
            sum += integer;
        }
        double avg = sum / simple.size();
        System.out.printf("max=%d min=%d среднее=%.2f\n",max,min,avg);
    }
}
