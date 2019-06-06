import java.sql.SQLException;

public class Main {
    public static void main(String[] args)  {
        PersonJDBC personJDBC = new PersonJDBC();
      try{
          Person personNew = personJDBC.getByFirstName("Иван");

          System.out.println(" " + personNew.getSecondName() + " " + personNew.getPhoneNumber());


          personNew.setSecondName("Петров");
          personNew.setFirstName("Иван");
          personJDBC.UpdateSecondName(personNew);

          Person person = personJDBC.getByFirstName("Иван");
          System.out.println(person.getSecondName()+ " " + person.getPhoneNumber());

      } catch (SQLException e){
          e.printStackTrace();
      } catch (ClassNotFoundException e){
          e.printStackTrace();
      }
    }
}
