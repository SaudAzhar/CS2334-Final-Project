/**
 * Collection of static methods for generating data to run tests on
 */
public class DataGenerator {
    /** String containing all ASCII characters to use in String generation */
    private static final String charPool = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~\r\n";

    /** Minimum length for generated strings */
    private static final int MIN_STRING_LENGTH = 20;

    /** Maximum length for generated strings */
    private static final int MAX_STRING_LENGTH = 50;

    /** Minimum value for generated doubles */
    private static final double MIN_DOUBLE_VALUE = -9999.999;

    /** Minimum value for generated doubles */
    private static final double MAX_DOUBLE_VALUE = 9999.999;

    /**
     * Generates a randomized string with a random length between {@link #MIN_STRING_LENGTH} and {@link #MAX_STRING_LENGTH} inclusive
     * @return a randomly generated string
     */
    public static String generateString() {
        String output = "";
        int stringLength = (int) (Math.random() * (MAX_STRING_LENGTH - MIN_STRING_LENGTH + 1)) + MIN_STRING_LENGTH;

        for (int i = 0; i < stringLength; i++) {
            int randIndex = (int) (Math.random() * charPool.length());
            output += charPool.charAt(randIndex);
        }

        return output;
    }

    /**
     * Generates a randomized double with a random value between {@link #MIN_DOUBLE_VALUE} and {@link #MAX_DOUBLE_VALUE} inclusive
     * @return a randomly generated double
     */
    public static double generateDouble() {
        return (Math.random() * (MAX_DOUBLE_VALUE - MIN_DOUBLE_VALUE)) + MIN_DOUBLE_VALUE;
    }
}
