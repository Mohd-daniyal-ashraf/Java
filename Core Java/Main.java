class Car {
    static int staticVar = 0;
    int nonStaticVar;

    public Car(int value) {
        staticVar = value; 
    }

    static void displayStatic() {
        System.out.println("Static var: " + staticVar);
    }
    void displayNonStatic() {
        System.out.println("Non-static var: " + nonStaticVar);
    }
}

public class Main {
    public static void main(String[] args) {
        Car obj1 = new Car(10); 
        obj1.displayNonStatic();          
        Car.staticVar = 100;
        Car.displayStatic();  
    }
}
