package org.kulkarni.amogh.firstProject;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.Arrays;
import java.util.List;

@Path("Patient")
public class CernerResource {

	PatientRepository repo = new PatientRepository();
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cerner> getPatient() {
		System.out.println("Checking Connection!");	
		return repo.getPatients();
	} 
	
	
	@POST
	@Path("PatintEntry")
	public Cerner createPatient(Cerner c1) {
		System.out.println(c1);
		repo.create(c1);  
		return c1;
		
	}
}