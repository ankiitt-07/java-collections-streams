package com.annotation.custom_annotations.taskinfo;

@TaskInfo(priority = 1, assignedTo = "Task Manager ")
public class TaskManager {
    public void getAnnotationDetails() {
        Class<?> clazz = this.getClass();  // getClass() can be used for only non-static methods

        if (clazz.isAnnotationPresent(TaskInfo.class)) {
            TaskInfo taskInfo = clazz.getAnnotation(TaskInfo.class);
            System.out.println("Task Priority: " + taskInfo.priority());
            System.out.println("Task Assigned To: " + taskInfo.assignedTo());
        }
    }

    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        taskManager.getAnnotationDetails();

    }

}