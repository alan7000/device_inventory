/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier.rest.server;

import fr.freeboxos.ftb.metier.MemoireService;
import fr.freeboxos.ftb.metier.MetierFactory;
import fr.freeboxos.ftb.metier.entitys.Memoire;
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
@Path("/MemoireService")
@Consumes("application/json")
@Produces("application/json")
public class MemoireServiceRestImpl {

    private final MemoireService memoireService = MetierFactory.getMemoireService();

    @POST
    @Path("/")
    public Memoire add(Memoire t) throws Exception {
        return memoireService.add(t);
    }

    @DELETE
    @Path("/")
    public void remove(Memoire t) throws Exception {
        memoireService.remove(t);
    }

    @PUT
    @Path("/")
    public void update(Memoire t) throws Exception {
        memoireService.update(t);
    }

    @GET
    @Path("/{id}")
    public Memoire getById(@PathParam("id") Long l) throws Exception {
        return memoireService.getById(l);
    }

    @GET
    @Path("/Count")
    public long getCount() throws Exception {
        return memoireService.getCount();
    }

    @GET
    @Path("/")
    public List<Memoire> getAll() throws Exception {
        return memoireService.getAll();
    }

    @GET
    @Path("/{i}/{i1}")
    public List<Memoire> getAll(@PathParam("i") int i, @PathParam("i1") int i1) throws Exception {
        return memoireService.getAll(i, i1);
    }

}
