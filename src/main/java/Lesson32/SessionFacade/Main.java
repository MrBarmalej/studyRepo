package Lesson32.SessionFacade;

public class Main {
    public static void main(String[] args) {
        UserManagementFacade facade = new UserManagementFacade();
        facade.registerUser("John", "password123", "Some data");
        facade.deleteUser("John");
    }
}