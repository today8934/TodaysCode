package practice.solid.ocp;

public class Driver {
    public static void main(String[] args) {
        Car matiz = new Matiz();
        Car sonata = new Sonata();

        matiz.controlWindow();
        matiz.controlGear();

        sonata.controlWindow();
        sonata.controlGear();

    }
}
