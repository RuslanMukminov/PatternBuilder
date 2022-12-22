public class PersonBuilder {
    protected String name;
    protected String surname;
    protected int age = -1;
    protected String address;

    public PersonBuilder setName(String name) throws IllegalArgumentException {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Некорректное имя");
        }
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) throws IllegalArgumentException {
        if (surname.isEmpty()) {
            throw new IllegalArgumentException("Некорректная фамилия");
        }
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Некорректный возраст");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() throws IllegalStateException {
        if (name == null) {
            throw new IllegalStateException("Не указано имя");
        }
        if (surname == null) {
            throw new IllegalStateException("Не указана фамилия");
        }

        return new Person(name, surname, age, address);
    }
}
