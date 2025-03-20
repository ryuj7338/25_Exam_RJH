package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while (n > 0) {
            for (int i = 5; i > 0; i--) {
                System.out.print("");
            }
            System.out.printf("%d ", n);
            n--;

        }





    }
}
