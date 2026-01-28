package com.customannotations.advancedlevel.rolebasedaccess;

public class AdminService {

    @RoleAllowed("ADMIN")
    void deleteUser() {
        System.out.println("User deleted");
    }
}