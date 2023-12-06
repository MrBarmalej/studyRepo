package Lesson32.SessionFacade;


class UserServiceImpl implements UserService {
    @Override
    public void createUser(String username, String password) {

        System.out.println("User '" + username + "' created.");
    }
    @Override
    public void deleteUser(String username) {

        System.out.println("User '" + username + "' deleted.");
    }
}
class ProfileServiceImpl implements ProfileService {
    @Override
    public void updateProfile(String username, String newProfileData) {

        System.out.println("Profile updated for user '" + username + "': " + newProfileData);
    }
}


