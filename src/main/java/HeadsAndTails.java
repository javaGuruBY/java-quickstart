import java.util.Random;

public class HeadsAndTails {
    public static void main (String[] args) {

        Random randomGenerator=new Random();

        boolean coin;

        coin = randomGenerator.nextInt(2) ==1;
        if (randomGenerator.nextInt(2) ==1) {
            System.out.println("Coin throw result is HEAD");
        } else {
            System.out.println("Coin throw result is TAIL");
        }

    }
}
