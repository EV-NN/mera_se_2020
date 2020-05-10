class Person {
    String firstName;
    String lastName;

    Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getFirstName() {
        return firstName;
    }

    String getLastName() {
        return  lastName;
    }

    @Override
    public String toString() {
        return lastName + ", " + firstName;
    }
}
