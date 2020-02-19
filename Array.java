package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <= 9; i++){
            System.out.println("Adjon meg egy számot");
            int a = input.nextInt();
            list.add(a);
        }
    int c = 0;
    for (int x : list){
        c = c + x;
    }
    c = c/10;
    System.out.println("Ezek nagyobbak mint az átlag:");
    for (int k = 0; k < list.size(); k++){
        if(list.get(k) > c){
            System.out.println(list.get(k));
        }
    }
    }
}