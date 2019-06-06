
import java.sql.*;

public class PersonJDBC implements DatabaseActions {

    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String URL = "jdbc:mysql://localhost:3306/task?serverTimezone=UTC&useSSL = false";
    static final String USERNAME = "root";
    static final String PASSWORD  = "password";


    @Override
   public Person getByFirstName(String firstName) throws SQLException, ClassNotFoundException {
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        Person person = new Person();
        String sql = "SELECT secondName,phoneNumber FROM person WHERE firstName = '" + firstName + "'" ;
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery(sql);

     try( connection; statement; resultSet){
      while(resultSet.next()) {


          person.setSecondName(resultSet.getString("secondName"));
          person.setPhoneNumber(resultSet.getInt("phoneNumber"));
      }
     }
     return person;
}

    @Override
   public void UpdateSecondName(Person person) throws SQLException, ClassNotFoundException{
        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        String sql = "UPDATE person SET secondName = ? WHERE firstName = ?";
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        PreparedStatement statement = connection.prepareStatement(sql);
        try(connection; statement){

            statement.setString(1, person.getSecondName());
            statement.setString(2, person.getFirstName());
            statement.executeUpdate();
        }
    }


}
