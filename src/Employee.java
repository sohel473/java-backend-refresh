public class Employee {
    private int baseSalary;
    private int hourlyRate;

    private static int numberOfEmployees = 0;

    public Employee(int baseSalary) {
        this(baseSalary, 0);
    }

    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public static String getNumberOfEmployeesInfo() {
        return "Number of employees: " + numberOfEmployees;
    }


    public int getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) {
            throw  new IllegalArgumentException("Base salary must be greater than 0.");
        }
        this.baseSalary = baseSalary;
    }


    public int getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0) {
            throw  new IllegalArgumentException("Hourly rate must be greater than 0.");
        }
        this.hourlyRate = hourlyRate;
    }

    public int calculateWage() {
        return baseSalary;
    }

    public int calculateWage(int extraHours) {
        return baseSalary + (hourlyRate * extraHours);
    }


}
