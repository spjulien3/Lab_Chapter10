package program3;

import java.util.Scanner;

public class TestMyInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int y = 1;
        while (y == 1) {
            //first object
            MyInteger i = new MyInteger(8);
            //second object
            MyInteger x = new MyInteger(8);
            //toString will print out "Integer:8 Even: true Odd:false Prime: false"
            System.out.println(i);
            //static method used to see if a number is even or not will print false
            System.out.println("This value is even: " + MyInteger.isEven(7));
            //will compare a given number to the method and see if MyInteger equals that number. Will print false
            System.out.println(i.equals(7));
            //creating a char array with numerical char values to be converted to integers
            char[] c = new char[3];
            c[0] = '1';
            c[1] = '2';
            c[2] = '3';
            // static method that converts an array of numeric char values to an array of integer values. will print 1 2 3
            MyInteger.parseInt(c);
            // static method that converts a string to an array of integer values. will print 1234
            MyInteger.parseInt("1234");
            System.out.println("If you wish to run again press '1'. To quit the program press '0'");
            y = input.nextInt();
        }

    }

}
