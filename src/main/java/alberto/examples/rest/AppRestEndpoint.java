package alberto.examples.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * AppRestEndpoint
 *
 * @author <a href="mailto:nobuji.saito@gmail.com">nobuji.saito</a>
 * @version $Id$
 * @since Nov 8, 2015
 *
 */
@Path ("/v1/")
public interface AppRestEndpoint {

    /**
     * Represents getModel
     *
     * @return {@link Response}
     * @since Nov 8, 2015
     *
     */
    @GET
    @Path ("model")
    public String getModel ();

    /**
     * Represents addModel
     *
     * @param modelValue
     * @return {@link Response}
     * @since Nov 8, 2015
     *
     */
    @PUT
    @Produces ({MediaType.APPLICATION_JSON})
    @Consumes ({MediaType.APPLICATION_JSON})
    @Path ("model/{value}")
    public Response addModel (@PathParam(value = "value") String modelValue);

    /**
     * Represents deleteModel
     * @param modelValue
     *
     * @return {@link Response}
     * @since Nov 8, 2015
     *
     */
    @DELETE
    @Produces ({MediaType.APPLICATION_JSON})
    @Consumes ({MediaType.APPLICATION_JSON})
    @Path ("model/{value}")
    public Response deleteModel (@PathParam(value = "value") final String modelValue);

}
