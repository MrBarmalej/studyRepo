package Lesson32.SessionFacade;

interface UserService {
    void createUser(String username, String password);

    void deleteUser(String username);
}