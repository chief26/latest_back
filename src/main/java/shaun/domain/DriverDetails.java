package shaun.domain;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by Shaun Mesias on 2016/08/22.
 */
@Embeddable
public class DriverDetails implements Serializable {
    private String ownerName;
    private String carName;
    private DriverDetails(){}

    public String getOwnerName() {
        return ownerName;
    }

    public String getCarName() {
        return carName;
    }

    public DriverDetails(Builder builder) {
        this.ownerName = builder.ownerName;
        this.carName = builder.carName;
    }

    public static class Builder{
        private String ownerName;
        private String carName;

        public Builder ownerName(String value){
            this.ownerName = value;
            return this;
        }

        public Builder carName(String value){
            this.carName = value;
            return this;
        }


        public Builder copy(DriverDetails value){
            this.ownerName = value.ownerName;
            this.carName = value.carName;
            return  this;
        }

        public DriverDetails build(){
            return new DriverDetails(this);
        }
    }

}
