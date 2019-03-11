package JavaOOP.Inheritance_7.Exercise.Mankind_3;

public class Human {
    private String firstName;
    private String lastName;

    public Human(String firstName, String lastName) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    private void setFirstName(String firstName) {
        if (!Character.isUpperCase(firstName.charAt(0))) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected upper case " +
                            "letter!Argument: %s", firstName
                    ));
        }
        if (firstName.length() < 4) {
            throw new IllegalArgumentException(
                   String.format(
                           "Expected length at least " +
                           "4 symbols!Argument: %s", firstName
                   ));
        }

        this.firstName = firstName;
    }

    protected void setLastName(String lastName) {
        if (!Character.isUpperCase(lastName.charAt(0))) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected upper case " +
                                    "letter!Argument: %s", lastName
                    ));
        }
        if (lastName.length() < 3) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected length at least " +
                                    "3 symbols!Argument: %s", lastName
                    ));
        }

        this.lastName = lastName;
    }

}
