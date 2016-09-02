package shaun.services;

/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.test.context.web.WebAppConfiguration;
import org.testng.Assert;
import org.testng.annotations.Test;
import shaun.App;
import shaun.domain.Driver;
import shaun.domain.DriverContact;
import shaun.domain.DriverDetails;
import shaun.factory.DriverFactory;
import shaun.services.impl.DriverServiceImpl;

import static org.testng.AssertJUnit.assertNotNull;*/

/**
 * Created by Shaun Mesias on 2016/08/22.
 */
/*@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration*/
public class DriverService /*extends AbstractTestNGSpringContextTests*/{
   /* @Autowired
    private DriverServiceImpl service;

    @Test
    public void testCreate() throws Exception {

        DriverDetails driverDetails = new DriverDetails.Builder()
                .carName("nissan")
                .ownerName("Jack")
                .build();

        DriverContact driverContact = new DriverContact.Builder()
                .contactValue("0734346856")
                .build();

        Driver driver = DriverFactory.getDriver("2016test","aman","test213","email4343",driverContact,driverDetails);
        Driver newDriver = service.create(driver);
        assertNotNull("CREATE TEST",newDriver);
    }

    @Test(dependsOnMethods = "testCreate")
    public void testReadAll() throws Exception {

        Iterable<Driver> drivers = service.readAll();
        assertNotNull(drivers);
    }

    @Test(dependsOnMethods = "testCreate")
    public void testUpdate() throws Exception {

        Driver driverFound= service.readById(1L);
        Driver updateDriver = new Driver.Builder()
                .copy(driverFound)
                .name("service test update")
                .build();
        Driver updated=service.update(updateDriver);
        Assert.assertSame(updateDriver.getName(),updated.getName(),"service test update");
    }

   /* @Test(dependsOnMethods = "testUpdate")
    public void testDelete() throws Exception {
        Driver foundEmployee = service.readById(3L);
        if(foundEmployee !=null) {
            assertNotNull("BEFORE DELETE TEST",foundEmployee);
            service.delete(foundEmployee);
            Driver deletedEmployee = service.readById(3L);

            assertNotNull("DELETE TEST",deletedEmployee);
        }

    }*/
}
