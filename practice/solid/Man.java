package practice.solid;

public class Man extends Person implements Boyfriend, Son{

    @Override
    public void anyversary() {
        System.out.println("기념일을 기념기념");
    }

    @Override
    public void kiss() {
        System.out.println("쫔쫔");
    }

    @Override
    public void pee() {
        System.out.println("쉬야쉬야");
    }

    @Override
    public void sayHello() {
        System.out.println("여어~");
    }

    @Override
    public void hyodo() {
        System.out.println("용돈을 한달천만원드립니다.");
    }

    @Override
    public void massage() {
        System.out.println("어깨를 주물주물");
    }
}
