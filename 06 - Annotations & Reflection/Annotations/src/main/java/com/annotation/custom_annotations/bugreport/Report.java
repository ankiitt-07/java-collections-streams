package com.annotation.custom_annotations.bugreport;
import java.lang.reflect.Method;

public class Report {

    @BugReport(description ="NullPointerException when input is null")
    @BugReport(description ="ArrayIndexOutOfBoundsException in edge cases")
    public static void printBugReport(){
        try{
            Class<?> bugs = Report.class;   //.class can be used for both static and non-static
            Method method = bugs.getMethod("printBugReport");
            BugReport[] bugReports = method.getAnnotationsByType(BugReport.class);

            for (BugReport br : bugReports){
                System.out.println("Bug: " + br.description());
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        Report report=new Report();
        report.printBugReport();
    }
}
