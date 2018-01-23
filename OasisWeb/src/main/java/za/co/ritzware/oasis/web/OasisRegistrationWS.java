package za.co.ritzware.oasis.web;

import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import za.co.ritzware.oasis.model.RegistrationBean;
import za.co.ritzware.oasis.service.RegistrationService;

@Path("/")
public class OasisRegistrationWS {
	@PUT
	@Produces(MediaType.TEXT_HTML)
	@Consumes(MediaType.APPLICATION_JSON)
	@Path("apply")
	public Response apply(RegistrationBean application) {
		String refNum = "";

		try {
			refNum = RegistrationService.apply(application);
		} catch (Exception e) {

		}
		String output = "<h1>Application successful!<h1>" + "<p>Ref num: ... <br>Ping @ " + refNum
				+ "</p<br>";
		return Response.status(200).entity(output).build();
	}
}