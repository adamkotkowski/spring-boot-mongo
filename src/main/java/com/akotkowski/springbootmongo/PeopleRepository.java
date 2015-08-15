package com.akotkowski.springbootmongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * Created by adam on 10/08/15.
 */
public interface PeopleRepository extends MongoRepository<Person, String> {

    public Person findByFirstName(String firstName);

    public List<Person> findByLastName(String lastName);

    @Query("{ $or: [{'firstName' : ?0 }, {'lastName' : ?0}]}")
    public List<Person> queryByNames(String name);

}
