package com.lamichhane.remote.storage.provider;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
// @Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public interface UsersApiService {
	
	@GET
	@Path("/{username}")
	public User getUserDetails(@PathParam("username") String username);
    
	@POST
	@Path("/{username}/verify-password")
	public VerifyPasswordResponse verifyUserPassword(@PathParam("username") String username,String password);
	
	
	
	
}
