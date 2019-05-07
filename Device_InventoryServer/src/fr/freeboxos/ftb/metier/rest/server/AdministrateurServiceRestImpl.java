/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier.rest.server;

import fr.freeboxos.ftb.metier.AdministrateurService;
import fr.freeboxos.ftb.metier.MetierFactory;
import fr.freeboxos.ftb.metier.entitys.Administrateur;
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
@Path("/AdministrateurService")
@Consumes("application/json")
@Produces("application/json")
public class AdministrateurServiceRestImpl {

    private final AdministrateurService administrateurService = MetierFactory.getAdministrateurService();

    @POST
    @Path("/")
    public Administrateur add(Administrateur t) throws Exception {
        return administrateurService.add(t);
    }

    @DELETE
    @Path("/")
    public void remove(Administrateur t) throws Exception {
        administrateurService.remove(t);
    }

    @PUT
    @Path("/")
    public void update(Administrateur t) throws Exception {
        administrateurService.update(t);
    }

    @GET
    @Path("/{id}")
    public Administrateur getById(@PathParam("id") Long l) throws Exception {
        return administrateurService.getById(l);
    }

    @GET
    @Path("/Count")
    public long getCount() throws Exception {
        return administrateurService.getCount();
    }

    @GET
    @Path("/")
    public List<Administrateur> getAll() throws Exception {
        return administrateurService.getAll();
    }

    @GET
    @Path("/{i}/{i1}")
    public List<Administrateur> getAll(@PathParam("i") int i, @PathParam("i1") int i1) throws Exception {
        return administrateurService.getAll(i, i1);
    }

    @GET
    @Path("/login/{login}")
    public Administrateur getByLogin(@PathParam("login") String login) throws Exception {
        return administrateurService.getByLogin(login);
    }

}
