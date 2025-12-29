import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Reference type variable
        Date date = new Date();
        // print current date and time
        System.out.println("Current date and time: " + date);

        // primitve vs reference
        int a = 10; // primitive type
        int b = a; // copy value of a to b
        b = 20; // change value of b
        System.out.println("Primitive types:");
        System.out.println("a: " + a); // a remains 10
        System.out.println("b: " + b); // b is now 20

        Date date1 = new Date(); // reference type
        Date date2 = date1; // copy reference of date1 to date2
        date2.setTime(0); // change date2 to epoch time
        System.out.println("Reference types:");
        System.out.println("date1: " + date1); // date1 is also changed
        System.out.println("date2: " + date2); // date2 is epoch time



    }
}