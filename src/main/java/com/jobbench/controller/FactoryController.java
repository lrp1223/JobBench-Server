package com.jobbench.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.springframework.stereotype.Controller;

@Controller
@Path("/factory")
public class FactoryController {
	@GET
	@Path("/test")
	public Response getFactory() {
		String lResponse = "Hello World";
		return Response.status(200).entity(lResponse).build();
	}
}
