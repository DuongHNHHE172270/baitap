/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HAI DUONG
 */
import java.util.Scanner;

public class part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter number a: ");
        a = sc.nextInt();
        System.out.println("Enter number b: ");
        b = sc.nextInt();
        System.out.println("Enter number c: ");
        c = sc.nextInt();

        int max = a;
        if (a < b) {
            max = b;
        }
        if (max < c) {
            max = c;
        }

        System.out.println("MAX = " + max);
    }
}

