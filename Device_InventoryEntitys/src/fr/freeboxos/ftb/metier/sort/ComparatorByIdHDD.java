/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier.sort;

import fr.freeboxos.ftb.metier.entitys.HDD;
import java.util.Comparator;

/**
 *
 * @author alan
 */
public class ComparatorByIdHDD implements Comparator<HDD> {

    @Override
    public int compare(HDD t, HDD t1) {
        return (int) (t.getId() - t1.getId());
    }

}
