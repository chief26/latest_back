package shaun.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import shaun.domain.Person;
import shaun.services.impl.PersonServiceImpl;

import java.util.Set;

/**
 * Created by Shaun Mesias on 2016/08/22.
 */
@RestController
@RequestMapping(value = "/pers")
public class PersonController {

    @Autowired
    private PersonServiceImpl service;

    //-------------------Create a Driver--------------------------------------------------------

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Person create(@RequestBody Person resource){
        return  service.create(resource);
    }


    //-------------------Retrieve Single Driver--------------------------------------------------------
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Person findById(@PathVariable("id")Long id){
        return   service.readById(id);
    }


    //-------------------Retrieve All Driver--------------------------------------------------------

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Set<Person> findAll(){
        return service.readAll();
    }

    //------------------- Update a Driver --------------------------------------------------------

    @RequestMapping(method =  RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody Person resource){
        service.update(resource);
    }

    //------------------- Delete a Driver --------------------------------------------------------

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id")Long id){
        Person employeeToDelete= service.readById(id);
        if(employeeToDelete!=null) {
            service.delete(employeeToDelete);
        }
    }
}
