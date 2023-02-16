package lesson2_hw;
/* 
Реализуйте алгоритм сортировки пузырьком числового массива, 
результат после каждой итерации запишите в лог-файл.
 */

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class BubbleSort {
    public static void main(String[] args) throws SecurityException, IOException {
        Logger log = Logger.getLogger(BubbleSort.class.getPackageName());
        FileHandler fh = new FileHandler("lesson2_hw\\log.txt");
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        log.addHandler(fh);

        int[] array = { 3, 1, 5, 0, 7, 9, 8 };
        log.log(Level.INFO, Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    log.log(Level.INFO, Arrays.toString(array));
                }
            }
            // System.out.printf("%d %s\n",i,Arrays.toString(array));
        }
    }
}








