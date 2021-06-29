package practice.abstractclass;

public class Driver {
    public static void main(String[] args) {
        Animal lion = new Lion();
        Animal mouse = new Mouse();

        lion.cry();
        mouse.cry();
    }
}
