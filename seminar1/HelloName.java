
/*     Написать программу, которая запросит пользователя ввести <Имя> в консоли. 
Получит введенную строку и выведет в консоль сообщение “Привет, <Имя>!”
 */
import java.util.Scanner;
public class HelloName {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in, "cp866");
        System.out.println("введите");
        String myName=sc.nextLine();
        //System.out.println(String.format("привет %s!", myName));
        System.out.printf("привет %s!", myName);
        sc.close();
    }         

}