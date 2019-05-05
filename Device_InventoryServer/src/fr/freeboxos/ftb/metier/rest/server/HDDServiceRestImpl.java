/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier.rest.server;

import fr.freeboxos.ftb.metier.HDDService;
import fr.freeboxos.ftb.metier.MetierFactory;
import fr.freeboxos.ftb.metier.entitys.HDD;
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
@Path("/HDDService")
@Consumes("application/json")
@Produces("application/json")
public class HDDServiceRestImpl {

    private final HDDService hDDService = MetierFactory.getHDDService();

    @POST
    @Path("/")
    public HDD add(HDD t) throws Exception {
        return hDDService.add(t);
    }

    @DELETE
    @Path("/")
    public void remove(HDD t) throws Exception {
        hDDService.remove(t);
    }

    @PUT
    @Path("/")
    public void update(HDD t) throws Exception {
        hDDService.update(t);
    }

    @GET
    @Path("/{id}")
    public HDD getById(@PathParam("id") Long l) throws Exception {
        return hDDService.getById(l);
    }

    @GET
    @Path("/Count")
    public long getCount() throws Exception {
        return hDDService.getCount();
    }

    @GET
    @Path("/")
    public List<HDD> getAll() throws Exception {
        return hDDService.getAll();
    }

    @GET
    @Path("/{i}/{i1}")
    public List<HDD> getAll(@PathParam("i") int i, @PathParam("i1") int i1) throws Exception {
        return hDDService.getAll(i, i1);
    }

}
