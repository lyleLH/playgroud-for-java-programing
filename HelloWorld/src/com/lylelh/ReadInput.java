package com.lylelh;

import java.util.Scanner;

public class ReadInput {
    void testFunc(String[] args){
        Scanner  scanner = new Scanner(System.in);
        System.out.print("Age:");
        byte age = scanner.nextByte();
        System.out.println("You are " + age);

        System.out.print("Name:");
        String name = scanner.nextLine();
        System.out.println("Hello  " + name);
    }
}
