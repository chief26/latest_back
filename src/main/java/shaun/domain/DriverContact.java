package shaun.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Shaun Mesias on 2016/08/22.
 */
@Embeddable
public class DriverContact implements Serializable {
    private String contactValue;

    private DriverContact(){}

    public String getContactValue() {
        return contactValue;
    }

    public DriverContact(Builder builder) {
        this.contactValue= builder.contactValue;

    }

    public static class Builder{
        private String contactValue;

        public Builder contactValue(String value){
            this.contactValue = value;
            return this;
        }

        public Builder copy(DriverContact value){
            this.contactValue = value.contactValue;
            return  this;
        }

        public DriverContact build(){
            return new DriverContact(this);
        }
    }

}
