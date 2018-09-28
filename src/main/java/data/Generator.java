package data;

import org.apache.commons.lang3.RandomStringUtils;

/**
 * Created by pavel.kryazhev on 28.09.2018.
 */
public class Generator {

    public static String getRandomPhoneNumber() {
        String base = "9";
        String randomNumbers = RandomStringUtils.randomNumeric(9);
        return base + randomNumbers;
    }
}
