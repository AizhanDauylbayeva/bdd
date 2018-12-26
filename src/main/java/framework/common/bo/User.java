package framework.common.bo;

public class User {
    private String username;
    private String pass;

    public User(String username, String pass) {
        this.username = username;
        this.pass = pass;
    }

    public User(){
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String pass) {
        this.pass = pass;
    }

    public String getUsername() {
        return username;
    }

    public String getPass() {
        return pass;
    }
}
