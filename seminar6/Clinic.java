package seminar6;
/* 1. Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
Можно записать в текстовом виде, не обязательно реализовывать в java. */

//"editor.parameterHints.enabled": 

import java.time.LocalDate;

public class Clinic {
    public static void main(String[] args) {
        Vacinations vaccina = new Vacinations(LocalDate.of(22, 1, 1), "phaser", "столбняк");
        // System.out.println(vacination);
        // vacination.setDate();
        // System.out.println(vaccina.getDate());
        Cat cat = new Cat("борис", "Куклачев", "домовой", LocalDate.of(20, 1, 1), "мульти");
        cat.addVaccine(vaccina);
        cat.addVaccine(new Vacinations(LocalDate.of(19, 54, 5), "chime", "энцефалит"));
        System.out.println(cat);
    }
}