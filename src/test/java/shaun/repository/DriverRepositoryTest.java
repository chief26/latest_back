package shaun.repository;

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

import static org.testng.AssertJUnit.assertNotNull;*/

/**
 * Created by Shaun Mesias on 2016/08/18.
 */
/*@SpringApplicationConfiguration(classes = App.class)
@WebAppConfiguration*/
public class DriverRepositoryTest /*extends AbstractTestNGSpringContextTests */{
    /*@Autowired
    private DriverRepository repository;

    DriverDetails driverDetails;
    DriverContact driverContact;
    Driver driverEntity;

    @Test
    public void testCreate() throws Exception {
        driverDetails = new DriverDetails.Builder()
                .carName("nissan")
                .ownerName("Jack")
                .build();

        driverContact = new DriverContact.Builder()
                .contactValue("0730006856")
                .build();
        driverEntity = DriverFactory.getDriver("2016test","admin","test","email",driverContact,driverDetails);
        Driver savedDriver=repository.save(driverEntity);
        assertNotNull("CREATE TEST",savedDriver);

    }

    @Test
    public void testReadAll() throws Exception {
        Driver driverFound= repository.findOne(1L);
        Driver updateDriver = new Driver.Builder()
                .copy(driverFound)
                .name("testupdate")
                .build();
        Driver updatedDriver=repository.save(updateDriver);
        assertNotNull(updatedDriver);
    }*/
}
