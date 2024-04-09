package praktikum.data;

import org.apache.commons.lang3.RandomStringUtils;

public class TestData {
    public final static float RANDOM_PRICE = Float.parseFloat(RandomStringUtils.randomNumeric(2));

    public final static String RANDOM_NAME = RandomStringUtils.randomAlphabetic(10);
}
