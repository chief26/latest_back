package shaun.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.annotations.Test;
import shaun.App;
import shaun.domain.Person;
import shaun.domain.PersonContact;
import shaun.factory.PersonFactory;
import shaun.services.impl.PersonServiceImpl;

import static org.testng.AssertJUnit.assertNotNull;

/**
 * Created by Shaun Mesias on 2016/08/22.
 */
@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration
public class PersonService extends AbstractTestNGSpringContextTests {
    @Autowired
    private PersonServiceImpl service;

    @Test
    public void testCreate() throws Exception {

        PersonContact driverContact = new PersonContact.Builder()
                .contactValue("0731116856")
                .build();

        Person driver = PersonFactory.getPerson("44444","2222","33333","email",driverContact);
        Person newDriver = service.create(driver);
        assertNotNull("CREATE TEST",newDriver);
    }
}
