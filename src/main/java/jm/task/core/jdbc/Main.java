package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();
        //create table
        userService.createUsersTable();
        //Save 5 users
        userService.saveUser("Anna","Do", (byte) 25);
        userService.saveUser("Marya", "Re", (byte) 26);
        userService.saveUser("Petr", "Mi", (byte) 27);
        userService.saveUser("Ivan", "Fa", (byte) 28);
        userService.saveUser("Mark", "So", (byte) 29);
        //Remove User = id ?
        userService.removeUserById(2);
        //Get all users from table
        userService.getAllUsers();
        //Clean table
        userService.cleanUsersTable();
        //Drop table
        userService.dropUsersTable();

    }
}
