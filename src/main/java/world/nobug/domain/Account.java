package world.nobug.domain;

public class Account {
    String username;

    public Account(String username) {
        this.username = username;
    }


    // Getter and Setter用于序列化
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
