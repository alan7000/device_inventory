/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier;

import fr.freeboxos.ftb.metier.entitys.HDD;
import fr.freeboxos.ftb.physique.data.HDDDataService;
import fr.freeboxos.ftb.physique.data.PhysiqueDataFactory;
import java.util.List;

/**
 *
 * @author alan
 */
public class HDDServiceImpl implements HDDService {

    private final HDDDataService hDDDataService = PhysiqueDataFactory.getHDDDataService();

    @Override
    public HDD add(HDD t) throws Exception {
        return this.hDDDataService.add(t);
    }

    @Override
    public void remove(HDD t) throws Exception {
        this.hDDDataService.remove(t);
    }

    @Override
    public void update(HDD t) throws Exception {
        this.hDDDataService.update(t);
    }

    @Override
    public HDD getById(Long l) throws Exception {
        return this.hDDDataService.getById(l);
    }

    @Override
    public long getCount() throws Exception {
        return this.hDDDataService.getCount();
    }

    @Override
    public List<HDD> getAll() throws Exception {
        return this.hDDDataService.getAll();
    }

    @Override
    public List<HDD> getAll(int i, int i1) throws Exception {
        return this.hDDDataService.getAll(i, i1);
    }

}
