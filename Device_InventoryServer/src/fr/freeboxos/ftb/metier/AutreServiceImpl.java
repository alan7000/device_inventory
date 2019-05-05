/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier;

import fr.freeboxos.ftb.metier.entitys.Autre;
import fr.freeboxos.ftb.physique.data.AutreDataService;
import fr.freeboxos.ftb.physique.data.PhysiqueDataFactory;
import java.util.List;

/**
 *
 * @author alan
 */
public class AutreServiceImpl implements AutreService {

    private final AutreDataService autreDataService = PhysiqueDataFactory.getAutreDataService();

    @Override
    public Autre add(Autre t) throws Exception {
        return this.autreDataService.add(t);
    }

    @Override
    public void remove(Autre t) throws Exception {
        this.autreDataService.remove(t);
    }

    @Override
    public void update(Autre t) throws Exception {
        this.autreDataService.update(t);
    }

    @Override
    public Autre getById(Long l) throws Exception {
        return this.autreDataService.getById(l);
    }

    @Override
    public long getCount() throws Exception {
        return this.autreDataService.getCount();
    }

    @Override
    public List<Autre> getAll() throws Exception {
        return this.autreDataService.getAll();
    }

    @Override
    public List<Autre> getAll(int i, int i1) throws Exception {
        return this.autreDataService.getAll(i, i1);
    }

}
