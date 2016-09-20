package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner((System.in));

        int n = scan.nextInt();

        long startTime = System.nanoTime();


        long threeMultiples = Math.floorDiv((n-1),3);
        long fiveMultiples = Math.floorDiv((n-1),5);
        long fifteenMultiples = Math.floorDiv((n-1),15);


        System.out.println(3*(threeMultiples*(threeMultiples+1)/2) +
                5*(fiveMultiples*(fiveMultiples+1)/2) -
                15*(fifteenMultiples*(fifteenMultiples+1)/2));


        // (n(n+1))/2

        long endTime = System.nanoTime();

        System.out.println("Time Taken: " + (endTime - startTime)+"ns");
    }
}




