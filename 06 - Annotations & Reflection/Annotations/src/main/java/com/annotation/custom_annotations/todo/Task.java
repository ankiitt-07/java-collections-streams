package com.annotation.custom_annotations.todo;

import java.lang.reflect.Method;

public class Task {
    @Todo(todo = "develop game" , assignedTo = "Developer" , priority = Priority.HIGH)
    public static void task1(){
        System.out.println("pending");
    }
    @Todo(todo = "Analyse Market" , assignedTo = "Analyst" , priority = Priority.LOW)
    public static void task2(){
        System.out.println("pending");
    }
    @Todo(todo = "Employee Report" , assignedTo = "Manager" , priority = Priority.MEDIUM)
    public static void task3(){
        System.out.println("pending");
    }

    public static void getTask(){
        Class<?>clazz = Task.class;
        Method[]method = clazz.getDeclaredMethods();

        for(Method mthd : method){
            if(mthd.isAnnotationPresent(Todo.class)){
                Todo todo=mthd.getAnnotation(Todo.class);
                System.out.println(todo);
            }
        }
    }
    public static void main(String[] args) {
        Task.getTask();
    }
}
