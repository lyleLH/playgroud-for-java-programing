package com.lylelh;

public class FlowControl {

    void testFunc(){
        int income = 12_000;
        boolean hasHighIncome = false;
        if(income > 10_000) {
            hasHighIncome = true;
        }else hasHighIncome = false;
        System.out.println(hasHighIncome);
    }

}
