/**
Принимает от пользователя строку вида 
text~num
Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */
package seminar4;

import java.util.LinkedList;
import java.util.Scanner;

 public class InputSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ввести 'значение_позиция'");
        String input = "";
        String[] temp = {};

        LinkedList<String> linked = new LinkedList<String>();
        for (int i = 0; i < 5; i++) {
            input = sc.nextLine();
            temp = input.split("_");
            linked.add(Integer.parseInt(temp[1]),temp[0]);
            System.out.println(linked);
        }

        if (input.contains("print")) {
            System.out.println(linked.get(Integer.parseInt(temp[1])));
            linked.remove(Integer.parseInt(temp[1]));
        }
        System.out.println(linked);
        sc.close();
    }
}

//public class Task1 {
//     public static void main(String[] args) {
//         System.out.println("Введи текст в виде text/num");
//         Scanner sc = new Scanner(System.in);

//         LinkedList<String> list = new LinkedList<>();
//         for (int i = 0; i < 5; i++) {

//             String listText = sc.nextLine();
//             String[] listTextArray = listText.split("/");
//             listText = listTextArray[0];
//             int textPos = Integer.parseInt(listTextArray[1]);
//             if (listText.equalsIgnoreCase("Print")) {
//                 System.out.println(list.get(textPos));
//                 list.remove(textPos);
//             } else {
//                 list.add(textPos, listText);
//             }
//         }

//         System.out.println(list);
//     }
// }