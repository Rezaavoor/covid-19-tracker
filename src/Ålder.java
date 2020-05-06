/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Reza Hosseini
 */
public class Ålder {
    private final String åldersGrupp;
    private final int totaltAntalFall, avlidna;

    public String getÅldersGrupp() {
        return åldersGrupp;
    }

    public int getTotaltAntalFall() {
        return totaltAntalFall;
    }

    public int getAvlidna() {
        return avlidna;
    }
    
    public Ålder(String å, int s, int a){
        this.totaltAntalFall = s;
        this.avlidna = a;
        this.åldersGrupp = å;
    }
    
    @Override
    public String toString(){
        return "Åldersgruppen "+åldersGrupp+" har "+totaltAntalFall+" sjukdomsfall och "+avlidna+" avlidna";
    }
}
