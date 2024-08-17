public class Main {
    private static final String databaseName = "javademo";
    private static final String dbUsername = "myuser";
    private static final String dbPassword = "secret";
    private static final String dbPort = "3306";
    private static Database database;

    public static void main(String[] args) throws Exception {
        database = new Database(databaseName, dbUsername, dbPassword, dbPort);
        String title = database.getMovieTitle(1);
        System.out.println(title);
    }
}