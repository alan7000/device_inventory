/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.physique.data;

import fr.freeboxos.ftb.metier.entitys.Memoire;
import java.sql.ResultSet;
import lml.persistence.jdbc.AbstracCrudServiceJDBC;

/**
 *
 * @author alan
 */
public class MemoireDataServiceJDBCImpl extends AbstracCrudServiceJDBC<Memoire> implements MemoireDataService {

    public MemoireDataServiceJDBCImpl() {
        try {
            String query = "CREATE TABLE IF NOT EXISTS `" + super.getEntityName() + "` (\n"
                    + "  `id` int(11) NOT NULL AUTO_INCREMENT,\n"
                    + "  `marque` varchar(255) NOT NULL,\n"
                    + "  `modele` varchar(255) NOT NULL,\n"
                    + "  `type` varchar(255),\n"
                    + "  `format` varchar(255),\n"
                    + "  `capacite` varchar(255) NOT NULL,\n"
                    + "  `frequence_memoire` varchar(255) NOT NULL,\n"
                    + "  `ECC` varchar(255) NOT NULL,\n"
                    + "  `radiateur` varchar(255) NOT NULL,\n"
                    + "  `tension` varchar(255) NOT NULL,\n"
                    + "  `prix` varchar(255) NOT NULL,\n"
                    + "  PRIMARY KEY (`id`)\n"
                    + ") ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;";
            super.executeQuery(query);

        } catch (Exception ex) {
            System.out.println("MemoireDataServiceJDBCImpl() : " + ex);
        }
    }

    @Override
    protected Memoire createEntity(ResultSet rs) throws Exception {
        Memoire memoire;
        long id = rs.getLong("id");
        String marque = rs.getString("marque");
        String modele = rs.getString("modele");
        String type = rs.getString("type");
        String format = rs.getString("format");
        String capacite = rs.getString("capacite");
        String frequence_memoire = rs.getString("frequence_memoire");
        String ECC = rs.getString("ECC");
        String radiateur = rs.getString("radiateur");
        String tension = rs.getString("tension");
        String prix = rs.getString("prix");

        memoire = new Memoire(marque, modele, type, format, capacite, frequence_memoire, ECC, radiateur, tension, prix);

        memoire.setId(id);

        return memoire;

    }

    @Override
    public Memoire add(Memoire t) throws Exception {
        String query = "INSERT INTO " + super.getEntityName() + " (id, marque, modele, type, format, capacite, frequence_memoire, ECC, radiateur, tension, prix) VALUES ('"
                + t.getId() + "','"
                + t.getMarque() + "','"
                + t.getModele() + "','"
                + t.getType() + "','"
                + t.getFormat() + "','"
                + t.getCapacite() + "','"
                + t.getFrequence_memoire() + "','"
                + t.getECC() + "','"
                + t.getRadiateur() + "','"
                + t.getTension() + "','"
                + t.getPrix() + "')";

        t.setId(super.executeAdd(query));

        return t;
    }

    @Override
    public void remove(Memoire t) throws Exception {
        String query = "DELETE FROM " + super.getEntityName() + " WHERE id = '" + t.getId() + "'";
        super.executeQuery(query);
    }

    @Override
    public void update(Memoire t) throws Exception {
        String query = "UPDATE " + super.getEntityName() + " SET marque = '" + t.getMarque()
                + "', modele = '" + t.getModele()
                + "', type = '" + t.getType()
                + "', format = '" + t.getFormat()
                + "', capacite = '" + t.getCapacite()
                + "', frequence_memoire = '" + t.getFrequence_memoire()
                + "', ECC = '" + t.getECC()
                + "', radiateur = '" + t.getRadiateur()
                + "', tension = '" + t.getTension()
                + "', prix = '" + t.getPrix()
                + "' WHERE id = '" + t.getId() + "'";
        t.setId(super.executeAdd(query));
    }

}
