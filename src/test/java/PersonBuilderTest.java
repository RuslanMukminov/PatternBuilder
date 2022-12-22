import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonBuilderTest {
    PersonBuilder personBuilder = new PersonBuilder();

    @Test
    void setName() {
        String expectedName = "Name";
        personBuilder.setName(expectedName);
        Assertions.assertEquals(expectedName, personBuilder.name);
    }

    @Test
    void setSurname() {
        String expectedSurname = "Surname";
        personBuilder.setSurname(expectedSurname);
        Assertions.assertEquals(expectedSurname, personBuilder.surname);
    }

    @Test
    void setAge() {
        int expectedAge = 1;
        personBuilder.setAge(expectedAge);
        Assertions.assertEquals(expectedAge, personBuilder.age);
    }

    @Test
    void setAddress() {
        String expectedAddress = "address";
        personBuilder.setAddress(expectedAddress);
        Assertions.assertEquals(expectedAddress, personBuilder.address);
    }

    @Test
    void buildException() {
        Assertions.assertThrows(IllegalStateException.class, () -> personBuilder.build());
    }

    @Test
    void setAgeException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> personBuilder.setAge(-10));
    }
}
