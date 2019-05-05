/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier.rest.server;

import fr.freeboxos.ftb.metier.MetierFactory;
import fr.freeboxos.ftb.metier.ProcesseurService;
import fr.freeboxos.ftb.metier.entitys.Processeur;
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
@Path("/ProcesseurService")
@Consumes("application/json")
@Produces("application/json")
public class ProcesseurServiceRestImpl {

    private final ProcesseurService processeurService = MetierFactory.getProcesseurService();

    @POST
    @Path("/")
    public Processeur add(Processeur t) throws Exception {
        return processeurService.add(t);
    }

    @DELETE
    @Path("/")
    public void remove(Processeur t) throws Exception {
        processeurService.remove(t);
    }

    @PUT
    @Path("/")
    public void update(Processeur t) throws Exception {
        processeurService.update(t);
    }

    @GET
    @Path("/{id}")
    public Processeur getById(@PathParam("id") Long l) throws Exception {
        return processeurService.getById(l);
    }

    @GET
    @Path("/Count")
    public long getCount() throws Exception {
        return processeurService.getCount();
    }

    @GET
    @Path("/")
    public List<Processeur> getAll() throws Exception {
        return processeurService.getAll();
    }

    @GET
    @Path("/{i}/{i1}")
    public List<Processeur> getAll(@PathParam("i") int i, @PathParam("i1") int i1) throws Exception {
        return processeurService.getAll(i, i1);
    }

}
