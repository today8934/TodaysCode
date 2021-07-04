package practice.di;

public class Driver {
    public static void main(String[] args) {
        Car car = new Car(new AmericanTire());

        System.out.println(car.getTireBran());
    }
}
