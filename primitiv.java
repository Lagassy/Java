package com.company;

public class primitiv {

    public static void ki2(int a, int b){
    System.out.println(a + "/" + b);
    }

    public static void elo2(int a, int b){
        a = a*-1;
        b = b*-1;
        System.out.println(a +"/"+ b);
    }

    public static void main(String[] args) {
    int a = 2;
    int b = 3;
    elo2(a , b);
    ki2(a , b);
    }
}
