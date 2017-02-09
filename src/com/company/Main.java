package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // create a scanner so we can read the command-line input
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter an integer or type q to quit: ");
            String q = scanner.next();
            int arg;
            if (q.equals("q"))
                break;
            else
                arg = Integer.parseInt(q);
            double ret = Math.pow(Math.E, arg);
            System.out.println("e^" + arg + "=" + ret);
        }

    }

}
