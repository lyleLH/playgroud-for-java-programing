package com.lylelh;

import java.util.Scanner;

public class MortgageCaculator {

    void  startCal(){
        Scanner scanner = new Scanner(System.in);

        double amount = 0.0;
        do {
            System.out.print("Totoal Amount:");
            amount = scanner.nextDouble() ;
            if((amount>=1000 && amount<=1000000)) break;
            System.out.println("请输入1000 到100,0000之间的数值");

        }while (true);

        double rate = 0.0;

        do {
            System.out.print("Annual Rate:");
            rate = scanner.nextDouble();
            if(rate>0 && rate<=30.0) {
                break;
            }
            System.out.println("请输入大于0 小于或等于30之间的数值");

        } while (true);

        int year = 1;
        do {
            System.out.print("Loan Years:");
                year = scanner.nextInt();
                if((year>=1 && year<=30)) break;
            System.out.println("请输入1 到30之间的数值");
        } while (true);
        System.out.println(caculate(amount,rate,year));
    }


   private String caculate(double princepal,double rate ,int year) {
        double result = 0.0f;
        int month = year * 12;
        double monthRate = rate/12 * 0.01;
        result =  (princepal * (monthRate * Math.pow( (1.0 + monthRate),month)))/(Math.pow(1.0+ monthRate,month) -1);
        return "Monthly Payment is :" + result;
    }
}
