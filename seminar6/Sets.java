package seminar6;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.  Распечатайте содержимое данного множества.
 */
//List.of в 1.8 не работает 
public class Sets {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(List.of (4, 5, 6, 1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(hashSet);// [1, 2, 3, 4, 5, 6]

        Set<Integer> linkedHashSet = new LinkedHashSet<>(List.of (4, 5, 6, 1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(linkedHashSet);//  [4, 5, 6, 1, 2, 3]

        Set<Integer> treeSet = new TreeSet<>(List.of (4, 5, 6, 1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(treeSet);// [1, 2, 3, 4, 5, 6]


    }
}
