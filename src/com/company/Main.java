package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int result = function(a, b);

        System.out.println(result);
    }

    static int function (int a, int b){
        if (a == 0)
            return b;
        if (b == 0)
            return a;
        if (a >= b)
            return function(a % b, b);
        return function(a, b % a);
    }
}
