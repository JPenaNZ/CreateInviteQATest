package configs;

public class UserDummy {
    public static final UserDummy NORMAL_USER = new UserDummy("xxxx@gmail.com", "xxxxx");

    private String username;

    private String password;

    public UserDummy(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

}
