package app;

public class User {

    private final String name;
    private final String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public String toString() {
        return "Username: " + name + ", " + "E-mail: " + email;
    }
}
