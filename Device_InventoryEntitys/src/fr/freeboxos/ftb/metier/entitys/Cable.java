/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.metier.entitys;

/**
 *
 * @author alan
 */
public class Cable {

    private long id;
    private String type;
    private String prise_a;
    private String prise_b;
    private long nombre;

    public Cable() {
    }

    public Cable(String type, String prise_a, String prise_b, long nombre) {
        this.type = type;
        this.prise_a = prise_a;
        this.prise_b = prise_b;
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrise_a() {
        return prise_a;
    }

    public void setPrise_a(String prise_a) {
        this.prise_a = prise_a;
    }

    public String getPrise_b() {
        return prise_b;
    }

    public void setPrise_b(String prise_b) {
        this.prise_b = prise_b;
    }

    public long getNombre() {
        return nombre;
    }

    public void setNombre(long nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Cable{" + "id=" + id + ", type=" + type + ", prise_a=" + prise_a + ", prise_b=" + prise_b + ", nombre=" + nombre + '}';
    }

}
