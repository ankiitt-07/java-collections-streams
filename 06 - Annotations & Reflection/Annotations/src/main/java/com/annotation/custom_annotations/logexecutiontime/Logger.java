package com.annotation.custom_annotations.logexecutiontime;

import java.lang.reflect.Method;

public class Logger {
    @LogExecutionTime
    public static void logging1(){
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
    @LogExecutionTime
    public static void logging2(){
       for(int i=0;i<1000;i++){

       }
    }

    public static void loggedTime(){
        Class<?>clazz= Logger.class;

        Method[]methods=clazz.getDeclaredMethods();

        for( Method method : methods){
            if(method.isAnnotationPresent(LogExecutionTime.class)){
                LogExecutionTime annotation = method.getAnnotation(LogExecutionTime.class);
                long startTime = System.currentTimeMillis();

                try {
                    method.invoke(null); // Invoke the static method dynamically
                } catch (Exception e) {
                    System.out.println("Error executing method: " + e.getMessage());
                }

                long timeElapsed = System.currentTimeMillis() - startTime;
                System.out.println("Execution time of " + method.getName() + ": " + timeElapsed + "ms");
            }
        }
    }

    public static void main(String[] args) {
        Logger.loggedTime();
    }

}
