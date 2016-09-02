package shaun.api;

/*import org.junit.Assert;
import org.junit.Test;
import org.springframework.web.client.RestTemplate;
import shaun.domain.Driver;
import shaun.domain.DriverContact;
import shaun.domain.DriverDetails;
import shaun.factory.DriverFactory;

import java.util.Set;*/

/**
 * Created by Shaun Mesias on 2016/08/18.
 */
public class DriverControllerTest {
    /*@Test
    public void testCreate() throws Exception {

        String URI = "http://localhost:8080/driv";
        RestTemplate restTemplate = new RestTemplate();
        DriverDetails driverDetails = new DriverDetails.Builder()
                .carName("nissan")
                .ownerName("Jack")
                .build();

        DriverContact driverContact = new DriverContact.Builder()
                .contactValue("0730006856")
                .build();

        Driver driverEntity = DriverFactory.getDriver("testApi","test","admin","email",driverContact,driverDetails);
        //System.setProperty("localhost","8080");
        restTemplate.postForObject(URI,driverEntity, Driver.class );
    }

    @Test
    public void testFindById() {
        String URI =  "http://localhost:8080/driv/{id}";
        RestTemplate restTemplate = new RestTemplate();
        Driver driverEntity= restTemplate.getForObject(URI, Driver.class, "1");
        Assert.assertNotNull(driverEntity);
        Assert.assertEquals("successApi", driverEntity.getName());

    }

    @Test
    public void testUpdate(){
        String URI =  "http://localhost:8080/driv/{id}";
        RestTemplate restTemplate = new RestTemplate();
        Driver employeeEntity= restTemplate.getForObject(URI, Driver.class, "1");
        if(employeeEntity!=null) {
            String UPDATE_URI = "http://localhost:8080/driv";
            Driver updateEmployee = new Driver.Builder()
                    .copy(employeeEntity)
                    .name("successApi")
                    .build();
            restTemplate.put(UPDATE_URI,updateEmployee);
            Driver updatedEmployee= restTemplate.getForObject(URI, Driver.class, "1");

            Assert.assertEquals("successApi", updatedEmployee.getName());
        }
    }

    @Test
    public void testFindAll(){
        String URI =  "http://localhost:8080/driv";
        RestTemplate restTemplate = new RestTemplate();
        Set employeeSet = restTemplate.getForObject(URI,Set.class);
        Assert.assertTrue(employeeSet.size()>0);
    }

   /* @Test
    public void testDelete(){
        String URI =  "http://localhost:8080/driv/{id}";
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.delete(URI,"1");
        Driver employeeEntity= restTemplate.getForObject(URI, Driver.class, "1");

        Assert.assertNull(employeeEntity);


    }*/
}
