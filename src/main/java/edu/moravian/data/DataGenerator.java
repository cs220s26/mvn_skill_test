package edu.moravian.data;

import net.datafaker.Faker;

public class DataGenerator 
{
    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println(faker.name().fullName());
    }
}
