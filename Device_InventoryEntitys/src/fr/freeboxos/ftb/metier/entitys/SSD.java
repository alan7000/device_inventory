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
public class SSD extends HDD {

    private String type_memoire;
    private boolean nvme;
    private String controleur;
    private String lecture;
    private String ecriture;
    private long iops;
    private boolean trim;

    public SSD(boolean nvme, boolean trim) {
        this.nvme = false;
        this.trim = false;
    }

    public SSD(String type_memoire, boolean nvme, String controleur, String lecture, String ecriture, long iops, boolean trim) {
        this.type_memoire = type_memoire;
        this.nvme = nvme;
        this.controleur = controleur;
        this.lecture = lecture;
        this.ecriture = ecriture;
        this.iops = iops;
        this.trim = trim;
    }

    public String getType_memoire() {
        return type_memoire;
    }

    public void setType_memoire(String type_memoire) {
        this.type_memoire = type_memoire;
    }

    public boolean isNvme() {
        return nvme;
    }

    public void setNvme(boolean nvme) {
        this.nvme = nvme;
    }

    public String getControleur() {
        return controleur;
    }

    public void setControleur(String controleur) {
        this.controleur = controleur;
    }

    public String getLecture() {
        return lecture;
    }

    public void setLecture(String lecture) {
        this.lecture = lecture;
    }

    public String getEcriture() {
        return ecriture;
    }

    public void setEcriture(String ecriture) {
        this.ecriture = ecriture;
    }

    public long getIops() {
        return iops;
    }

    public void setIops(long iops) {
        this.iops = iops;
    }

    public boolean isTrim() {
        return trim;
    }

    public void setTrim(boolean trim) {
        this.trim = trim;
    }

    @Override
    public String toString() {
        return "SSD{" + "type_memoire=" + type_memoire + ", nvme=" + nvme + ", controleur=" + controleur + ", lecture=" + lecture + ", ecriture=" + ecriture + ", iops=" + iops + ", trim=" + trim + '}';
    }

}
