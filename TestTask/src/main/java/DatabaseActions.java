import java.sql.SQLException;

public interface DatabaseActions {

   public void UpdateSecondName(Person person) throws SQLException, ClassNotFoundException;

   public Person getByFirstName(String name) throws SQLException, ClassNotFoundException;

}
