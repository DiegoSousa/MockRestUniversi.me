package universi.me.web.mock;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.codehaus.jackson.annotate.JsonProperty;

import universi.me.web.Feed;
import universi.me.web.SimulationDatabase;

@Path("/feed")
public class MockResource {
	
	// Returns format JSON
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getFeed() {
		return "{\"data\":{\"feed\":\"" + SimulationDatabase.size() + "\"}}";
	}

	// Add or update Feed
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void newFeed(@JsonProperty("id") String id,
			@Context HttpServletResponse servletResponse) throws IOException {
		SimulationDatabase.add(new Feed(id));
	}

	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	public void deleteFeed(@JsonProperty("id") String id,
			@Context HttpServletResponse servletResponse) throws IOException {
		SimulationDatabase.delete(id);
	}
}