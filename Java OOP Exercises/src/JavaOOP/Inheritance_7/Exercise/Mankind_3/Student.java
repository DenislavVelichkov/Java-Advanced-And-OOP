package JavaOOP.Inheritance_7.Exercise.Mankind_3;

public class Student extends Human {
    private String facultyNumber;

    public Student(String firstName, String lastName, String facultyNumber) {
        super(firstName, lastName);
        this.setFacultyNumber(facultyNumber);
    }

    public String getFacultyNumber() {
        return this.facultyNumber;
    }

    private void setFacultyNumber(String facultyNumber) {
        int fNumberLength = facultyNumber.length();

        if (fNumberLength < 5 || fNumberLength > 10) {
            throw new IllegalArgumentException(
                    "Invalid faculty number!"
            );
        }

        this.facultyNumber = facultyNumber;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("First Name: %s", super.getFirstName()))
        .append(System.lineSeparator())
        .append(String.format("Last Name: %s", super.getLastName()))
        .append(System.lineSeparator())
        .append(String.format("Faculty number: %s", this.getFacultyNumber()));
        return sb.toString().trim();
    }
}
