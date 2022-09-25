package com.lylelh;

public class MathTest {
    void testFunc() {
        int result =  Math.round(5.4F);
        System.out.println(result);

        double result2 =  Math.ceil(3.14);
        System.out.println(result2);

        double result3 =  Math.floor(8.999);
        System.out.println(result3);

        double result4 =  Math.random() * 100;
        System.out.println(result4);

        int result5 = (int)Math.round(Math.random()* 100) ;
        System.out.println(result5);

    }
}

