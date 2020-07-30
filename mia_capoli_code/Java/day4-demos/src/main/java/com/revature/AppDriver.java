package com.revature;

import com.revature.varargs.AppUser;
import com.revature.varargs.Role;

public class AppDriver {
    // you can legally use variable arguments with the main method signature, but that isn't super common
    public static void main(String[] args) {

        AppUser user = new AppUser("capolimia", "password", new Role[] {Role.TRAINER});
        user.addRoles(Role.DEV, Role.BLDG_MNGR, Role.ADMIN); // variable args allows us to pass in a varying number of args to the addRoles method
        System.out.println(user);
    }

}

