/** Реализовать алгоритм сортировки слиянием. */
package lesson3_hw;

import java.util.Arrays;

public class Sort {
  public static void main(String[] args) {
    int[] array = { 33, 56, 29, 70, -93, 92, 97, 90, -6, -54 };
    // int[] array = {33, 56, 29, 70, -93};
    int[] result = sort(array); //
    System.out.println(Arrays.toString(array));
    System.out.println(Arrays.toString(result));
  }

  public static int[] sort(int[] arr) {
    if (arr.length <= 1) {
      return arr;
    }
    int[] left = Arrays.copyOfRange(arr, 0, arr.length / 2);
    int[] right = Arrays.copyOfRange(arr, left.length, arr.length);
    return merge(sort(left), sort(right));
  }

  private static int[] merge(int[] left, int[] right) {
    int[] result = new int[left.length + right.length];
    int pos = 0; // result index
    int left_Index = 0;
    int right_Index = 0;

    while ((left_Index < left.length) & (right_Index < right.length)) {
      if (left[left_Index] < right[right_Index]) {
        result[pos] = left[left_Index];
        left_Index++;
        pos++;
      } else {
        result[pos] = right[right_Index];
        right_Index++;
        pos++;
      }
    }
    //System.out.printf("le-%d  ri-%d\n", left_Index, right_Index);

    while (pos < result.length) {
      if (left_Index != left.length) {
        result[pos] = left[left_Index];
        left_Index++;
        pos++;
      } else {
        result[pos] = right[right_Index];
        right_Index++;
        pos++;
      }
    }
    //System.out.printf("le-%d  ri-%d\n", left_Index, right_Index);

    return result;
  }

}
