abstract class Car{
    public void drive(){
        System.err.println("Drive");
    }
    public abstract void Break();
}

class Tata extends Car{
    public void Break(){
        System.out.println("Break");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Car obj = new Tata();
        obj.drive();
        obj.Break();
    }
}
