package com.ustc.service;

import java.io.Serializable;
import java.util.List;

import javax.ws.rs.Consumes;  
import javax.ws.rs.DELETE;  
import javax.ws.rs.GET;  
import javax.ws.rs.POST;  
import javax.ws.rs.PUT;  
import javax.ws.rs.Path;  
import javax.ws.rs.PathParam;  
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.ustc.model.Person;

  

  
@Produces( { MediaType.APPLICATION_JSON }) 
public interface PersonService extends Serializable {
    @GET
    @Path("/persons")
    public List<Person> getPersons();

    @GET
    @Path("/persons/{id}")
    public Person getPerson(@PathParam("id") String id);
    
    @GET  
    @Path(value = "/search")  
    public Person findPersonById(@QueryParam("id")String id);  
}  
