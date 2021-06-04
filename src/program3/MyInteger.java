package program3;

public class MyInteger {
    private int value;
//constructor takes in a value to use for the methods
    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
//uses remainder to take the value of the object and determine even or odd
    public boolean isEven(){
        int x = value%2;
        if ( x==0){
            return true;
        }
        else {
            return false;
        }
    }
// same as even, but flipped
    public boolean isOdd(){
        int x = value%2;
        if ( x!=0){
            return true;
        }
        else {
            return false;
        }
    }
//uses a for loop to run through all the numbers between the value and
    //looks for another factor other than itself and one to determine if prime
    public boolean isPrime() {
        for (int i = 2; i < value; i++) {
            if (value % 2 == 0) {
                return false;
            }
        }
            return true;
    }
//static version of isEven() that takes an integer
    public static boolean isEven(int value){
        int x = value%2;
        if ( x==0){
            return true;
        }
        else {
            return false;
        }
    }
//static version of isOdd() that takes an integer
    public static boolean isOdd(int value){
        int x = value%2;
        if ( x!=0){
            return true;
        }
        else {
            return false;
        }
    }
//static version of isPrime() that takes an integer
    public static boolean isPrime(int value) {
        for (int i = 2; i < value; i++) {
            if (value % 2 == 0) {
                return false;
            }
        }
        return true;

    }
    //overloaded
    public boolean equals(MyInteger i){
        if (value== i.value){
            return true;
        }
        return false;

    }

    public boolean equals(int i){
        if (value== i){
            return true;
        }
        return false;

    }
    // static method that takes in a char array and prints out and returns that array as an integer array
    public static int[] parseInt(char[] c){
        int[]x= new int[c.length];
        for (int i = 0; i < c.length; i++) {
            int ascii = (int) c[i];
            x[i]= ascii -48;

        }
        System.out.print("Char values as Integer values are: ");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]+", ");

        }
        System.out.println();


        return x;
    }
    // static method that takes in a string and prints out and returns that string as an integer array
    public static int[] parseInt(String s){
        int[]x= new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int ascii = (int) s.charAt(i);
            x[i]= ascii -48;

        }
        System.out.print("String values as Integer values are: ");

        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);

        }
        System.out.println();
        return x;


    }
    @Override
    public String toString(){
        return "Integer:"+value+"\nEven: "+isEven()+"\nOdd:"+isOdd()+"\nPrime: "+isPrime();
    }

}
