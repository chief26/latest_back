package shaun.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Shaun Mesias on 2016/08/16.
 */
@Entity
public class Driver implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String serverId;
    private String name;
    private String area;
    private String email;

    @Embedded
    private DriverContact driverContact;

    @Embedded
    private DriverDetails driverDetails;

    public DriverContact getDriverContact() {
        return driverContact;
    }

    public DriverDetails getDriverDetails() {
        return driverDetails;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getArea() {
        return area;
    }

    public String getServerId() {
        return serverId;
    }

    public String getEmail() {
        return email;
    }

    public Driver() {
    }

    private Driver(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.area = builder.area;
        this.serverId = builder.serverId;
        this.email = builder.email;
        this.driverContact = builder.driverContact;
        this.driverDetails = builder.driverDetails;
    }

    public static class Builder{
        private long id;
        private String name;
        private String area;
        private String serverId;
        private String email;
        private DriverContact driverContact;
        private DriverDetails driverDetails;

        public Builder getDriverContact(DriverContact driverContact) {
            this.driverContact = driverContact;
            return this;
        }

        public Builder getDriverDetails(DriverDetails driverDetails) {
            this.driverDetails = driverDetails;
            return this;
        }

        public Builder id(long value){
            this.id = value;
            return this;
        }

        public Builder name(String value){
            this.name = value;
            return this;
        }

        public Builder area(String value){
            this.area = value;
            return this;
        }

        public Builder serverId(String value){
            this.serverId = value;
            return this;
        }

        public Builder email(String value){
            this.email = value;
            return this;
        }

        public Builder copy(Driver driver) {
            this.id = driver.id;
            this.name = driver.name;
            this.area = driver.area;
            this.serverId = driver.serverId;
            this.email = driver.email;
            this.driverContact = driver.driverContact;
            this.driverDetails = driver.driverDetails;
            return this;
        }

        public Driver build(){
            return new Driver(this);
        }
    }
}
