package Chapter1;
// 1m = 3.28 fut
// 1m = 39.37 inch
// 1 fut = 0.31 meters
// 1 fut = 12 inches
public class FootToMet {
    public static void main(String[] args) {
        double meters;
        int fut=0, counter, inch;

        counter = 0;

        for (inch = 1; inch <= 144; inch++) {
            meters = inch / 39.37;

            System.out.println(inch + " inches = " + (meters) + " meters");

            counter ++;
            if (counter == 12) {
                fut ++;
                System.out.println(fut + " foots");
                counter = 0;
            }
        }
    }
}
