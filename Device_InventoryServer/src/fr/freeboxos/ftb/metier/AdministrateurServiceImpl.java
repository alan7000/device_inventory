/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier;

import fr.freeboxos.ftb.metier.entitys.Administrateur;
import fr.freeboxos.ftb.physique.data.AdministrateurDataService;
import fr.freeboxos.ftb.physique.data.PhysiqueDataFactory;
import java.util.List;

public class AdministrateurServiceImpl implements AdministrateurService {

    private final AdministrateurDataService administrateurDataService = PhysiqueDataFactory.getAdministrateurDataService();

    @Override

    public Administrateur add(Administrateur t) throws Exception {
        return this.administrateurDataService.add(t);
    }

    @Override
    public void remove(Administrateur t) throws Exception {
        this.administrateurDataService.remove(t);
    }

    @Override
    public void update(Administrateur t) throws Exception {
        this.administrateurDataService.remove(t);
    }

    @Override
    public Administrateur getById(Long l) throws Exception {
        return this.administrateurDataService.getById(l);
    }

    @Override
    public long getCount() throws Exception {
        return this.administrateurDataService.getCount();
    }

    @Override
    public List<Administrateur> getAll() throws Exception {
        return this.administrateurDataService.getAll();
    }

    @Override
    public List<Administrateur> getAll(int i, int i1) throws Exception {
        return this.administrateurDataService.getAll(i, i1);
    }

    @Override
    public Administrateur getByLogin(String login) throws Exception {
        return this.administrateurDataService.getByLogin(login);
    }

}
