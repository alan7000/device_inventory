/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier;

import fr.freeboxos.ftb.metier.entitys.Administrateur;
import java.util.ArrayList;
import java.util.List;
import lml.rest.client.ClientRest;

public class AdministrateurServiceImpl extends ClientRest<Administrateur> implements AdministrateurService {

    public AdministrateurServiceImpl() {
        super.init("AdministrateurService", new RestServerLocalConfiguration());
    }

    @Override
    public Administrateur add(Administrateur t) throws Exception {
        super.setPath("");
        return super.addEntity(t);
    }

    @Override
    public void remove(Administrateur t) throws Exception {
        super.setPath("");
        super.removeEntity(t);
    }

    @Override
    public void update(Administrateur t) throws Exception {
        super.setPath("");
        super.updateEntity(t);
    }

    @Override
    public Administrateur getById(Long l) throws Exception {
        super.setPath("" + l);
        return super.getEntity();
    }

    @Override
    public long getCount() throws Exception {
        super.setPath("Count");
        return super.getCountEntity();
    }

    @Override
    public List<Administrateur> getAll() throws Exception {
        super.setPath("");
        return super.getEntitys();
    }

    @Override
    public List<Administrateur> getAll(int i, int i1) throws Exception {
        super.setPath("" + i + "/" + i1);
        return super.getEntitys();
    }

    @Override
    public Administrateur getByLogin(String login) throws Exception {
        super.setPath("login/" + login);
        return super.getEntity();
    }

}
