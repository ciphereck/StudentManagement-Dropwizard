package com.flipkart.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.flipkart.bean.Customer;

@Path("customer")
public class CustomerRestController {
	@GET
	@Path("/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomerDetails() {
		Customer customer = new Customer();
		customer.setId("5");
		customer.setName("mudit");
		customer.setAddress("india");
		return customer;
	}
	
	@POST
	@Path("/json")
	@Consumes("application/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomerDetailsPost() {
		Customer customer = new Customer();
		customer.setId("5");
		customer.setName("mudit");
		customer.setAddress("india");
		return customer;
	}
	
	@PUT
	@Path("/json")
	@Consumes("application/json")
	@Produces(MediaType.APPLICATION_JSON)
	public Customer getCustomerDetailsPut() {
		Customer customer = new Customer();
		customer.setId("5");
		customer.setName("mudit");
		customer.setAddress("india");
		return customer;
	}
}
