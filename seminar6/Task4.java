package seminar6;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/* 
1. Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>. Поместите в него некоторое количество объектов.
2. Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество. Убедитесь, что все они сохранились во множество. 
3. Создайте метод public boolean equals(Object o)
Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, метод должен возвращать true, только если значения во всех полях сравниваемых объектов равны.
4. Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились.

 */
public class Task4 {
    public static void main(String[] args) {
    Set<Cat> myCats=new HashSet<>();
    myCats.add(new Cat("тайсон", "артем", "манул", LocalDate.of(2000, 6, 15), "рыжий"));
    myCats.add(new Cat("тайсон", "артем", "манул", LocalDate.of(2000, 6, 15), "рыжий"));
    myCats.add(new Cat("джексон", "артем", "шотландец", LocalDate.of(2002, 7, 15), "черный"));
    myCats.add(new Cat("майк", "артем", "ковбой", LocalDate.of(2011, 6, 15), "белый"));
        System.out.println(myCats);
}
}
