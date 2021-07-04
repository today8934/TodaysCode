package practice.di;

public class Car {
    Tire tire;

    public Car(Tire tire) {
        this.tire = tire;
    }

    public String getTireBran() {
        return this.tire.getBrand();
    }
}
