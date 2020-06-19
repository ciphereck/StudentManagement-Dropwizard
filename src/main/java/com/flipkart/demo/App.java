package com.flipkart.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.flipkart.rest.AdminController;
import com.flipkart.rest.UtilController;
import com.flipkart.rest.CustomerRestController;
import com.flipkart.rest.ProfessorController;
import com.flipkart.rest.StudentController;
import com.flipkart.rest.UserController;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Hello world!
 *
 */
public class App extends Application<Configuration>
{
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	 
    @Override
    public void initialize(Bootstrap<Configuration> b) {
    }
 
    @Override
    public void run(Configuration c, Environment e) throws Exception {
        LOGGER.info("Registering REST resources");
        e.jersey().register(new CustomerRestController());
        e.jersey().register(new AdminController());
        e.jersey().register(new UtilController());
        e.jersey().register(new StudentController());
        e.jersey().register(new UserController());
        e.jersey().register(new ProfessorController());
    }
 
    public static void main(String[] args) throws Exception {
        new App().run(args);
    }
}
