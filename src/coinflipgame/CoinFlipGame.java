/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coinflipgame;

import java.util.Scanner;

/**
 *
 * @author Anup-Xtha
 */
public class CoinFlipGame {

   public static void main(String[] args) {
        boolean t = true;

        while (t) {

            Scanner sc = new Scanner(System.in);    //System.in is a standard input stream  
            System.out.println("Choose Head Or Tail");
            String a = sc.nextLine();

            double b = Math.random();
            String computer = null;

            if (a.toLowerCase().equals("head") || a.toLowerCase().equals("tail")) {
                if (b >= 0.5) {
                    computer = "head";
                    System.out.println("head");
                } else {
                    computer = "tail";
                    System.out.println("tail");
                }

                if (a.equals(computer)) {
                    System.out.println("you win");
                    boolean x = true;

                    while (x) {

                        Scanner i;
                        i = new Scanner(System.in);
                        System.out.println("Do you want to continue, Yes or No");
                        String y = i.nextLine();

                        if (y.toLowerCase().equals("yes") || y.toLowerCase().equals("no")) {
                            if (y.toLowerCase().equals("yes")) {
                                t = true;
                            } else {
                                t = false;
                            }
                            x = false;
                        } else {
                            System.out.println("Please type yes|Yes or No|no. Your input was " + y);
                            x = true;
                        }

                    }

                } else {
                    System.out.println("you loss");
                    boolean v = true;

                    while (v) {

                        Scanner i = new Scanner(System.in);
                        System.out.println("Do you want to continue, Yes or No");
                        String y = i.nextLine();

                        if (y.toLowerCase().equals("yes") || y.toLowerCase().equals("no")) {
                            if (y.toLowerCase().equals("yes")) {
                                t = true;
                            } else {
                                t = false;
                            }
                            v = false;
                        } else {
                            System.out.println("Please type yes|Yes or No|no. Your input was " + y);
                            v = true;
                        }

                    }

                }
            } else {
                System.out.println("Please type 'head'|'Head' or 'tail'|'Tail', Your input was," + a);
            }

        }

    }
    
}
