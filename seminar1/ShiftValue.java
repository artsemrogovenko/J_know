
import java.util.Arrays;
public class ShiftValue {
// Дан массив nums = [3,2,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, а остальные - равны ему.

public static void main(String[] args) {
    int[] arr = new int[] { 3, 2, 3, 2, 2, 3 };
    int val = 3;
    int pos = arr.length - 1;
    for (int i = 0; i < pos; i++) {
        if (arr[i] == val) {
            while (arr[pos] == 3 && pos > i) {
                pos--;
            }
            int temp = arr[i];
            arr[i] = arr[pos];
            arr[pos] = temp;
            pos--;
        }
    }
    System.out.println(Arrays.toString(arr)); // печать массива
}
}


// list = [1, 2, 3]
// list.append (4)


// ArrayList<Integer> list = new ArrayList<Integer> ();
// list.add (1);
// list.add (2);
// list.add (3);
// list.add (4);

//Integer.parseInt(str)
