package Chapter1;

public class GalToLitTable {
    public static void main(String[] args) {

        int gallons;
        double liters;

        int counter = 0;

        for (gallons = 1; gallons < 100; gallons++) {
            liters = gallons * 3.7854;
            System.out.println(gallons + " gallons = " + liters + " liters");
            counter++;
            if (counter == 10) {
                System.out.println("");
                counter = 0;
            }

        }



    }
}

