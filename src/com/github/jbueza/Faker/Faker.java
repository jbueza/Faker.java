package com.github.jbueza.Faker;

import com.github.jbueza.Faker.Generators.CompanyGenerator;
import com.github.jbueza.Faker.Generators.LoremIpsumGenerator;
import com.github.jbueza.Faker.Generators.PersonGenerator;

public class Faker {

    public LoremIpsumGenerator LoremIpsum() {
        return new LoremIpsumGenerator();
    }

    public CompanyGenerator Company() {
        return new CompanyGenerator();
    }

    public PersonGenerator Person() {
        return new PersonGenerator();
    }

}
