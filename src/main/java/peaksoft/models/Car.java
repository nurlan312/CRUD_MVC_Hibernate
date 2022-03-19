package peaksoft.models;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue
    private Long id;
    private String mark;
    private int price;

    @OneToOne(mappedBy = "car",cascade = CascadeType.ALL)
    private User user;

    public Car(Long id, String mark, int price) {
        this.id = id;
        this.mark = mark;
        this.price = price;
    }

    public Car(String mark, int price) {
        this.mark = mark;
        this.price = price;
    }

    public Car() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", price=" + price +
                '}';
    }
}
