package program4;

import java.util.Scanner;

public class TestMyPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        while (x == 1) {
            // MyPoint 1
            MyPoint p1 = new MyPoint(7, 10);
            //MyPoint 2
            MyPoint p2 = new MyPoint(5, 20);
            System.out.printf("The distance from MyPoint is: %.2f\n", p1.distance(20, 7));
            System.out.printf("The distance from MyPoint is: %.2f\n", p1.distance(p2));
            System.out.println("If you wish to run again press '1'. To quit the program press '0'");
            x = input.nextInt();
        }
    }
}
