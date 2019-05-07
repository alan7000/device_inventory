/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.freeboxos.ftb.physique.data;

/**
 *
 * @author alan
 */
public class PhysiqueDataFactory {

    private static final AutreDataService autreDataService = new AutreDataServiceJDBCImpl();

    public static AutreDataService getAutreDataService() {
        return autreDataService;
    }

    private static final CableDataService cableDataService = new CableDataServiceJDBCImpl();

    public static CableDataService getCableDataService() {
        return cableDataService;
    }

    private static final HDDDataService hddDataService = new HDDDataServiceJDBCImpl();

    public static HDDDataService getHDDDataService() {
        return hddDataService;
    }

    private static final MemoireDataService memoireDataService = new MemoireDataServiceJDBCImpl();

    public static MemoireDataService getMemoireDataService() {
        return memoireDataService;
    }

    private static final ProcesseurDataService processeurDataService = new ProcesseurDataServiceJDBCImpl();

    public static ProcesseurDataService getProcesseurDataService() {
        return processeurDataService;
    }

    private static final AdministrateurDataService adminstateurDataService = new AdministrateurDataServiceJDBCImpl();

    public static AdministrateurDataService getAdministrateurDataService() {
        return adminstateurDataService;
    }

}
