/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.physique.data;

import fr.freeboxos.ftb.metier.entitys.HDD;
import fr.freeboxos.ftb.metier.entitys.SSD;
import java.sql.ResultSet;
import lml.persistence.jdbc.AbstracCrudServiceJDBC;

/**
 *
 * @author alan
 */
public class HDDDataServiceJDBCImpl extends AbstracCrudServiceJDBC<HDD> implements HDDDataService {

    public HDDDataServiceJDBCImpl() {

        try {
            String query = "CREATE TABLE IF NOT EXISTS `" + super.getEntityName() + "` (\n"
                    + "  `id` int(11) NOT NULL AUTO_INCREMENT,\n"
                    + "  `marque` varchar(255) NOT NULL,\n"
                    + "  `modele` varchar(255) NOT NULL,\n"
                    + "  `interface_ordinateur` varchar(255) NOT NULL,\n"
                    + "  `format` varchar(255) NOT NULL,\n"
                    + "  `capacite` varchar(255) NOT NULL,\n"
                    + "  `vitesse_de_rotation` varchar(255) NOT NULL,\n"
                    + "  `cache` varchar(255) NOT NULL,\n"
                    + "  `type_memoire` varchar(255),\n"
                    + "  `nvme` boolean,\n"
                    + "  `controleur` varchar(255),\n"
                    + "  `lecture` varchar(255),\n"
                    + "  `ecriture` varchar(255),\n"
                    + "  `iops` int(11),\n"
                    + "  `trim` boolean,\n"
                    + "  `prix` varchar(255) NOT NULL,\n"
                    + "  `classe` varchar(255) NOT NULL,\n"
                    + "  PRIMARY KEY (`id`)\n"
                    + ") ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;";
            super.executeQuery(query);

        } catch (Exception ex) {
            System.out.println("HDDDataServiceJDBCImpl() : " + ex);
        }

    }

    @Override
    protected HDD createEntity(ResultSet rs) throws Exception {
        HDD hdd;

        long id = rs.getLong("id");
        String marque = rs.getString("marque");
        String modele = rs.getString("modele");
        String interface_ordinateur = rs.getString("interface_ordinateur");
        String format = rs.getString("format");
        String capacite = rs.getString("capacite");
        String vitesse_de_rotation = rs.getString("vitesse_de_rotation");
        String cache = rs.getString("cache");
        String type_memoire = rs.getString("type_memoire");

//        String strNvme = rs.getString("nvme");
//        boolean nvme = strNvme.equals("true");
        boolean nvme = (rs.getInt("nvme") == 1);

        String controleur = rs.getString("controleur");
        String lecture = rs.getString("lecture");
        String ecriture = rs.getString("ecriture");
        long iops = rs.getLong("iops");

//        String strTrim = rs.getString("trim");
//        boolean trim = strTrim.equals("true");
        boolean trim = (rs.getInt("trim") == 1);
        String prix = rs.getString("prix");
        String classe = rs.getString("classe");

        if (classe.equals(HDD.class.getSimpleName())) {
            hdd = new HDD(marque, modele, interface_ordinateur, format, capacite, vitesse_de_rotation, cache, prix);
        } else {
            SSD ssd = new SSD(marque, modele, interface_ordinateur, format, capacite, vitesse_de_rotation, cache, prix);
            ssd.setControleur(controleur);
            ssd.setEcriture(ecriture);
            ssd.setIops(iops);
            ssd.setLecture(lecture);
            ssd.setNvme(nvme);
            ssd.setTrim(trim);
            ssd.setType_memoire(type_memoire);

            hdd = ssd;
        }

        hdd.setId(id);

        return hdd;

    }

    private boolean getBoolean(String value) {
        if (value.equals("1")) {
            return true;
        } else {
            return false;
        }
    }

    private String getBoolean(boolean value) {
        if (value) {
            return "1";
        } else {
            return "0";
        }
    }

    @Override
    public HDD add(HDD t) throws Exception {
        String query = "INSERT INTO " + super.getEntityName() + " (id, marque, modele, interface_ordinateur, format, capacite, vitesse_de_rotation, cache, prix, classe) VALUES ('"
                + t.getId() + "','"
                + t.getMarque() + "','"
                + t.getModele() + "','"
                + t.getInterface_ordinateur() + "','"
                + t.getFormat() + "','"
                + t.getCapacite() + "','"
                + t.getVitesse_de_rotation() + "','"
                + t.getCache() + "','"
                + t.getPrix() + "','"
                + t.getClass().getSimpleName() + "')";
        if (t instanceof SSD) {
            SSD ssd = (SSD) t;
            query = "INSERT INTO " + super.getEntityName() + " (id, marque, modele, interface_ordinateur, format, capacite, vitesse_de_rotation, cache, type_memoire, nvme, controleur, lecture, ecriture, iops, trim, prix, classe) VALUES ('"
                    + t.getId() + "','"
                    + t.getMarque() + "','"
                    + t.getModele() + "','"
                    + t.getInterface_ordinateur() + "','"
                    + t.getFormat() + "','"
                    + t.getCapacite() + "','"
                    + t.getVitesse_de_rotation() + "','"
                    + t.getCache() + "','"
                    + ssd.getType_memoire() + "','"
                    + this.getBoolean(((SSD) t).isNvme()) + "','"
                    + ssd.getControleur() + "','"
                    + ssd.getLecture() + "','"
                    + ssd.getEcriture() + "','"
                    + ssd.getIops() + "','"
                    + this.getBoolean(((SSD) t).isTrim()) + "','"
                    + t.getPrix() + "','"
                    + ssd.getClass().getSimpleName() + "')";
        }

        t.setId(super.executeAdd(query));

        return t;
    }

    @Override
    public void remove(HDD t) throws Exception {
        String query = "DELETE FROM " + super.getEntityName() + " WHERE id = '" + t.getId() + "'";
        super.executeQuery(query);
    }

    @Override
    public void update(HDD t) throws Exception {
        String query = "UPDATE " + super.getEntityName() + " SET marque = '" + t.getMarque()
                + "', modele = '" + t.getModele()
                + "', interface_ordinateur = '" + t.getInterface_ordinateur()
                + "', format = '" + t.getFormat()
                + "', capacite = '" + t.getCapacite()
                + "', vitesse_de_rotation = '" + t.getVitesse_de_rotation()
                + "', cache = '" + t.getCache()
                + "', prix = '" + t.getPrix()
                + "' WHERE id = '" + t.getId() + "'";
        if (t instanceof SSD) {
            SSD ssd = (SSD) t;
            query = "UPDATE " + super.getEntityName() + " SET marque = '" + t.getMarque()
                    + "', modele = '" + t.getModele()
                    + "', interface_ordinateur = '" + t.getInterface_ordinateur()
                    + "', format = '" + t.getFormat()
                    + "', capacite = '" + t.getCapacite()
                    + "', vitesse_de_rotation = '" + t.getVitesse_de_rotation()
                    + "', cache = '" + t.getCache()
                    + "', type_memoire = '" + ssd.getType_memoire()
                    + "', nvme = '" + this.getBoolean(((SSD) t).isNvme())
                    + "', controleur = '" + ssd.getControleur()
                    + "', lecture = '" + ssd.getLecture()
                    + "', ecriture = '" + ssd.getEcriture()
                    + "', iops = '" + ssd.getIops()
                    + "', trim = '" + this.getBoolean(((SSD) t).isTrim())
                    + "', prix = '" + t.getPrix()
                    + "' WHERE id = '" + t.getId() + "'";
        }
        t.setId(super.executeAdd(query));
    }

}
