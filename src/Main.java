import java.util.Arrays;
//import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        // Reference type variable
//        Date date = new Date();
//        // print current date and time
//        System.out.println("Current date and time: " + date);
//
//        // primitive vs reference
//        int a = 10; // primitive type
//        int b = a; // copy value of a to b
//        System.out.println("Before changing b:");
//        System.out.println("a: " + a); // a is 10
//        System.out.println("b: " + b); // b is 10
//        b = 20; // change value of b
//        System.out.println("After changing b:");
//        System.out.println("a: " + a); // a remains 10
//        System.out.println("b: " + b); // b is now 20
//
//        // Reference type example
//        Date date1 = new Date(); // create a new Date object
//        Date date2 = date1; // copy reference of date1 to date2
//        System.out.println("Before changing date2:");
//        System.out.println("date1: " + date1); // print date1
//        System.out.println("date2: " + date2); // print date2
//        date2.setTime(0); // change date2 to epoch time
//        System.out.println("After changing date2:");
//        System.out.println("date1: " + date1); // date1 is also changed
//        System.out.println("date2: " + date2); // date2 is changed
//
//        // String immutability
//        String str1 = "Hello";
//        String str2 = str1; // copy reference of str1 to str2
//        System.out.println("before changing str2:");
//        System.out.println("str1: " + str1); // print str1
//        System.out.println("str2: " + str2); // print str2
//        str2 = "World"; // change str2 to a new string
//        System.out.println("after changing str2:");
//        System.out.println("str1: " + str1); // str1 remains "Hello"
//        System.out.println("str2: " + str2); // str2 is now "World"

        // Array
        int[] arr1 = new int[5]; // create an array of size 5
        arr1[0] = 10; // set first element to 10
        arr1[1] = 20; // set second element to 20
        System.out.println("Before changing arr2:");
        System.out.println("arr1[0]: " + arr1[0]); // print first element of arr1
        System.out.println("arr1[1]: " + arr1[1]); // print second element of arr1
        int[] arr2 = arr1; // copy reference of arr1 to arr2
        arr2[0] = 100; // change first element of arr2
        System.out.println("After changing arr2:");
        System.out.println("arr1[0]: " + arr1[0]); // arr1[0] is also changed
        System.out.println("arr2[0]: " + arr2[0]); // arr2[0] is changed
        // print both arrays in string format
        System.out.println("arr1: " + Arrays.toString(arr1));
        System.out.println("arr2: " + Arrays.toString(arr2));











    }
}