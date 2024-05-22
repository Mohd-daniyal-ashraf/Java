class Carinfo{
    String name;
    String color;
    int price;
    void breamaro(String action){
        System.out.println(action);
    }
    Carinfo(String name,String color,int price){
        this.name = name;
        this.color = color;
        this.price = price;
    }
}

class ClassAndObject{
    public static void main(String[] args){
       Carinfo c= new Carinfo("Bugati","Black",10000);
       System.err.println(c.name);
       System.err.println(c.color);
       System.err.println(c.price);
    }
}