/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier.sort;

import fr.freeboxos.ftb.metier.entitys.Cable;
import java.util.Comparator;

/**
 *
 * @author alan
 */
public class ComparatorByIdCable implements Comparator<Cable> {

    @Override
    public int compare(Cable o1, Cable o2) {
        return (int) (o1.getId() - o2.getId());
    }

}
