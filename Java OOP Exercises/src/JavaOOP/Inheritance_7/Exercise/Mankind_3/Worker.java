package JavaOOP.Inheritance_7.Exercise.Mankind_3;

public class Worker extends Human {
    private double weekSalary;
    private double workHoursPerDay;

    public Worker(String firstName, String lastName, double weekSalary, double workHoursPerDay) {
        super(firstName, lastName);
        this.setWeekSalary(weekSalary);
        this.setWorkHoursPerDay(workHoursPerDay);
    }

    public double getWeekSalary() {
        return this.weekSalary;
    }

    public double getWorkHoursPerDay() {
        return this.workHoursPerDay;
    }

    @Override
    protected void setLastName(String lastName) {
        /*if (!Character.isUpperCase(lastName.charAt(0))) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected upper case " +
                                    "letter!Argument: %s", lastName
                    ));
        }*/
        if (lastName.length() <= 3) {
            throw new IllegalArgumentException(
                   "Expected length more than" +
                            " 3 symbols!Argument: lastName"
            );
        }
        super.setLastName(lastName);
    }

    private void setWeekSalary(double weekSalary) {
        if (weekSalary <= 10d) {
            throw new IllegalArgumentException(
                            "Expected value mismatch!" +
                                    "Argument: weekSalary");
        }

        this.weekSalary = weekSalary;
    }

    private void setWorkHoursPerDay(double workHoursPerDay) {
        if (workHoursPerDay < 1d || workHoursPerDay > 12d) {
            throw new IllegalArgumentException(
                           "Expected value mismatch!" +
                                   "Argument: workHoursPerDay"
            );
        }

        this.workHoursPerDay = workHoursPerDay;
    }

    private double calculateSalaryPerHour() {
        double weekWorkingHours = this.workHoursPerDay * 7d;
        return this.weekSalary / weekWorkingHours;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb
        .append(String.format("First Name: %s", super.getFirstName()))
        .append(System.lineSeparator())
        .append(String.format("Last Name: %s", super.getLastName()))
        .append(System.lineSeparator())
        .append(String.format("Week Salary: %.2f", this.getWeekSalary()))
        .append(System.lineSeparator())
        .append(String.format("Hours per day: %.2f", this.getWorkHoursPerDay()))
        .append(System.lineSeparator())
        .append(String.format("Salary per hour: %.2f", this.calculateSalaryPerHour()))
        ;
        return sb.toString().trim();
    }
}
