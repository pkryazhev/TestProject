package data;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

/**
 * Created by pavel.kryazhev on 28.09.2018.
 */
public class Generator {

    public static String getRandomPhoneNumber() {
        String base = "9";
        String randomNumbers = RandomStringUtils.randomNumeric(9);
        return base + randomNumbers;
    }

    @SuppressWarnings("Duplicates")
    public static String getRandomString() {
        Random rng = new Random();
        String characters = "абвгдеёжзиклмнопрстуфхцшьыъэюя";
        char[] text = new char[10];
        for (int i = 0; i < 10; i++) {
            text[i] = characters.toLowerCase().charAt(rng.nextInt(characters.length()));
        }
        return new String(text);
    }
}
