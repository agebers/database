import java.sql.SQLException;

public class Main {
    private static final String dbName = "javademo";
    private static final String dbUsername = "myuser";
    private static final String dbPassword = "secret";
    private static final String dbPort = "3306";
    private static Database database;

    public static void main(String[] args) throws SQLException {
        database = new Database(dbName, dbUsername, dbPassword, dbPort);
        String title = database.getMovieTitle(1);
        System.out.println(title);
    }
}