package shaun.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Shaun Mesias on 2016/08/22.
 */
@Embeddable
public class PersonContact implements Serializable {
    private String contactValue;
    private PersonContact(){}

    public String getContactValue() {
        return contactValue;
    }


    public PersonContact(Builder builder) {
        this.contactValue= builder.contactValue;
    }

    public static class Builder{
        private String contactValue;

        public Builder contactValue(String value){
            this.contactValue = value;
            return this;
        }

        public Builder copy(PersonContact value){
            this.contactValue = value.contactValue;
            return  this;
        }

        public PersonContact build(){
            return new PersonContact(this);
        }
    }
}
