package practice.di;

public class Car {
    Tire tire;

    public Car() {
        this.tire = new KoreanTire();
    }

    public String getTireBran() {
        return this.tire.getBrand();
    }
}
