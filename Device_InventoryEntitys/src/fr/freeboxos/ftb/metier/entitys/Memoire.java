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
public class Memoire {

    private long id;
    private String marque;
    private String modele;
    private String type;
    private String format;
    private String capacite;
    private String frequence_memoire;
    private String ECC;
    private String radiateur;
    private String tension;
    private String prix;

    public Memoire() {
    }

    public Memoire(String marque, String modele, String type, String format, String capacite, String frequence_memoire, String ECC, String radiateur, String tension, String prix) {
        this.marque = marque;
        this.modele = modele;
        this.type = type;
        this.format = format;
        this.capacite = capacite;
        this.frequence_memoire = frequence_memoire;
        this.ECC = ECC;
        this.radiateur = radiateur;
        this.tension = tension;
        this.prix = prix;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getCapacite() {
        return capacite;
    }

    public void setCapacite(String capacite) {
        this.capacite = capacite;
    }

    public String getFrequence_memoire() {
        return frequence_memoire;
    }

    public void setFrequence_memoire(String frequence_memoire) {
        this.frequence_memoire = frequence_memoire;
    }

    public String getECC() {
        return ECC;
    }

    public void setECC(String ECC) {
        this.ECC = ECC;
    }

    public String getRadiateur() {
        return radiateur;
    }

    public void setRadiateur(String radiateur) {
        this.radiateur = radiateur;
    }

    public String getTension() {
        return tension;
    }

    public void setTension(String tension) {
        this.tension = tension;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Memoire{" + "id=" + id + ", marque=" + marque + ", modele=" + modele + ", type=" + type + ", format=" + format + ", capacite=" + capacite + ", frequence_memoire=" + frequence_memoire + ", ECC=" + ECC + ", radiateur=" + radiateur + ", tension=" + tension + ", prix=" + prix + '}';
    }

}
