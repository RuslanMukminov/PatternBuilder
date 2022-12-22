import java.util.Objects;
import java.util.OptionalInt;

public class Person {
    protected final String name;
    protected final String surname;
    protected int age = -1;
    protected String address;

    private final String UNSPECIFIED = "не указан";

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public Person(String name, String surname, String address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public OptionalInt getAge() {
        return OptionalInt.of(age);
    }

    public String getAddress() {
        if (address == null) {
            return UNSPECIFIED;
        }
        return address;
    }

    public boolean hasAge() {
        return !(age < 0);
    }

    public void happyBirthday() {
        if (hasAge()) {
            age++;
        }
    }

    public boolean hasAddress() {
        return !(address == null);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        String name = getName();
        String surname = getSurname();
        String ageString;
        if (hasAge()) {
            ageString = String.valueOf(age);
        } else {
            ageString = UNSPECIFIED;
        }
        String address = getAddress();
        return name + " " + surname
                + "(возраст: " + ageString
                + ", адрес: " + address
                + ");";
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder().setSurname(surname).setAddress(address);
    }
}
