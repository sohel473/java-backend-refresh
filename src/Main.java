import java.util.Arrays;
//import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        var employee1 = new Employee(4000);
        var employee2 = new Employee(5000, 20);

        System.out.println(Employee.getNumberOfEmployeesInfo());

        System.out.println("Employee 1 wage: " + employee1.calculateWage());
        System.out.println("Employee 2 wage with 10 extra hours: " + employee2.calculateWage(10));
    }
}