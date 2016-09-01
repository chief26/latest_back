package shaun.factory;

import org.junit.Assert;
import org.junit.Test;
import shaun.domain.Person;
import shaun.domain.PersonContact;

/**
 * Created by Shaun Mesias on 2016/08/22.
 */
public class PersonTest {
    private Person person;

    @Test
    public void testCreate() throws Exception {

        PersonContact personContact = new PersonContact.Builder()
                .contactValue("0730006856")
                .build();

        person = PersonFactory.getPerson("test id","admin","testlastname","email", personContact);
        Assert.assertNotNull(person);
    }

    @Test
    public void testUpdate() throws Exception {

        PersonContact personContact = new PersonContact.Builder()
                .contactValue("0730006856")
                .build();

        person = PersonFactory.getPerson("test id","admin","testlastname","email", personContact);

        Person copyPerson = new Person.Builder()
                .copy(person)
                .name("testName")
                .build();
        Assert.assertEquals(copyPerson.getName(),"testName");

    }
}
