package com.reflection.dynamicallycreateobjects;

public class Student {
    String name;
    String course;
    int year;

    public Student(String name, String course, int year) {
        this.name = name;
        this.course = course;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", year=" + year +
                '}';
    }

    public static void main(String[] args) {
       Student st= (Student)CreateObject.createObj(Student.class,"Rishav" ,"CSE" , 4);
        System.out.println(st);
    }
}
