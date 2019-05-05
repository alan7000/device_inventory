/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier.rest.server;

import fr.freeboxos.ftb.metier.AutreService;
import fr.freeboxos.ftb.metier.MetierFactory;
import fr.freeboxos.ftb.metier.entitys.Autre;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

/**
 *
 * @author alan
 */
@Path("/AutreService")
@Consumes("application/json")
@Produces("application/json")
public class AutreServiceRestImpl {

    private final AutreService autreService = MetierFactory.getAutreService();

    @POST
    @Path("/")
    public Autre add(Autre t) throws Exception {
        return autreService.add(t);
    }

    @DELETE
    @Path("/")
    public void remove(Autre t) throws Exception {
        autreService.remove(t);
    }

    @PUT
    @Path("/")
    public void update(Autre t) throws Exception {
        autreService.update(t);
    }

    @GET
    @Path("/{id}")
    public Autre getById(@PathParam("id") Long l) throws Exception {
        return autreService.getById(l);
    }

    @GET
    @Path("/Count")
    public long getCount() throws Exception {
        return autreService.getCount();
    }

    @GET
    @Path("/")
    public List<Autre> getAll() throws Exception {
        return autreService.getAll();
    }

    @GET
    @Path("/{i}/{i1}")
    public List<Autre> getAll(@PathParam("i") int i, @PathParam("i1") int i1) throws Exception {
        return autreService.getAll(i, i1);
    }

}
