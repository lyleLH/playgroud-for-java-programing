package com.lylelh;

import java.awt.*;
import java.util.Arrays;
import java.util.Date;

public class HelloWorld {
   void hellworld(){
//       byte age = 30;
//       long viesCount = 3_123_456_789L;
//       float price = 10.99F;
//       double sales = 59.332;
//       char letter = 'A';
//       boolean isEligible = false;
//
//       Date now = new Date();
//       System.out.println("Hello World , My name is Tom");
//       System.out.println(now);
//
//       Point point1 = new Point(1,1);
//       Point potin2 = point1;
//       point1.x = 2;
//       System.out.println(potin2);

       String message = "Hello World" + "!!";
       System.out.println(message.endsWith("!!"));
       System.out.println(message.length());
       System.out.println(message.indexOf("e"));
       System.out.println(message.indexOf("o"));
       System.out.println(message.replace("e","E"));
       System.out.println(message);

       int[] numbers  =  new int[5];
       numbers[1] = 2;
       numbers[3] = 4;
       System.out.println(Arrays.toString(numbers));

       int[] numbers2 = {1,9,8,4,5,6,7,3,2,0};
       System.out.println(Arrays.toString(numbers2));
       Arrays.sort(numbers2);
       System.out.println(Arrays.toString(numbers2));

       short x = 1;
       int y = x+1;
       System.out.println(y);

   }
}
