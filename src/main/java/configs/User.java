package configs;

public class User {
    public static final User NORMAL_USER = new User("fpenajr@gmail.com", "Marikina@2020");

    private String username;

    private String password;

    public User(String username, String password) {
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
