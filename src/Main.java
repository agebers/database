import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Main {
    private static final String dbUrl = "jdbc:mariadb://localhost:3306/javademo";
    private static final String dbUsername = "myuser";
    private static final String dbPassword = "secret";

    public static void main(String[] args) throws Exception {
        String sqlQuery = "select title from movie where id = 1";

        Connection dbCon = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        Statement stmt = dbCon.createStatement();
        ResultSet result = stmt.executeQuery(sqlQuery);
        result.next();
        String title = result.getString(1);
        System.out.println(title);
        dbCon.close();
    }
}