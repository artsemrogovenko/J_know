package seminar4;
/**
 * Реализовать консольное приложение, которое:
 * Принимает от пользователя и “запоминает” строки.
 * Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
 * Если введено revert, удаляет предыдущую введенную строку из памяти.
 */
import java.util.ArrayDeque;
import java.util.Scanner;

public class PopRevert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> list = new ArrayDeque<>();
        String command = "";
        while (true) { // q для выхода
            command = sc.nextLine();
            if(command.equalsIgnoreCase("q")){
              break;
            }

            if (command.equalsIgnoreCase("print")) {
                System.out.println(list);
            } else if (command.equalsIgnoreCase("revert")) {
                list.pop();
                System.out.println(list);
            } else {
                list.push(command);
            }

        }
        sc.close();
     
    }
}
