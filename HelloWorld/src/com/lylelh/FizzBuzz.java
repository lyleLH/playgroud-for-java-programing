package com.lylelh;

import java.util.Scanner;

public class FizzBuzz {
    void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number:");
        int num = scanner.nextInt();
        System.out.println(fizzBuzz(num));
    }

    String fizzBuzz(int num) {
        String result = "";
        boolean fizz = (num % 5 == 0);
        boolean buzz = (num % 3 == 0);
        if (fizz) {
            result = "Fizz";
        }
        if (buzz) {
            result = "Buzz";
        }
        if (fizz && buzz) {
            result = "FizzBuzz";
        }

        if (!(fizz || buzz)) {
            result = Integer.toString(num);
        }

        return result;
    }
}
