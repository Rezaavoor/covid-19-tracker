/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Avoor
 */
public class Ålder {
    private final String åldersGrupp;
    private final int sjukdomsFall, avlidna;
    
    public Ålder(String å, int s, int a){
        this.sjukdomsFall = s;
        this.avlidna = a;
        this.åldersGrupp = å;
    }
    
    @Override
    public String toString(){
        return "Åldersgruppen "+åldersGrupp+" har "+sjukdomsFall+" sjukdomsfall och "+avlidna+" avlidna";
    }
}
