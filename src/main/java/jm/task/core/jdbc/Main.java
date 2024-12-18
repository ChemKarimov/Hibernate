package jm.task.core.jdbc;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();
        userService.saveUser("Ivan", "Ivanov", (byte) 20);
        userService.saveUser("Max", "Nok", (byte) 21);
        userService.saveUser("Olga", "Io", (byte) 24);
        userService.saveUser("Kate", "Nio", (byte) 27);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}