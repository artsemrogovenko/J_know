package seminar6;

import java.time.LocalDate;

public class Vacinations {
    private LocalDate date;
    private String producer;
    private String name;

    public Vacinations(LocalDate date, String producer, String name) {
        this.date = date;
        this.producer = producer;
        this.name = name;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Vacinations [date=" + date + ", producer=" + producer + ", name=" + name + "]";
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
}

