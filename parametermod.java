package com.company;
import java.util.Scanner;
public class parametermod {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] lista = new int[10];
        for (int i = 0; i < 10; i++){
            int a = input.nextInt();
            lista[i] = a;
        }
        tombki(lista);
        tombpoz(lista);
        tombki(lista);
    }

    public static void tombpoz(int[] t){
        for(int i = 0; i < t.length; i++){
            if(t[i] < 0){
                t[i] = t[i]*-1;
            }
        }
        System.out.print("\n");
        for(int k = 0; k < t.length; k++){
            System.out.print(t[k]);
            System.out.print(" ");
        }
    }

    public static void tombki(int[] t){
        System.out.print("\n");
        for (int i = 0; i < t.length; i++){
            System.out.print(t[i]);
            System.out.print(" ");
        }
    }
}
