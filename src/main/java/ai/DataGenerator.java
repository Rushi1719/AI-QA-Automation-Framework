package ai;

import com.github.javafaker.Faker;

public class DataGenerator {

    static Faker faker = new Faker();

    public static String getEmail() {
        return faker.internet().emailAddress();
    }

    public static String getPassword() {
        return faker.internet().password();
    }
}