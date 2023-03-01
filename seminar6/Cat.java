package seminar6;

import java.time.LocalDate;
import java.util.ArrayList;

/* 
*  Продумайте структуру класса Кот. Какие поля и методы будут актуальны для приложения, которое является
а) информационной системой ветеринарной клиники
б) архивом выставки котов
в) информационной системой Театра кошек Ю. Д. Куклачёва
*/

public class Cat {
    private String name;
    private String owner;
    private String breet; // порода
    private LocalDate date; // др
    private String color;// окрас
    private ArrayList<Vacinations> vactines = new ArrayList<>();//

    public Cat(String name, String owner, String breet, LocalDate date, String color, ArrayList<Vacinations> vactines) {
        this.name = name;
        this.owner = owner;
        this.breet = breet;
        this.date = date;
        this.color = color;
        this.vactines = vactines;
    }

    public Cat(String name, String owner, String breet, LocalDate date, String color) {
        this.name = name;
        this.owner = owner;
        this.breet = breet;
        this.date = date;
        this.color = color;
    }

    public void addVaccine(Vacinations vacine) {// добавляет новую прививку
        vactines.add(vacine);
    }

    @Override
    public String toString() {
        return "Cat [name=" + name + ", owner=" + owner + ", breet=" + breet + ", date=" + date + ", color=" + color
                + "]\n";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Cat)) {
            return false;
        }
        Cat other = (Cat) obj;
        return 
         this.name.equals(other.name)  &&  this.owner.equals(other.owner);     
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((owner == null) ? 0 : owner.hashCode());
        result = prime * result + ((breet == null) ? 0 : breet.hashCode());
        result = prime * result + ((date == null) ? 0 : date.hashCode());
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        result = prime * result + ((vactines == null) ? 0 : vactines.hashCode());
        return result;
    }
    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBreet() {
        return breet;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getColor() {
        return color;
    }

}
