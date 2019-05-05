/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier;

import fr.freeboxos.ftb.metier.entitys.Memoire;
import fr.freeboxos.ftb.physique.data.MemoireDataService;
import fr.freeboxos.ftb.physique.data.PhysiqueDataFactory;
import java.util.List;

/**
 *
 * @author alan
 */
public class MemoireServiceImpl implements MemoireService {

    private final MemoireDataService memoireDataService = PhysiqueDataFactory.getMemoireDataService();

    @Override
    public Memoire add(Memoire t) throws Exception {
        return this.memoireDataService.add(t);
    }

    @Override
    public void remove(Memoire t) throws Exception {
        this.memoireDataService.remove(t);
    }

    @Override
    public void update(Memoire t) throws Exception {
        this.memoireDataService.update(t);
    }

    @Override
    public Memoire getById(Long l) throws Exception {
        return this.memoireDataService.getById(l);
    }

    @Override
    public long getCount() throws Exception {
        return this.memoireDataService.getCount();
    }

    @Override
    public List<Memoire> getAll() throws Exception {
        return this.memoireDataService.getAll();
    }

    @Override
    public List<Memoire> getAll(int i, int i1) throws Exception {
        return this.memoireDataService.getAll(i, i1);
    }

}
