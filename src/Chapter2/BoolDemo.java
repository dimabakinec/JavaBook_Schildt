package Chapter2;

public class BoolDemo {
    public static void main(String[] args) {

        boolean b;
        b = false;

        System.out.println("value of b: " + b);
        b = true;
        System.out.println("value of b: " + b);

        if (b) System.out.println("instruction is running");

        b = false;
        if (b) System.out.println("instruction not running");

        System.out.println("result of compare 10 > 9 " + (10 > 9));


    }
}
