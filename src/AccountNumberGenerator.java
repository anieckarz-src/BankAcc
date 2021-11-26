import java.util.Random;

public class AccountNumberGenerator {

    public static String generateAccountNumber() {

        Random rand = new Random();
        int min = 100000000;
        int max = 999999999;

        return String.valueOf(rand.nextInt((max - min) + 1) + min);
    }

}
