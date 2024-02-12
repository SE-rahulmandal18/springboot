package com.simpli.hellorest.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("getMessage")
public class HelloResource {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage() {
		
		return "Hello World !!";
	}
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getMessage2() {
		
		return "Hello World !!";
	}
}
