package JavaOOP.Inheritance_7.Exercise.Animals_6;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        this.setName(name);
        this.setAge(age);
        this.setGender(gender);
    }

    public void setName(String name) {
        if (validateInput(name)) {
            throw new IllegalArgumentException(
                    "Invalid input!"
            );
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException(
                    "Invalid input!"
            );
        }
        this.age = age;
    }

    protected void setGender(String gender) {
        if (validateInput(gender)) {
            throw new IllegalArgumentException(
                    "Invalid input!"
            );
        }
        this.gender = gender;
    }

    private boolean validateInput(String field) {
        boolean legalProperty = true;

        if (field.isEmpty()) {
            legalProperty = false;
        }

        return !legalProperty;
    }

    protected String produceSound() {
        return "Not implemented!";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String classes = getClass().getSimpleName();

        sb.append(classes)
                .append(System.lineSeparator())
                .append(this.name)
                .append(" ")
                .append(this.age)
                .append(" ")
                .append(this.gender)
                .append(System.lineSeparator())
                .append(this.produceSound());

        return sb.toString();
    }
}