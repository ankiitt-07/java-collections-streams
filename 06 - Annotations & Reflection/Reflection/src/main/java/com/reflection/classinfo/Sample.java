package com.reflection.classinfo;

public class Sample {
    String name;
    int age;
    String role;

    public Sample(String name, int age, String role) {
        this.name = name;
        this.age = age;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public static void verifyAge(int age){
        if(age<18){
            System.out.println("Underage");
        }
        else{
            System.out.println("Age verified");
        }
    }

    public static void main(String[] args) {
        Sample sample=new Sample("Rishav" , 22 , "Developer");

        ClassInfo.getInfo(sample);
    }
}
