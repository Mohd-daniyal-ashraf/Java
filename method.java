// package com.methods.demo;
public class method {
    public static void main(String[] args){
        squredemo sd = new squredemo();
        sd.findsq();
    }   
}
class squredemo{
    void findsq(){
        int a = 20;
        a = a * a;
        System.out.println("square "+a);
    }
}