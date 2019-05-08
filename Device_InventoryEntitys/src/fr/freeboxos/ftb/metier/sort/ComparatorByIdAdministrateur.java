/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier.sort;

import fr.freeboxos.ftb.metier.entitys.Administrateur;
import java.util.Comparator;

/**
 *
 * @author alan
 */
public class ComparatorByIdAdministrateur implements Comparator<Administrateur> {

    @Override
    public int compare(Administrateur o1, Administrateur o2) {
        return (int) (o1.getId() - o2.getId());
    }

}
