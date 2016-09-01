package shaun.factory;

import org.junit.Assert;
import org.junit.Test;
import shaun.domain.Driver;
import shaun.domain.DriverContact;
import shaun.domain.DriverDetails;

/**
 * Created by Shaun Mesias on 2016/08/18.
 */
public class DriverTest {
    private Driver driver;

    @Test
    public void testCreate() throws Exception {

        DriverDetails driverDetails = new DriverDetails.Builder()
                .carName("nissan")
                .ownerName("Jack")
                .build();

        DriverContact driverContact = new DriverContact.Builder()
                .contactValue("0730006856")
                .build();

        driver = DriverFactory.getDriver("test id","admin","testlastname","email", driverContact, driverDetails);
        Assert.assertNotNull(driver);
    }

    @Test
    public void testUpdate() throws Exception {
        DriverDetails driverDetails = new DriverDetails.Builder()
                .carName("nissan")
                .ownerName("Jack")
                .build();

        DriverContact driverContact = new DriverContact.Builder()
                .contactValue("0730006856")
                .build();

        driver = DriverFactory.getDriver("test id","admin","testlastname","email",driverContact,driverDetails);

        Driver copyDriver = new Driver.Builder()
                .copy(driver)
                .name("testName")
                .build();
        Assert.assertEquals(copyDriver.getName(),"testName");
        Assert.assertEquals(copyDriver.getDriverDetails().getCarName(),"nissan");

    }
}
