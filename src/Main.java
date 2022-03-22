import java.util.Scanner;

public class Main {
    static Scanner skeneris = new Scanner(System.in);   //"static" - applies to all methods
    public static void main(String[] args) {
       //calling a function
        Main.intN();
        Main.compare();
        Main.bool();
        Main.wholeN();
        Main.wholeNum();
        Main.boolN();
        //close
        skeneris.close();
    }

    public static void compare() {

        System.out.println("input two numbers!");
        int a = skeneris.nextInt();
        int b = skeneris.nextInt();
        System.out.println("is " + a + " equal to " + b + " ?");
        System.out.println(a == b);  //result is boolean

        System.out.println("is " + a + " less than " + b);
        System.out.println(a < b);

        System.out.println("is " + a + " less or equal to " + b);
        System.out.println(a <= b);

        System.out.println("is " + a + " greater than " + b);
        System.out.println(a > b);

        System.out.println("is " + a + " greater or equal " + b);
        System.out.println(a >= b);
    }
    public static void bool() {
        System.out.println("input two boolean values!");
        boolean b1 = skeneris.nextBoolean();
        boolean b2 = skeneris.nextBoolean();

        System.out.println("Is b1 and b2 equal?");
        System.out.println(b1 == b2);
    }
    public static void wholeN() {
        System.out.println("input whole number!");
        int a = skeneris.nextInt();
        System.out.println("Is number even?");
        System.out.println(a % 2 == 0);

    }
    public static void wholeNum(){
        System.out.println("input whole number!");
        int a = skeneris.nextInt();
        System.out.println("Is number odd?");
        System.out.println(a % 2 != 0);
    }
    public static void boolN(){
        System.out.println("input boolean value");
        boolean a = skeneris.nextBoolean();
        System.out.println("Opposite of " + a + "is" + !a);
    }
    public static void intN(){
        System.out.println("input two whole numbers");
        int a = skeneris.nextInt();
        int b = skeneris.nextInt();
        if (a == b){
            System.out.println("true");
        }
        else if (a < 0 && b > 0) {
            System.out.println("true");
        }
        else if (a > 1001 && b > 1001){
            System.out.println("true");
        }
        else System.out.println("false");
    }
}
