package shaun.api;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;
import shaun.domain.Person;
import shaun.domain.PersonContact;
import shaun.factory.PersonFactory;

/**
 * Created by Shaun Mesias on 2016/08/22.
 */
public class PersonControllerTest {
    @Test
    public void testCreate() throws Exception {

        String URI = "http://localhost:8080/pers";
        RestTemplate restTemplate = new RestTemplate();

        PersonContact driverContact = new PersonContact.Builder()
                .contactValue("0730006856")
                .build();

        Person driverEntity = PersonFactory.getPerson("testApi","test","admin","email",driverContact);
        //System.setProperty("localhost","8080");
        restTemplate.postForObject(URI,driverEntity, Person.class );
    }

    @Test
    public void testFindById() {
        String URI =  "http://localhost:8080/pers/{id}";
        RestTemplate restTemplate = new RestTemplate();
        Person driverEntity= restTemplate.getForObject(URI, Person.class, "2");
        Assert.assertNotNull(driverEntity);
        Assert.assertEquals("33333", driverEntity.getLocation());

    }

    @Test
    public void testUpdate(){
        String URI =  "http://localhost:8080/pers/{id}";
        RestTemplate restTemplate = new RestTemplate();
        Person employeeEntity= restTemplate.getForObject(URI, Person.class, "1");
        if(employeeEntity!=null) {
            String UPDATE_URI = "http://localhost:8080/driv";
            Person updateEmployee = new Person.Builder()
                    .copy(employeeEntity)
                    .name("successApi")
                    .build();
            restTemplate.put(UPDATE_URI,updateEmployee);
            Person updatedEmployee= restTemplate.getForObject(URI, Person.class, "1");

            Assert.assertEquals("admin", updatedEmployee.getName());
        }
    }
}
