package com.company;
public class Primszamok {

    public static void main(String[] args) {
	int n = 2;
	int db = 0;
	while(db != 100){
		if(prim_e(n) == 2){
			System.out.println(n);
			db++;
        }
		n++;
    }
    }
    public static int prim_e(int x){
	int cnt = 0;
	for (int i = 1; i <= x; i++){
		if (x % i == 0){
			cnt++;
			}
			}
	return cnt;
		}
}
