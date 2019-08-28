package JavaAdvanced.DefiningClasses_13.Exercise.Google_7;

public class Company {
    public String name;
    public String department;
    public double salary;

    public Company(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.join(" ", this.name, this.department, String.format("%.2f",this.salary));
    }

}
