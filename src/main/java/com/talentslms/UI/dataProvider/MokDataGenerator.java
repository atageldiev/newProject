package com.talentslms.UI.dataProvider;

import com.github.javafaker.Faker;

public class MokDataGenerator {

    Faker faker = new Faker();
    public String generateMokFirstName (){
        return faker.name().firstName();
    }

    public String generateMokLastName(){
        return faker.name().lastName();
    }

    public String generateMokEmail(){
        return faker.internet().emailAddress();
    }

    public String generateMokUserName (){
       return faker.name().username();
    }

}
