/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.physique.data;

import fr.freeboxos.ftb.metier.entitys.Cable;
import java.sql.ResultSet;
import lml.persistence.jdbc.AbstracCrudServiceJDBC;

/**
 *
 * @author alan
 */
public class CableDataServiceJDBCImpl extends AbstracCrudServiceJDBC<Cable> implements CableDataService {

    public CableDataServiceJDBCImpl() {
        try {
            String query = "CREATE TABLE IF NOT EXISTS `" + super.getEntityName() + "` (\n"
                    + "  `id` int(11) NOT NULL AUTO_INCREMENT,\n"
                    + "  `type` varchar(255) NOT NULL,\n"
                    + "  `prise_A` varchar(255) NOT NULL,\n"
                    + "  `prise_B` varchar(255) NOT NULL,\n"
                    + "  `nombre` int(11) NOT NULL,\n"
                    + "  PRIMARY KEY (`id`)\n"
                    + ") ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1 ;";
            super.executeQuery(query);

        } catch (Exception ex) {
            System.out.println("CableDataServiceJDBCImpl() : " + ex);
        }
    }

    @Override
    protected Cable createEntity(ResultSet rs) throws Exception {
        Cable cable;

        long id = rs.getLong("id");
        String type = rs.getString("type");
        String priseA = rs.getString("prise_A");
        String priseB = rs.getString("prise_B");
        int nombre = rs.getInt("nombre");

        cable = new Cable(type, priseA, priseB, nombre);
        cable.setId(id);

        return cable;
    }

    @Override
    public Cable add(Cable t) throws Exception {
        String query = "INSERT INTO " + super.getEntityName() + " (id, type, prise_A, prise_B, nombre) VALUES ('"
                + t.getId() + "','"
                + t.getType() + "','"
                + t.getPrise_a() + "','"
                + t.getPrise_b() + "','"
                + t.getNombre() + "')";

        t.setId(super.executeAdd(query));

        return t;
    }

    @Override
    public void remove(Cable t) throws Exception {
        String query = "DELETE FROM " + super.getEntityName() + " WHERE id = '" + t.getId() + "'";
        super.executeQuery(query);
    }

    @Override
    public void update(Cable t) throws Exception {
        String query = "UPDATE " + super.getEntityName() + " SET id = '"
                + t.getId() + "', type = '"
                + t.getType() + "', prise_A = '"
                + t.getPrise_a() + "', prise_B = '"
                + t.getPrise_b() + "', nombre = '"
                + t.getNombre() + "' WHERE id = '" + t.getId() + "'";

        super.executeQuery(query);
    }

}
