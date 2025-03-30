package com.annotation.deprecated;

public class Main {
    public static void main(String[] args) {
        LegacyAPI legacyAPI=new LegacyAPI();
        legacyAPI.oldFeature();   // due to @Deprecated annotation we will get warning here
        legacyAPI.newFeature();
    }
}
