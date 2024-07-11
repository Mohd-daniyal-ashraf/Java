
public class method {
    public static void main(String[] args){
        squredemo sd = new squredemo();
        // sd.findsq(4);
        int ans = sd.findsq(5);
        System.out.println(ans);
    }   
}

//Method - not return - no arguments
// class squredemo{
//     void findsq(){
//         int a = 20;
//         a = a * a;
//         System.out.println("square "+a);
//     }
// }

//Method - not return - with arguments
// class squredemo{
//     void findsq(int a){
//         a = a * a;
//         System.out.println("square "+a);
//     }
// }

//Method -  return - with arguments
class squredemo{
    int findsq(){
        int a = 23;
        a = a * a;
        return a;
    }
}

//Method -  return - with arguments
class squredemo{
    int findsq(int a){
        a = a * a;
        return a;
    }
}