package com.lylelh;

import java.text.NumberFormat;

public class NumberFormate {
    void testFunc(){
        NumberFormat currency =  NumberFormat.getCurrencyInstance();
        String result = currency.format(123456.789);
        System.out.println(result);

        NumberFormat percent =  NumberFormat.getPercentInstance();
        String result2 = percent.format(123456.789);
        System.out.println(result2);
    }

}
