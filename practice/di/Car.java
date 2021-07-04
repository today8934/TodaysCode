package practice.di;

public class Car {
    Tire tire;

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public String getTireBran() {
        return this.tire.getBrand();
    }
}
