public class HelloWorld {
    
    
    public static void main(String[] args) {
        int abc = 3;
        System.out.println(abc);
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.print();
        
        
    }
    
    
    public void print(){
        HelloWorld2 helloWorld2 = new HelloWorld2();
        
        helloWorld2.print();
    }
    
}


class HelloWorld2 extends HelloWorld3 {
    static int abc = 2;
    
    @Override
    public void print(){
        System.out.println(super.abc);
    }
}

class HelloWorld3  {
    int abc = 1;
    
    public void print(){
        System.out.println("Hello World");
    } 
    
}


