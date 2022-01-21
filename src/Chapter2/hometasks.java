package Chapter2;

public class hometasks {
    public static void main(String[] args) {

        System.out.println("One\nTwo\nThree"); // task 4


        int i, sum = 0; // task 5
        for (i = 0; i < 10; i++) {
            sum ++;
        }
        System.out.println("Summ: " + sum);

// task 7

//        if ((a != 0) && (b / a))

//         task 10

        int x, y;
        boolean isprime;

        for (x = 2; x <= 100; x++) {
            isprime = true;

            for (y=2; y <= x/y; y ++)
                if ((x%y == 0))
                    isprime = false;
                if (isprime) System.out.println(x + " isprime");

            }



    } // main

} // class
