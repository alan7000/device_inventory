/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.physique.data;

import fr.freeboxos.ftb.metier.entitys.Administrateur;
import java.sql.ResultSet;
import java.util.List;
import lml.persistence.jdbc.AbstracCrudServiceJDBC;

public class AdministrateurDataServiceJDBCImpl extends AbstracCrudServiceJDBC<Administrateur> implements AdministrateurDataService {

    public AdministrateurDataServiceJDBCImpl() {
        try {
            String query = "CREATE TABLE IF NOT EXISTS `" + super.getEntityName() + "` (\n"
                    + " `id` int(11) NOT NULL AUTO_INCREMENT,\n"
                    + " `login` varchar(255),\n"
                    + " `mdp` varchar(255),\n"
                    + " PRIMARY KEY (`id`)\n"
                    + ") ENGINE=InnoDB DEFAULT CHARSET=latin1 AUTO_INCREMENT=1";
            super.executeQuery(query);

            /**
             * Create default user
             */
            long count = this.getCount();
            if (count == 0) {
                Administrateur administrateur = new Administrateur();
                administrateur.setLogin("admin");
                administrateur.setMdp("admin");
                this.add(administrateur);
            }

        } catch (Exception e) {
            System.out.println("AdminstrateurDataServiceJDBCImpl() : " + e);
        }
    }

    @Override
    protected Administrateur createEntity(ResultSet rs) throws Exception {
        Administrateur administrateur;

        long id = rs.getLong("id");
        String login = rs.getString("login");
        String mdp = rs.getString("mdp");

        administrateur = new Administrateur(login, mdp);
        administrateur.setId(id);

        return administrateur;
    }

    /**
     *
     * @param t
     * @return
     * @throws Exception
     */
    @Override
    public Administrateur add(Administrateur t) throws Exception {
        String query = "INSERT INTO " + super.getEntityName() + " (id, login, mdp) VALUES ('"
                + t.getId() + "','"
                + t.getLogin() + "','"
                + t.getMdp() + "')";

        t.setId(super.executeAdd(query));

        return t;
    }

    @Override
    public void remove(Administrateur t) throws Exception {
        String query = "DELETE FROM " + super.getEntityName() + " WHERE id = '" + t.getId() + "'";
        super.executeQuery(query);
    }

    @Override
    public void update(Administrateur t) throws Exception {
        String query = "UPDATE " + super.getEntityName() + " SET id = '"
                + t.getId() + "', login = '"
                + t.getLogin() + "', mdp = '"
                + t.getMdp() + "' WHERE id = '" + t.getId() + "'";

        super.executeQuery(query);
    }

    @Override
    public Administrateur getByLogin(String login) throws Exception {
        String query = "SELECT * FROM " + super.getEntityName() + " WHERE login = '" + login + "'";
        return super.getSingleResult(query);
    }

}
