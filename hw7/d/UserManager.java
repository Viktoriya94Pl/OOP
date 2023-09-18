package hw7.d;

public class UserManager {
    private IUserRepository userRepository;

    public UserManager (IUserRepository userRepository){
        this.userRepository = userRepository;
    }
    public void saveUser (User user){
        userRepository.save(user);
    }
}
