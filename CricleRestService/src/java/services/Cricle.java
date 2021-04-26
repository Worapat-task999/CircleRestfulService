/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import java.io.StringWriter;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXB;

/**
 * REST Web Service
 *
 * @author ec
 */
@Path("cricle")
public class Cricle {

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of Cricle
     */
    public Cricle() {
    }

    /**
     * Retrieves representation of an instance of services.Cricle
     * @return an instance of java.lang.String
     */
    @GET
    @Path("{number}")
    @Produces("application/xml")
    public String getXml(@PathParam("number") double number) {
        StringWriter writer = new StringWriter();
        JAXB.marshal("Area :"+ (3.14*number*number) +"\n Round of circle :"+ (2*3.14*number), writer);
        return writer.toString();
    }

    /**
     * PUT method for updating or creating an instance of Cricle
     * @param content representation for the resource
     * @return an HTTP response with content of the updated or created resource.
     */
    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {
    }
}
