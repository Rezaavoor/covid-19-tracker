/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Reza Hosseini
 */
public class Region {
    private final String namn;
    private final int totaltAntalFall,fallPer100000Inv,totaltAntalIntensVårdare,totaltAntalAvlidna,nyaFall;

    public Region(String n, int af, int af_inv, int aiv, int aa, int nf){
        this.namn = n;
        this.totaltAntalFall = af;
        this.fallPer100000Inv = af_inv;
        this.totaltAntalIntensVårdare = aiv;
        this.totaltAntalAvlidna = aa;
        this.nyaFall = nf;
    }
    
    public int getTotaltAntalAvlidna() {
        return totaltAntalAvlidna;
    }

    public int getNyaFall() {
        return nyaFall;
    }

    public String getNamn() {
        return namn;
    }

    public int getTotaltAntalFall() {
        return totaltAntalFall;
    }

    public int getFallPer100000Inv() {
        return fallPer100000Inv;
    }

    public int getTotaltAntalIntensVårdare() {
        return totaltAntalIntensVårdare;
    }
    @Override
    public String toString(){
        return "Regionen "+namn+" har "+totaltAntalFall+" fall smittade och "+totaltAntalAvlidna+"st har avlidit. Antal nya fall: "+nyaFall;
    }
}
