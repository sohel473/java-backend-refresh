import java.util.Arrays;
//import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(5000);
        System.out.println("Base Salary: " + employee.getBaseSalary());

        employee.setHourlyRate(50);
        System.out.println("Hourly Rate: " + employee.getHourlyRate());

        int extraHours = 10;
        int wage = employee.calculateWage(extraHours);
        System.out.println("Wage with " + extraHours + " extra hours: " + wage);

    }
}