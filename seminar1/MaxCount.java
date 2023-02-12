public class MaxCount {
// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.

public static void main(String[] args) {
    int[] arr = new int[] {1,1,0,1,1,1};
    int count = 0;
    int max = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == 1) {
            count++;
        }
        if (arr[i] != 1) {
            if (count > max) {
                max = count;
            }
            count = 0;
            continue;
        }
    }
    if (count > max) {
        max = count;
    }
    System.out.println(max);
}
}
