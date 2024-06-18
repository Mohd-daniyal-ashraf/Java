public class Stringmethod {
    public static void main(String [] args){
        String s = "Kodnest pvt lim";

        String s1 = s.toUpperCase();
        System.out.println(s1);

        String s2 = s.toLowerCase();
        System.out.println(s2);

        String s3 = s.substring(8,12);
        System.out.println(s3);

        String s4 = s.substring(3);
        System.out.println(s4);

        int s5 = s.length();
        System.out.println(s5);
        
        boolean pr = s.contains("t");
        System.out.println(pr);

        char s7[] = s.toCharArray();
        for(int i=0;i<s7.length;i++){
            System.out.println(s7[i]);
        }

        String s8[] = s.split(" ");
        System.out.println(s8[0]);

        String s9 = s + " habhai";
        System.out.println(s9);

        char s10 = s.charAt(5);
        System.out.println(s10);

        String s11 = s.trim();
        System.out.println(s11);

        String s12 = s.replace("t", "T");
        System.out.println(s12);

    }
}