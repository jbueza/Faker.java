import com.github.jbueza.Faker.Faker;
import com.github.jbueza.Faker.Generators.CompanyGenerator;
import com.github.jbueza.Faker.Generators.LoremIpsumGenerator;
import com.github.jbueza.Faker.Generators.PersonGenerator;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;

public class FakerTest {

    Faker faker = new Faker();

    @Test
    public void testLoremIpsumGeneratorConstructor() {
        assertTrue(faker.LoremIpsum() instanceof LoremIpsumGenerator);
    }

    @Test
    public void testCompanyGeneratorConstructor() {
        assertTrue(faker.Company() instanceof CompanyGenerator);
    }

    @Test
    public void testPersonGeneratorConstructor() {
        assertTrue(faker.Person() instanceof PersonGenerator);
    }

    @Test
    public void testLoremIpsumWord() {
        String word = faker.LoremIpsum().randomWord();
        assertNotNull(word);
        assertTrue(word instanceof String);
        assertTrue(word.length() > 0);
    }

    @Test
    public void testCompanyName() {
        String companyName = faker.Company().name();
        assertNotNull(companyName);
        assertTrue(companyName instanceof String);
        assertTrue(companyName.length() > 0);
    }

    @Test
    public void testPersonName() {
        String name = faker.Person().fullName();
        assertNotNull(name);
        assertTrue(name instanceof String);
        assertTrue(name.length() > 0);
    }
}
