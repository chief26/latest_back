package shaun.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Shaun Mesias on 2016/08/22.
 */
@Entity
public class Person implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String serverId;
    private String name;
    private String location;
    private String email;
    @Embedded
    private PersonContact personContact;

    public PersonContact getPersonContact() {
        return personContact;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    private Person() {
    }

    public String getServerId() {
        return serverId;
    }

    public String getEmail() {
        return email;
    }

    private Person(Builder builder){
        this.id = builder.id;
        this.name = builder.name;
        this.location = builder.location;
        this.email = builder.email;
        this.serverId = builder.serverId;
        this.personContact = builder.personContact;
    }

    public static class Builder{
        private long id;
        private String name;
        private String location;
        private String serverId;
        private String email;
        private PersonContact personContact;

        public Builder getPersonContact(PersonContact personContact) {
            this.personContact = personContact;
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

        public Builder location(String value){
            this.location = value;
            return this;
        }

        public Builder copy(Person person) {
            this.id = person.id;
            this.location = person.location;
            this.name = person.name;
            this.serverId = person.serverId;
            this.email = person.email;
            this.personContact = person.personContact;
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

        public Person build(){
            return new Person(this);
        }

    }
}
