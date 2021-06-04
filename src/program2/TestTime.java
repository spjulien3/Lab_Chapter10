package program2;

import java.util.Scanner;

public class TestTime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = 1;
        while (x == 1) {
            //Time is set at 555550000 milliseconds and is then used in setTime
            Time t1 = new Time(555550000);
            //Will print Hour: 10 Minute: 19 Second: 10
            System.out.println(t1);

            //Time is set at default (0 milliseconds), and System.currrentTimeMillis() is then used in setTime
            Time t2 = new Time();
            //Will print Hour: 18 Minute: 44 Second: 52
            System.out.println(t2);
            System.out.println("If you wish to run again press '1'. To quit the program press '0'");
            x = input.nextInt();
        }
    }
}
