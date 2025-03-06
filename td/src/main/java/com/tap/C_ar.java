package com.tap;

import java.util.*;

class C_ar{
    public static void main(String[] args){
        System.out.println("> Main > Array example");
        String[] ar = {"TestTom", "TestJack", "TestAnna"};
        C_ar.arrayEg(ar);
    }
    public static void arrayEg(String[] ar){
        List<String> ls1 = new ArrayList<String>();
        
        for (String t:ar){
            ls1.add(t);
        }
        System.out.println(ls1);
        System.out.println(Arrays.toString(ar));
    }
}