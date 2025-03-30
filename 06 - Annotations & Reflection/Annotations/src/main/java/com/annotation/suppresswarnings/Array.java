package com.annotation.suppresswarnings;

import java.util.ArrayList;

public class Array {
    @SuppressWarnings({"unchecked" , "rawtypes"})  // It will suppress the warnings
    public static void createArray(){
        ArrayList list=new ArrayList();
        list.add("hello");
        list.add("world");

        System.out.println(list);
    }

    public static void main(String[] args) {
        Array.createArray();
    }
}
