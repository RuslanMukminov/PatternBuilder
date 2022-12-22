import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PersonTest {
    String name = "Name";
    String surname = "Surname";
    Person person = new Person(name, surname);

    @Test
    void getName() {
        String expectedName = person.name;
        Assertions.assertEquals(expectedName, person.getName());
    }

    @Test
    void getSurname() {
        String expectedSurname = person.surname;
        Assertions.assertEquals(expectedSurname, person.getSurname());
    }

    @Test
    void getAge() {
        int expectedAge = person.age;
        if (person.getAge().isPresent()) {
            expectedAge = person.getAge().getAsInt();
        }
        Assertions.assertTrue(expectedAge < 0);
    }

    @Test
    void getAddress() {
        String expectedAddress = "не указан";
        Assertions.assertEquals(expectedAddress, person.getAddress());
    }

    @Test
    void hasAge() {
        Assertions.assertFalse(person.hasAge());
    }

    @Test
    void happyBirthday() {
        int expectedAge = person.age;
        person.happyBirthday();
        Assertions.assertTrue(expectedAge < 0);
    }

    @Test
    void hasAddress() {
        Assertions.assertFalse(person.hasAddress());
    }

    @Test
    void setAddress() {
        String expectedAddress = "City";
        person.setAddress(expectedAddress);
        Assertions.assertEquals(expectedAddress,person.getAddress());
    }
}