class Carinfo{
    String name;
    String color;
    int price;
    void breamaro(String action){
        System.out.println(action);
    }
}

class ClassAndObject{
    public static void main(String[] args){
       Carinfo c= new Carinfo();
       c.name = "Bugati";
       c.color="Black";
       c.price = 100000000;
       System.err.println(c.name);
       System.err.println(c.color);
       System.err.println(c.price);
       c.breamaro("Ha bhai kya haal hai");
    }
}