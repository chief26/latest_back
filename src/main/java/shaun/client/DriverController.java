package shaun.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import shaun.domain.Driver;
import shaun.services.impl.DriverServiceImpl;

import java.util.Set;

/**
 * Created by Shaun Mesias on 2016/08/18.
 */
@RestController
@RequestMapping(value = "/driv")
public class DriverController {

    // Inject Service
    @Autowired
    private DriverServiceImpl service;


    //-------------------Create a Driver--------------------------------------------------------

    @RequestMapping(method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    @ResponseBody
    public Driver create(@RequestBody Driver resource){
        return  service.create(resource);
    }


    //-------------------Retrieve Single Driver--------------------------------------------------------
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    @ResponseBody
    public Driver findById(@PathVariable("id")Long id){
        return   service.readById(id);
    }


    //-------------------Retrieve All Driver--------------------------------------------------------

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public Set<Driver> findAll(){
        return service.readAll();
    }

    //------------------- Update a Driver --------------------------------------------------------

    @RequestMapping(method =  RequestMethod.PUT)
    @ResponseStatus(HttpStatus.OK)
    public void update(@RequestBody Driver resource){
        service.update(resource);
    }

    //------------------- Delete a Driver --------------------------------------------------------

    @RequestMapping(value="/{id}",method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id")Long id){
        Driver employeeToDelete= service.readById(id);
        if(employeeToDelete!=null) {
            service.delete(employeeToDelete);
        }
    }

}

