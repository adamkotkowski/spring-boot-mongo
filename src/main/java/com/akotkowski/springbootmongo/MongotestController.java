package com.akotkowski.springbootmongo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by adam on 10/08/15.
 */
@RestController
public class MongotestController {


    @Autowired
    PeopleRepository peopleRepository;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String sayHello(@RequestParam("name") String name){
        return "Hello "+name;
    }

    @RequestMapping(value = "people", method = RequestMethod.GET)
    public List<Person> getPeople(@RequestParam("name") String name){
        return peopleRepository.queryByNames(name);
    }



}
