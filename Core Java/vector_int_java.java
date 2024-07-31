import java.util.Stack;
import java.util.Vector;

public class vector_int_java {
    public static void main(String [] args){
        // Vector<Integer> v = new Vector<>(); 
        // v.add(34);
        // v.add(23);
        // v.add(23);
        // v.add(23);
        // v.add(6);
        // v.add(1,100);
        // for(int i: v){
        //     System.out.print(i + " ");
        // }
        String s = "(u(love)i)";
        Stack<Character> st = new Stack<>();
        StringBuilder t = new StringBuilder();
        for(char  x: s.toCharArray()){
            if(x == ')'){
                while(st.peek() != '('){
                    t.append(st.pop());
                }
                st.pop();
                for(char c: t.toString().toCharArray()){
                    st.push(c);
                }
                t.setLength(0);
            }else{
                st.pop();
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!st.empty()){
            ans.append(st.pop());
        }
        ans.reverse();
        System.out.println(ans);
    }
}

