package lesson5_hw;

/** 
 * Реализовать алгоритм пирамидальной сортировки (HeapSort).
 * http://www.algolib.narod.ru/Sort/Piramidal.html
 */
import java.util.Arrays;


public class Pyram {
    public static void main(String[] args) {
        int[] array = { 10, 20, 31, 1, 2, 32, 30, 2, 8, 15, 17, 3, 5, 11, 24 };
        //int[] array={3, 6, 5, 1, 4, 7,8,9,10,11,12,13,14,15,16};
        //int[] array = { 3, 8, 5, 1, 6, 7, 4 };
        makeHeap(array);
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void makeHeap(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) {
            compare(arr, arr.length, i);
        }
    }

    private static void compare(int[] arr, int size, int i) {
        int max = i;
        int a = 2 * i + 1;
        int b = 2 * i + 2;

        if (a < size && arr[b] > arr[max]) {// если не вышел за предел массива
            max = a;
        }

        if (b < size && arr[b] > arr[max]) {// если не вышел за предел массива
            max = b;
        }

        if (max != i) { // Если самый большой элемент не родитель
            int swap = arr[i];
            arr[i] = arr[max];
            arr[max] = swap;
            compare(arr, size, max);
        }
    }

    private static void heapSort(int[] arr) {
        for (int writemax = arr.length - 1; writemax >= 0; writemax--) {
            int temp = arr[0];
            arr[0] = arr[writemax];
            arr[writemax] = temp;
            compare(arr, writemax, 0);
        }
    }
 }

/**работает наполовину */
// public class Pyram {
//     public static void main(String[] args) {
//         // int[] array = { 10, 20, 31, 1, 2, 32, 30, 2, 8, 15, 17, 3, 5, 11, 24 };
//         //int[] array={3, 6, 5, 1, 4, 7,8,9,10,11,12,13,14,15,16};
//        int[] array = { 3, 8, 5, 1, 6, 7, 4 };

//         makeHeap(array);
//         System.out.println(Arrays.toString(array));

//     }

//     private static void makeHeap(int[] arr) {
//         int startindex = getStartIndex(arr);
//         int size = arr.length - 1;
//         // sortup(arr, startindex, arr.length-1);
//         System.out.println(Arrays.toString(arr));

//         for (int index = startindex; index >= 0; index--) {
//             System.out.println("startindex = " + startindex);
//             if (startindex == 0) {
//                 break;
//             }
//             sortup(arr, index, size);
//             size--;
//         }
//     }

//     private static int getStartIndex(int[] name) {
//         int level = 0;
//         while (true) { // какое макс. количество уровней
//             if (Math.pow(2, level) <= name.length) {
//                 level++;
//             } else
//                 break;
//         }
//         System.out.println("levels= " + level);
//         int currentLevel = level - 1;// предпослежний этаж кучи}
//         return (int) (Math.pow(2, currentLevel) - 2); // предпоследний узел
//         //return  name.length/ 2 - 1; // предпоследний узел
//     }

//     private static void sortup(int[] array, int start, int positionMax) {

//         for (int i = start; i >= 0; i--) { // формирую пирамиду по возрастанию

//             int childA = array[2 * i + 1];
//             int parent = array[i];

//             if ((2 * i + 2) <= array.length) {
//                 int childB = array[2 * i + 2];
//                 if (childA > childB) {
//                     if (childA > parent) {
//                         int temp = parent;
//                         array[i] = childA;
//                         array[2 * i + 1] = temp;

//                         sortup(array, i,positionMax);
//                     }
//                     continue;
//                 }
//                 if (childB > parent) {
//                     int temp = parent;
//                     array[i] = childB;
//                     array[2 * i + 2] = temp;
//                     sortup(array, i,positionMax);
//                 }

//             }else if (childA > parent){ // если ветки Б нет
//                 int tmp = parent;
//                 array[i] = childA;
//                 array[2 * i + 1] = tmp;
//                 sortup(array, i,positionMax);
//             }
//         } // end for
//         if(array[0]>array[positionMax]){
//             int num =  array[positionMax];
//             array[positionMax]=array[0];
//             array[0]=num;
//         }
       
//     }

// }
