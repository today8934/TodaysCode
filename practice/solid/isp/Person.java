package practice.solid.isp;

public abstract class Person {

    private int age;
    private String name;

    public void breathe() {
        System.out.println("씁하씁하");
    }

    public void eat() {
        System.out.println("얌냠쩝쩝");
    }

    public void pee(){
        System.out.println("쉬야준수~~~~~~");
    }

    public abstract void sayHello();

}
