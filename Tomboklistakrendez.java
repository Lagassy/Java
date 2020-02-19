package com.company;
import java.util.Scanner;
public class Tomboklistakrendez {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int[] list =new int[10];
    for (int i = 0; i < 10; i++){
        int a = input.nextInt();
        list[i] = a;
    }
    for(int e = 0; e < 9; e++) {
        for (int t = 0; t < 9; t++) {
            if (list[t] > list[t + 1]) {
                int temp = list[t];
                list[t] = list[t + 1];
                list[t + 1] = temp;
            }
        }
    }
    for (int k = 0; k < list.length; k++) {
        System.out.println(list[k]);
    }
    }
}
