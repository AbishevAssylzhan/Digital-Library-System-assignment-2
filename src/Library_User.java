import java.util.Objects;

public class Library_User {
    private String user;
    private int id;

    public Library_User() {
        this.user = "Azamat";
        this.id = 1;
    }

    public Library_User(String user, int id) {
        this.user = user;
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public int getId() {
        return id;
    }

    public void setUser(String user) {

        this.user = user;
    }

    public void setId(int id) {

        this.id = id;
    }

    public void displayInfo() {
        System.out.println("User: " + user);
        System.out.println("id: " + id);
    }
    @Override
    public String toString() {
        return user + " (" + id + ")";
    }
    @Override
    public boolean equals(Object o) {
        Library_User user2 = (Library_User) o;
        return id == user2.id && user.equals(user2.user);
    }

    @Override
    public int hashCode() {
        return id + user.hashCode();
    }

}
