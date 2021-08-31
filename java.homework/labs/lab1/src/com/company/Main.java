package com.company;
import java.lang.String;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static long qFactorial(int n) {
        long sum1 = 1;
        for (int q = 2; q <= n; q++) {
            sum1 *= q;
        }
        return sum1;
    }

    ;

    public static void main(String[] args) {
        System.out.println("введите к");
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        System.out.println(qFactorial(k));

    }
}