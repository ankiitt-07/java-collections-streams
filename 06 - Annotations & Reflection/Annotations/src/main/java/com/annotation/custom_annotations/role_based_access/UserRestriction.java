package com.annotation.custom_annotations.role_based_access;

import java.lang.reflect.Method;

public class UserRestriction {
    @RoleAllowed(role = Role.ADMIN)
    public static void adminAccess(){
        System.out.println("Accessed by admin only ");
    }
    @RoleAllowed(role=Role.USER)
    public static void userAccess(){
        System.out.println("Accessed by admin and user both");
    }

    public static void restriction(Roles user ){
        Class<?>clazz= UserRestriction.class;
        Method[]methods= clazz.getDeclaredMethods();

        for(Method method:methods){
            if(method.isAnnotationPresent(RoleAllowed.class)){
                RoleAllowed roleAllowed=method.getAnnotation(RoleAllowed.class);
                if(roleAllowed.role()==Role.ADMIN && user.role==Role.ADMIN){
                    adminAccess();
                }
                else if(roleAllowed.role()==Role.USER && user.role==Role.USER){
                    userAccess();
                }
            }
        }
    }

    public static void main(String[] args) {

        Roles user1=new Roles("Rishav" , Role.ADMIN);
        Roles user2=new Roles("Amol" , Role.USER);

        UserRestriction.restriction(user1);
        UserRestriction.restriction(user2);


    }
}
