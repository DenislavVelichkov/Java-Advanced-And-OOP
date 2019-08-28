package JavaOOP.Encapsulation_5.ValidationData_3;

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }

    public void setLastName(String lastName) {
        if (lastName.length() <= 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }

        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        if (firstName.length() <= 3) {
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }

        this.firstName = firstName;
    }

    public void setAge(int age) {
        if (age <= 0) {
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }

        this.age = age;
    }

    public double getSalary() {
        return this.salary;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setSalary(double salary) {
        if (salary < 460) {
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }

        this.salary = salary;
    }

    public int getAge() {
        return this.age;
    }

    public void increaseSalary(double bonus) {
        if (this.getAge() > 30) {
            this.salary = this.salary + this.salary * (bonus / 100);
        } else {
            this.salary = this.salary + this.salary * (bonus / 200);
        }
    }

    @Override
    public String toString() {

        return String.format("%s %s gets %f",
                this.getFirstName(), this.getLastName(), this.getSalary());
    }
}
