package com.annotation.custom_annotations.todo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Todo {
    String todo() default "Ideal";
    String assignedTo() default " ";
    Priority priority() default Priority.LOW;
}
