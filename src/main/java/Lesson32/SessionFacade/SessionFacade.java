package Lesson32.SessionFacade;

class UserManagementFacade {
    private final UserService userService;
    private final ProfileService profileService;

    public UserManagementFacade() {
        this.userService = new UserServiceImpl();
        this.profileService = new ProfileServiceImpl();
    }

    public void registerUser(String username, String password, String profileData) {
        userService.createUser(username, password);
        profileService.updateProfile(username, profileData);
    }

    public void deleteUser(String username) {
        userService.deleteUser(username);
    }
}