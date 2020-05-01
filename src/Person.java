/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Avoor
 */
public class Person {
    private final Region region;
    private final Ålder ålder;
    private double probability;
    
    public Person(Region r, Ålder å){
        this.region = r;
        this.ålder = å;
    }
    
    public void check(){
        System.out.println("reg-tot: "+region.getTotaltAntalFall());
        System.out.println("reg-avlid: "+region.getTotaltAntalAvlidna());
        System.out.println("ålder-tot: "+ålder.getTotaltAntalFall());
        System.out.println("ålder-avlid: "+ålder.getAvlidna());
        //probability = ((region.getTotaltAntalAvlidna()/region.getTotaltAntalFall())*(ålder.getAvlidna()/ålder.getTotaltAntalFall()));
        probability = 3/2;
        System.out.println(probability);
    }
    
    @Override
    public String toString(){
        return String.valueOf(probability);
    }
}
