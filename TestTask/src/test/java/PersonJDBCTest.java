import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class PersonJDBCTest {
    PersonJDBC mockPerson = Mockito.mock(PersonJDBC.class);



    @Test
    public void getTable() throws Exception{
        Person person = new Person();
        person.setSecondName("Иванов");
        person.setPhoneNumber(72332);
        when(mockPerson.getByFirstName("Иван")).thenReturn(person);
        assertEquals(mockPerson.getByFirstName("Иван"), person);
        verify(mockPerson).getByFirstName("Иван");
    }


}
