/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier;

import fr.freeboxos.ftb.metier.entitys.Processeur;
import fr.freeboxos.ftb.physique.data.PhysiqueDataFactory;
import fr.freeboxos.ftb.physique.data.ProcesseurDataService;
import java.util.List;

/**
 *
 * @author alan
 */
public class ProcesseurServiceImpl implements ProcesseurService {

    private final ProcesseurDataService processeurDataService = PhysiqueDataFactory.getProcesseurDataService();

    @Override
    public Processeur add(Processeur t) throws Exception {
        return this.processeurDataService.add(t);
    }

    @Override
    public void remove(Processeur t) throws Exception {
        this.processeurDataService.remove(t);
    }

    @Override
    public void update(Processeur t) throws Exception {
        this.processeurDataService.update(t);
    }

    @Override
    public Processeur getById(Long l) throws Exception {
        return this.processeurDataService.getById(l);
    }

    @Override
    public long getCount() throws Exception {
        return this.processeurDataService.getCount();
    }

    @Override
    public List<Processeur> getAll() throws Exception {
        return this.processeurDataService.getAll();
    }

    @Override
    public List<Processeur> getAll(int i, int i1) throws Exception {
        return this.processeurDataService.getAll(i, i1);
    }

}
