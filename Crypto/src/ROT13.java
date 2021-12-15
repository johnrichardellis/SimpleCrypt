import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    ROT13(Character cs, Character cf) {
    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {

        return text;
    }


    public String encrypt(String text) {
        ArrayList<Integer> convertedValues = new ArrayList<Integer>();
        // equals 13 for cipher
        int difference = cf - cs;
        int result = 0;
        // Convert string to array of ascii values
        byte[] ascii = text.getBytes(StandardCharsets.US_ASCII);
        for (int i = 0; i < ascii.length; i++) {
            // need to shift the values by 13 -- Capital - 13, LowerCase + 13;
            // spaces and ? will not be shifted

            if (ascii[i] >= 65 && ascii[i] <= 77) {
                result = ascii[i] + difference;
                convertedValues.add(result);
            } else if (ascii[i] >= 78 && ascii[i] <= 90) {
                result = ascii[i] - difference;
                convertedValues.add(result);
            } else if (ascii[i] >= 97 && ascii[i] <= 109) {
                result = ascii[i] + difference;
                convertedValues.add(result);
            } else if (ascii[i] >= 110 && ascii[i] <= 122) {
                result = ascii[i] - difference;
                convertedValues.add(result);
            } else if (ascii[i] == 32) {
                result = 32;
                convertedValues.add(result);
            } else if (ascii[i] == 63) {
                result = 63;
                convertedValues.add(result);
            } else if (ascii[i] == 33) {
                result = 33;
                convertedValues.add(result);
            }
        }
        String str = "";
        for (int i : convertedValues) {
            str += Character.toString((char) i);

        }
        return str;
    }

    public String decrypt(String text) {

        // Call completed method above and pass in variable text

        return encrypt(text);
    }

    public static String rotate(String s, Character c) {

        return "";
    }

}
