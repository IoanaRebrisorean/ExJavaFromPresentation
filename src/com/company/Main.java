package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Exercice 1:

       /* System.out.println("Number1= ");
        int number1 = scan.nextInt();

        System.out.println("Number2= ");
        int number2 = scan.nextInt();

        System.out.println("Number3= ");
        int number3 = scan.nextInt();*/

        // Exercice 2:

//        System.out.println("Ch=");
//        String character = scan.next();

        // Exercice 3:
//        System.out.println("Year= ");
//        int year = scan.nextInt();
//        System.out.println("LeapYear " + LeapYear(year));

        //Exercice 4:
        //  int n = scan.nextInt();
//        firstNumbers();

        //Exercice 5:
//        reverse(12345);

        //Exercice 6:
//        stars();

        //Exercice 7:
//        fibonacci();

        //Exercice 8:
//        System.out.println("Firs word: ");
//        String word1 = scan.next();
//        System.out.println("Second word: ");
//        String word2 = scan.next();
//        compare2(word1, word2);



        // Exercice 1
       /* System.out.println("Max is: " + max(number1, number2, number3));
        System.out.println("Min is: " + min(number1, number2, number3));*/

        //Exercice 2:
//        System.out.println("Character is") ;
//        UpperCase(character.charAt(0));


    }

    // Exercice 1: Given 3 numbers, print the biggest and the smallest

    public static int max(int number1, int number2, int number3) {
        int max = 0;
        if (number1 > number2 && number1 > number3) {
            max = number1;
        } else if (number3 > number2 && number3 > number1) {
            max = number3;
        } else {
            max = number2;
        }
        return max;
    }

    public static int min(int number1, int number2, int number3) {
        int min = 0;
        if (number1 < number2 && number1 < number3) {
            min = number1;
        } else if (number1 < number2 && number1 > number3) {
            min = number3;
        } else {
            min = number2;
        }
        return min;
    }

    // Exercice 2: Given one character, print it if it is an upper case letter, otherwise print an error message.

    public static void UpperCase(char character) {
        if (character >= 'A' && character <= 'Z') {
            System.out.println(character + " is an upper case");
        } else {
            System.out.println("Error");
        }
    }

    //Exercice 3: Given a a strictly positive integer, find out whether it is a leap year(366 days) or not.

    public static boolean LeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    //Exercice 4: Print the first 100 even numbers

    public static void firstNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    // Exercice 5: Print the reverse of a given number (123 → 321)

    public static void reverse(int n) {
        do {
            System.out.print(n % 10);
            n = n / 10;
        }
        while (n > 0);
    }

//  Exercice 6: Using 2 for loops, produce the output shown below:
//******
//*****
//****
//***
//**
//*

    public static void stars() {
        int i;
        int j;
        for (i = 1; i < 7; i++) {
            for (j = 7; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//    Exercice 7:  Generate the first 20 Fibonacci numbers

    public static void fibonacci() {
        int a = 0;
        int b = 1;
        int i;
        int c;
        int count = 20;
        System.out.print(a + " " + b);
        for (i = 2; i < count; i++) {
            c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
    }

    //Exercice 8: Given 2 words from the keyboard, print “Great” if they are the same, “Good” if they are the same but different case, “Okayish” if they are the same length and “Bad” if they do not meet any of the criteria.

    //Case1
    public static void compare(String word1, String word2 ){
        int l1 = word1.length();
        int l2 = word2.length();
        int lmin = Math.min(l1, l2);
        boolean s=true;

        for ( int i = 0; i < lmin; i++){
            int word1_ch = (int)word1.charAt(i) ;
            int word2_ch = (int)word2.charAt(i) ;

            if ( word1_ch != word2_ch){
                s= false;
            }
        }
        if (s){
            System.out.println("Great");
        }

    }

    //Case2
    public static void compare2(String word1, String word2 ) {
        int l1 = word1.length();
        int l2 = word2.length();
        if (word1.equals(word2)) {
            System.out.println("Great");
        }
        else if ( word1.equalsIgnoreCase(word2)){
            System.out.println("Good");
        }
        else if( l1 == l2 ){
            System.out.println("Okayish");
        }
        else{
            System.out.println("Bad");
        }
    }


}
