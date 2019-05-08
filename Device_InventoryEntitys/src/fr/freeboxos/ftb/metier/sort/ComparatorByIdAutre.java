/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier.sort;

import fr.freeboxos.ftb.metier.entitys.Autre;
import java.util.Comparator;

/**
 *
 * @author alan
 */
public class ComparatorByIdAutre implements Comparator<Autre> {

    @Override
    public int compare(Autre o1, Autre o2) {
        return (int) (o1.getId() - o2.getId());
    }

}
