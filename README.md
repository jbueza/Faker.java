# Faker.java

![687474703a2f2f696d6775722e636f6d2f4b69696e512e706e67](https://f.cloud.github.com/assets/25766/756187/4a2b7b6e-e5f4-11e2-96a5-e7a01e5c51be.png)

A tool for generating fake data. This is inspired by [Faker.js](https://github.com/Marak/Faker.js), [Faker.rb](https://github.com/stympy/faker).

## Usage

### Person API

```java
Faker faker = new Faker();

String name = faker.Person().fullName();                // Jaime Bueza
String firstName = faker.Person().firstName();          // John
String lastName = faker.Person().lastName();            // Smith
```

### Company API

```java
Faker faker = new Faker();

String companyName = faker.Company().name();                // Adaptive Infrastructures Inc.
```

### Lorem Ipsum API

```java
Faker faker = new Faker();

String paragraphs = faker.LoremIpsum().paragraphs(2);                // Generates two paragraphs
```
## Download

Go here to the [Releases view of the repository!](https://github.com/jbueza/Faker.java/releases)

Or [just download directly](https://github.com/jbueza/Faker.java/releases/download/v0.0.1/Faker.java.jar).

## License

MIT.


## Special Thanks

For inspiration:

- https://github.com/oliverdodd/jlorem/
- https://github.com/Marak/Faker.js
- https://github.com/stympy/faker