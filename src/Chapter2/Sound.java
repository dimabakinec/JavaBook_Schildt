package Chapter2;

public class Sound {
    public static void main(String[] args) {

        double dist;
        dist = 1100 * 7.2;

        System.out.println("range for flash light " + dist + " foots");

        double echo_speed = 343; // m/sec
        double echo_time = 5; // sec

        System.out.println("range for a rock after echo :" + (echo_speed*5 / 2) + " meters");


    }
}
