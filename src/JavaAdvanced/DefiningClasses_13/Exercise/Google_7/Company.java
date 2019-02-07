package JavaAdvanced.DefiningClasses_13.Exercise.Google_7;

public class Company {
    public String name;
    public String department;
    public String salary;

    public Company(String name, String department, String salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.join(" ", this.name, this.department, this.salary);
    }

}
