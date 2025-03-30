package com.annotation.deprecated;

public class LegacyAPI {
    @Deprecated
    public void oldFeature(){
        System.out.println("Old feature");
    }

    public void newFeature(){
        System.out.println("New Feature");
    }
}
