package com.company;

public class Main {
    public static void escada(int n){

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");

        }


    }

    public static void main(String[] args) {
	// write your code here
        escada(6);
    }
}
