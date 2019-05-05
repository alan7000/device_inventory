/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier.rest.server;

import fr.freeboxos.ftb.metier.CableService;
import fr.freeboxos.ftb.metier.MetierFactory;
import fr.freeboxos.ftb.metier.entitys.Cable;
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
@Path("/CableService")
@Consumes("application/json")
@Produces("application/json")
public class CableServiceRestImpl {

    private final CableService cableService = MetierFactory.getCableService();

    @POST
    @Path("/")
    public Cable add(Cable t) throws Exception {
        return cableService.add(t);
    }

    @DELETE
    @Path("/")
    public void remove(Cable t) throws Exception {
        cableService.remove(t);
    }

    @PUT
    @Path("/")
    public void update(Cable t) throws Exception {
        cableService.update(t);
    }

    @GET
    @Path("/{id}")
    public Cable getById(@PathParam("id") Long l) throws Exception {
        return cableService.getById(l);
    }

    @GET
    @Path("/Count")
    public long getCount() throws Exception {
        return cableService.getCount();
    }

    @GET
    @Path("/")
    public List<Cable> getAll() throws Exception {
        return cableService.getAll();
    }

    @GET
    @Path("/{i}/{i1}")
    public List<Cable> getAll(@PathParam("i") int i, @PathParam("i1") int i1) throws Exception {
        return cableService.getAll(i, i1);
    }

}
