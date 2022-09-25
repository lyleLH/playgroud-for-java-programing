package com.lylelh;

/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

public class RelativelyPrime {
    public static void main(String[] args) {
    int n = Integer.parseInt(args[0]);
    int rowI;
    int columnJ;
    int a;
    int b;
        for (rowI = 1; rowI <= n; rowI++) {
            for (columnJ = 1;  columnJ <= n; columnJ++) {

                a = Math.max(rowI, columnJ);
                b = Math.min(rowI, columnJ);
                int tempo = 0;
                while (b != 0) {
                    tempo = b;
                    b = a % b;
                    a = tempo;
                }

                if (tempo == 1)
                    System.out.print(" *");
                else
                    System.out.print("  ");
            }
        System.out.print("\n");
        }

            }
    }


