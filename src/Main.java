import java.sql.*;

public class Main {
    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/Asyl3oop";
        String user = "postgres";
        String password = "8985";

        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();

            stmt.executeUpdate(
                    "INSERT INTO book(name, author, year, pages) VALUES ('Abai Zholy', 'Mukhtar Auezov', 1942, 500)"
            );
            stmt.executeUpdate(
                    "INSERT INTO book(name, author, year, pages) VALUES ('Ushkan uya', 'Baurzhan Momyshuly', 1956, NULL)"
            );

            ResultSet rs = stmt.executeQuery("SELECT * FROM book");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                                rs.getString("name") + " | " +
                                rs.getString("author") + " | " +
                                rs.getInt("year") + " | " +
                                rs.getInt("pages")
                );
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
