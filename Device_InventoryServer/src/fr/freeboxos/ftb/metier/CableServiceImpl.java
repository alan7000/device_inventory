/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier;

import fr.freeboxos.ftb.metier.entitys.Cable;
import fr.freeboxos.ftb.physique.data.CableDataService;
import fr.freeboxos.ftb.physique.data.PhysiqueDataFactory;
import java.util.List;

/**
 *
 * @author alan
 */
public class CableServiceImpl implements CableService {

    private final CableDataService cableDataService = PhysiqueDataFactory.getCableDataService();

    @Override
    public Cable add(Cable t) throws Exception {
        return this.cableDataService.add(t);
    }

    @Override
    public void remove(Cable t) throws Exception {
        this.cableDataService.remove(t);
    }

    @Override
    public void update(Cable t) throws Exception {
        this.cableDataService.update(t);
    }

    @Override
    public Cable getById(Long l) throws Exception {
        return this.cableDataService.getById(l);
    }

    @Override
    public long getCount() throws Exception {
        return this.cableDataService.getCount();
    }

    @Override
    public List<Cable> getAll() throws Exception {
        return this.cableDataService.getAll();
    }

    @Override
    public List<Cable> getAll(int i, int i1) throws Exception {
        return this.cableDataService.getAll(i, i1);
    }

}
