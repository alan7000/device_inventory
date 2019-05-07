/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.physique.data;

import fr.freeboxos.ftb.metier.entitys.Processeur;
import java.sql.ResultSet;
import lml.persistence.jdbc.AbstracCrudServiceJDBC;

/**
 *
 * @author alan
 */
public class ProcesseurDataServiceJDBCImpl extends AbstracCrudServiceJDBC<Processeur> implements ProcesseurDataService {

    public ProcesseurDataServiceJDBCImpl() {
        try {
            String query = "CREATE TABLE IF NOT EXISTS `" + super.getEntityName() + "` (\n"
                    + "  `id` int(11) NOT NULL AUTO_INCREMENT,\n"
                    + "  `marque` varchar(255) NOT NULL,\n"
                    + "  `modele` varchar(255) NOT NULL,\n"
                    + "  `socket` varchar(255),\n"
                    + "  `frequence` varchar(255),\n"
                    + "  `turbo` varchar(255) NOT NULL,\n"
                    + "  `core` int(11) NOT NULL,\n"
                    + "  `thread` int(11) NOT NULL,\n"
                    + "  `plateforme_nom` varchar(255) NOT NULL,\n"
                    + "  `finesse_gravure` varchar(255) NOT NULL,\n"
                    + "  `TDP` varchar(255) NOT NULL,\n"
                    + "  `L1` varchar(255) NOT NULL,\n"
                    + "  `L2` varchar(255) NOT NULL,\n"
                    + "  `L3` varchar(255) NOT NULL,\n"
                    + "  `prix` varchar(255) NOT NULL,\n"
                    + "  PRIMARY KEY (`id`)\n"
                    + ") ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;";
            super.executeQuery(query);

        } catch (Exception ex) {
            System.out.println("MemoireDataServiceJDBCImpl() : " + ex);
        }
    }

    @Override
    protected Processeur createEntity(ResultSet rs) throws Exception {
        Processeur processeur;

        long id = rs.getLong("id");
        String marque = rs.getString("marque");
        String modele = rs.getString("modele");
        String socket = rs.getString("socket");
        String frequence = rs.getString("frequence");
        String turbo = rs.getString("turbo");
        int core = rs.getInt("core");
        int thread = rs.getInt("thread");
        String plateforme_nom = rs.getString("plateforme_nom");
        String finesse_gravure = rs.getString("finesse_gravure");
        String TDP = rs.getString("TDP");
        String L1 = rs.getString("L1");
        String L2 = rs.getString("L2");
        String L3 = rs.getString("L3");
        String prix = rs.getString("prix");

        processeur = new Processeur(marque, modele, socket, frequence, turbo, core, thread, plateforme_nom, finesse_gravure, TDP, L1, L2, L3, prix);

        processeur.setId(id);

        return processeur;
    }

    @Override
    public Processeur add(Processeur t) throws Exception {
        String query = "INSERT INTO " + super.getEntityName() + " (marque, modele, socket, frequence, turbo, core, thread, plateforme_nom, finesse_gravure, TDP, L1, L2, L3, prix) VALUES ('"
                + t.getMarque() + "','"
                + t.getModele() + "','"
                + t.getSocket() + "','"
                + t.getFrequence() + "','"
                + t.getTurbo() + "','"
                + t.getCore() + "','"
                + t.getThread() + "','"
                + t.getPlateforme_nom() + "','"
                + t.getFinesse_gravure() + "','"
                + t.getTDP() + "','"
                + t.getL1() + "','"
                + t.getL2() + "','"
                + t.getL3() + "','"
                + t.getPrix() + "')";

        t.setId(super.executeAdd(query));

        return t;
    }

    @Override
    public void remove(Processeur t) throws Exception {
        String query = "DELETE FROM " + super.getEntityName() + " WHERE id = '" + t.getId() + "'";
        super.executeQuery(query);
    }

    @Override
    public void update(Processeur t) throws Exception {
        String query = "UPDATE " + super.getEntityName() + " SET marque = '" + t.getMarque()
                + "', modele = '" + t.getModele()
                + "', socket = '" + t.getSocket()
                + "', frequence = '" + t.getFrequence()
                + "', turbo = '" + t.getTurbo()
                + "', core = '" + t.getCore()
                + "', thread = '" + t.getThread()
                + "', plateforme_nom = '" + t.getPlateforme_nom()
                + "', finesse_gravure = '" + t.getFinesse_gravure()
                + "', TDP = '" + t.getTDP()
                + "', L1 = '" + t.getL1()
                + "', L2 = '" + t.getL2()
                + "', L3 = '" + t.getL3()
                + "', prix = '" + t.getPrix()
                + "' WHERE id = '" + t.getId() + "'";
        t.setId(super.executeAdd(query));
    }

}
