/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier.sort;

import fr.freeboxos.ftb.metier.entitys.Processeur;
import java.util.Comparator;

/**
 *
 * @author alan
 */
public class ComparatorByIdProcesseur implements Comparator<Processeur> {

    @Override
    public int compare(Processeur o1, Processeur o2) {
        return (int) (o1.getId() - o2.getId());
    }

//    @Override
//    public int compare(Attribution t, Attribution t1) {
//        return (int) (t.getId() - t1.getId());
//    }
}
