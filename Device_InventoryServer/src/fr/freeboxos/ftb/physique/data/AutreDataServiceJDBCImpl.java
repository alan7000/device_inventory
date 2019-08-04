/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.physique.data;

import fr.freeboxos.ftb.metier.entitys.Autre;
import java.sql.ResultSet;
import lml.persistence.jdbc.AbstracCrudServiceJDBC;

/**
 *
 * @author alan
 */
public class AutreDataServiceJDBCImpl extends AbstracCrudServiceJDBC<Autre> implements AutreDataService {

    public AutreDataServiceJDBCImpl() {
        try {
            String query = "CREATE TABLE IF NOT EXISTS `" + super.getEntityName() + "` (\n"
                    + " `id` int(11) NOT NULL AUTO_INCREMENT,\n"
                    + " `element` TEXT,\n"
                    + " `nombre` int(11),"
                    + " PRIMARY KEY (`id`)\n"
                    + ") ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1";
            super.executeQuery(query);

        } catch (Exception e) {
            System.out.println("AutreDataServiceJDBCImpl() : " + e);
        }

    }

    @Override
    protected Autre createEntity(ResultSet rs) throws Exception {
        Autre autre;

        long id = rs.getLong("id");
        String element = rs.getString("element");
        int nombre = rs.getInt("nombre");

        autre = new Autre(element);
        autre.setId(id);
        autre.setNombre(nombre);

        return autre;
    }

    @Override
    public Autre add(Autre t) throws Exception {
        String query = "INSERT INTO " + super.getEntityName() + " (id, element, nombre) VALUES ('"
                + t.getId() + "','"
                + t.getElement() + "','"
                + t.getNombre() + "')";

        t.setId(super.executeAdd(query));

        return t;
    }

    @Override
    public void remove(Autre t) throws Exception {
        String query = "DELETE FROM " + super.getEntityName() + " WHERE id = '" + t.getId() + "'";
        super.executeQuery(query);
    }

    @Override
    public void update(Autre t) throws Exception {
        String query = "UPDATE " + super.getEntityName() + " SET id = '"
                + t.getId() + "', element = '"
                + t.getElement() + "', nombre = '"
                + t.getNombre() + "' WHERE id = '" + t.getId() + "'";

        super.executeQuery(query);
    }

}
