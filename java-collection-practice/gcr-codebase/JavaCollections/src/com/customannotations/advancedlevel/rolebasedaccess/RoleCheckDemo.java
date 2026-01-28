package com.customannotations.advancedlevel.rolebasedaccess;

import java.lang.reflect.Method;

public class RoleCheckDemo {
    static String currentRole = "USER";

    public static void main(String[] args) throws Exception {
        AdminService service = new AdminService();
        Method method = service.getClass().getDeclaredMethod("deleteUser");

        RoleAllowed role = method.getAnnotation(RoleAllowed.class);

        if (role.value().equals(currentRole)) {
            method.invoke(service);
        } else {
            System.out.println("Access Denied!");
        }
    }
}