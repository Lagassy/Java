package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] t = new int [10];
    for(int i = 0; i <= 9; i++) {
        System.out.println("Adjon meg egy számot");
        t[i] = input.nextInt();
        }
    for (int k = 0; k < t.length; k++){
        System.out.println(t[k]);
    }
    int s = 0;
    for(int x : t){
        s = s + x;
        }
    s = s / 10;

        for (int z : t){
            if(z > s){
                System.out.println(z);
        }
    }
    }
}
