package shaun.factory;

import shaun.domain.Driver;
import shaun.domain.DriverContact;
import shaun.domain.DriverDetails;

/**
 * Created by Shaun Mesias on 2016/08/16.
 */
public class DriverFactory {
    public static Driver getDriver(String serverId, String name, String area, String email, DriverContact driverContact, DriverDetails driverDetails)
    {
        return new Driver.Builder()
                .serverId(serverId)
                .name(name)
                .area(area)
                .email(email)
                .getDriverContact(driverContact)
                .getDriverDetails(driverDetails)
                .build();
    }
}
