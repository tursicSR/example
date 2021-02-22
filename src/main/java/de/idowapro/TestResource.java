package de.idowapro;

import io.quarkus.qute.TemplateInstance;
import io.quarkus.qute.api.CheckedTemplate;


import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/e")
public class TestResource {
    @CheckedTemplate
    public static class Templates {
        public static native TemplateInstance test();
    }



    @GET
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance getBill(@QueryParam("nr") String nr) {

        return Templates.test();
    }

    @GET
    @Path("/{nr}")
    @Produces(MediaType.TEXT_HTML)
    public TemplateInstance get(@PathParam("nr") String nr) {

        return Templates.test();
    }

}
