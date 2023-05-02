package Backend;

import XML.XMLAccess;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@Path("/airlines")
public class AirlineResource {
    @GET
    @Produces("application/json")
    public Response getMeasurements(){
        return Response.status(Response.Status.OK)
                .entity(XMLAccess.getTheInstance().getAirline())
                .build();
    }
}
