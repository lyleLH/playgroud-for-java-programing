package com.lyleLH;

public class FirstBadVersion {

    public static int firstBadVersion(int n) {
            int lo = 0;
            int hi = n - 1;


            while(lo < hi){
                int len = hi - lo +1;
                int mid = 0;
                int step = 0;
                if (len%2 == 0){
                    step = (int)(Math.floor((double)(len/2.0))) -1 ;
                }else{
                    step = (int)(Math.floor((double)(len/2.0))) ;
                }
                mid = lo+ step;
                if(isBadVersion(mid)){
                    return mid;
                }else {
                    lo = mid + 1;
                }
            }
            return -1;
        }

    public static boolean isBadVersion(int n) {
        return  n==4;
    }
}
