package shaun.factory;

import shaun.domain.Person;
import shaun.domain.PersonContact;

/**
 * Created by Shaun Mesias on 2016/08/22.
 */
public class PersonFactory {
    public static Person getPerson(String serverId, String name, String area, String email, PersonContact personContact)
    {
        return new Person.Builder()
                .serverId(serverId)
                .name(name)
                .location(area)
                .email(email)
                .getPersonContact(personContact)
                .build();
    }
}
