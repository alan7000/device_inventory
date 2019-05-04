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
public class Processeur {

    private long id;
    private String marque;
    private String modele;
    private String socket;
    private String frequence;
    private String turbo;
    private int core;
    private int thread;
    private String plateforme_nom;
    private String finesse_gravure;
    private String TDP;
    private String L1;
    private String L2;
    private String L3;
    private String prix;

    public Processeur() {
    }

    public Processeur(String marque, String modele, String socket, String frequence, String turbo, int core, int thread, String plateforme_nom, String finesse_gravure, String TDP, String L1, String L2, String L3, String prix) {
        this.marque = marque;
        this.modele = modele;
        this.socket = socket;
        this.frequence = frequence;
        this.turbo = turbo;
        this.core = core;
        this.thread = thread;
        this.plateforme_nom = plateforme_nom;
        this.finesse_gravure = finesse_gravure;
        this.TDP = TDP;
        this.L1 = L1;
        this.L2 = L2;
        this.L3 = L3;
        this.prix = prix;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
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

    public String getSocket() {
        return socket;
    }

    public void setSocket(String socket) {
        this.socket = socket;
    }

    public String getFrequence() {
        return frequence;
    }

    public void setFrequence(String frequence) {
        this.frequence = frequence;
    }

    public String getTurbo() {
        return turbo;
    }

    public void setTurbo(String turbo) {
        this.turbo = turbo;
    }

    public int getCore() {
        return core;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public int getThread() {
        return thread;
    }

    public void setThread(int thread) {
        this.thread = thread;
    }

    public String getPlateforme_nom() {
        return plateforme_nom;
    }

    public void setPlateforme_nom(String plateforme_nom) {
        this.plateforme_nom = plateforme_nom;
    }

    public String getFinesse_gravure() {
        return finesse_gravure;
    }

    public void setFinesse_gravure(String finesse_gravure) {
        this.finesse_gravure = finesse_gravure;
    }

    public String getTDP() {
        return TDP;
    }

    public void setTDP(String TDP) {
        this.TDP = TDP;
    }

    public String getL1() {
        return L1;
    }

    public void setL1(String L1) {
        this.L1 = L1;
    }

    public String getL2() {
        return L2;
    }

    public void setL2(String L2) {
        this.L2 = L2;
    }

    public String getL3() {
        return L3;
    }

    public void setL3(String L3) {
        this.L3 = L3;
    }

    @Override
    public String toString() {
        return "Processeur{" + "id=" + id + ", marque=" + marque + ", modele=" + modele + ", socket=" + socket + ", frequence=" + frequence + ", turbo=" + turbo + ", core=" + core + ", thread=" + thread + ", plateforme_nom=" + plateforme_nom + ", finesse_gravure=" + finesse_gravure + ", TDP=" + TDP + ", L1=" + L1 + ", L2=" + L2 + ", L3=" + L3 + '}';
    }

}
