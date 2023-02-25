/**
Реализуйте очередь с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очереди, 
dequeue() - возвращает первый элемент из очереди и удаляет его, 
first() - возвращает первый элемент из очереди, не удаляя.
  */
package lesson4_hw;

import java.util.LinkedList;
import java.util.Scanner;

public class QueueList {

  public static void main(String[] args) {
    LinkedList<String> mylist = new LinkedList<String>();
    Scanner sc = new Scanner(System.in);
    String data = null;
    String operation = "";

    boolean loop = true;
    while (loop) {
      System.out.println("1 помещает элемент в конец очереди,\n"
          + "2 возвращает первый элемент из очереди и удаляет его,\n"
          + "3 возвращает первый элемент из очереди, не удаляя.\n"
          + "q выход\n");

      operation = sc.nextLine();

      if (operation.equals("1")) {
        System.out.print("ввести значение для ячейки: ");
        data = sc.next();
        mylist = enqueue(mylist, data);
      }
      if (operation.equals("2")) {
        dequeue(mylist);
      }
      if (operation.equals("3")) {
        first(mylist);
      }
      if (operation.equals("q")) {
        loop = false;
      }
      System.out.println("\nLinked = " + mylist);
    }
    sc.close();
  }

  private static int showLast(LinkedList<String> list) { // определяю последний номер в очереди
    int max = 0;
    String[] temp;
    if (list.size() > 0) {
      for (int i = 0; i < list.size(); i++) {
        temp = list.get(i).split("~");
        if (Integer.parseInt(temp[1]) > max) {
          max = Integer.parseInt(temp[1]);
        }
      }
    } else {
      return max = 0;
    }
    return max + 1;
  }

  private static int showFirst(LinkedList<String> list) { // определяю первый номер в очереди
    String[] temp = list.get(0).split("~");
    int min = Integer.parseInt(temp[1]);
    int firstQueue = 0;
    if (list.size() > 0) {
      for (int i = 0; i < list.size(); i++) {
        temp = list.get(i).split("~");
        if (Integer.parseInt(temp[1]) < min) {
          min = Integer.parseInt(temp[1]);
          firstQueue = i;
        }
      }
    } else {
      return firstQueue = 0;

    }
    return firstQueue;

  }

  private static LinkedList<String> enqueue(LinkedList<String> name, String value) {
    int count = 0;
    System.out.println(name.size());
    count = showLast(name);
    name.add(name.size(), value + "~" + Integer.toString(count));
    return name;
  }

  private static void dequeue(LinkedList<String> name) {
    int element = showFirst(name);
    System.out.println("Первый в очереди был " + name.get(element));
    name.remove(element);
  }

  private static void first(LinkedList<String> name) {
    int element = showFirst(name);
    System.out.println("Первый в очереди: " + name.get(element));
  }
  
}
