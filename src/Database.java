import java.sql.*;

public class Database {
    private String dbUrl;
    private String dbUsername;
    private String dbPassword;
    private Connection dbCon;
    private ResultSet resultSet;
    private PreparedStatement preparedStatement;

    public Database(String databaseName, String username, String password, String databasePort) {
        dbUrl = "jdbc:mariadb://localhost:" + databasePort + "/" + databaseName;
        dbUsername = username;
        dbPassword = password;
    }

    public String getMovieTitle(int id) throws SQLException {
        String title = "";
        String sqlQuery = "SELECT title FROM movie WHERE id = ?";
        open();
        preparedStatement = dbCon.prepareStatement(sqlQuery);
        preparedStatement.setInt(1, id);
        resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            title = resultSet.getString("title");
        }

        close();
        return title;
    }

    public void open() throws SQLException {
        try {
            dbCon = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        }
        catch(SQLException e) {
            e.printStackTrace();
        }
    }

    public void close() throws SQLException {
        dbCon.close();
    }
}
