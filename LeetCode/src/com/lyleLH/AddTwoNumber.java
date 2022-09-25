package com.lyleLH;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }


class Solution {

    public static void test(){
        ListNode l1 = new ListNode(3,new ListNode(7,new ListNode(8)));
        ListNode l2 = new ListNode(8,new ListNode(9));
        ListNode res = addTwoNumbers(l1,l2);
        System.out.println(res);
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(9);
        int len1 = length(l1);
        int len2 = length(l2);
        int maxlength = Integer.max(len1,len2);
        int minLength = Integer.min(len1,len2);

//        System.out.println(valueAtIndex(1,l1));
//        System.out.println(valueAtIndex(1,l2));
        ListNode res = l1;
        for (int i = len1 - 1 ; i >= 0;i--){
            for (int j = len2 -1;j >=0 ;j --){
                int last =  valueAtIndex(i,l1) + valueAtIndex(j,l2);
                res.val = last;
                System.out.println(last);
            }

        }
        return  result;
    }
    public  static int valueAtIndex(int index,ListNode list){
        int count = 0;
        ListNode temp = list;
        while (count != index){
            count ++;
            temp = temp.next;
        }
        return  temp.val;
    }

    public static int length(ListNode list){
        int len = 1;
        ListNode node = list;
        while (node.next !=null){
            len ++;
            node = node.next;
        }
        return  len;

    }
}
