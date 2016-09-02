package shaun.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import shaun.domain.Driver;
import shaun.domain.DriverContact;
import shaun.domain.DriverDetails;

/**
 * Created by student on 9/2/16.
 */
@RestController
@RequestMapping("/")
public class LandingPage {
    @RequestMapping(method = RequestMethod.GET)
    public Driver getCourse(){
        DriverDetails driverDetails = new DriverDetails.Builder()
                .carName("nissan")
                .ownerName("Jack")
                .build();

        DriverContact driverContact = new DriverContact.Builder()
                .contactValue("0730006856")
                .build();

        Driver driver = new Driver.Builder()
                .name("shaun")
                .area("area")
                .email("sad")
                .getDriverContact(driverContact)
                .getDriverDetails(driverDetails)
                .build();
        return driver;
    }
}
