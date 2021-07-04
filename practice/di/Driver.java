package practice.di;

public class Driver {
    public static void main(String[] args) {
        Car car = new Car();

        car.setTire(new KoreanTire());

        System.out.println(car.getTireBran());
    }
}
