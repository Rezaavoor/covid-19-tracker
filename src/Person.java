
import java.text.DecimalFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Reza Hosseini
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
        probability = (((double)region.getTotaltAntalAvlidna()/(double)region.getTotaltAntalFall())*((double)ålder.getAvlidna()/(double)ålder.getTotaltAntalFall()))*1000.0; //svaret är i promille!
        probability = round(probability); //avrundar till 3 decimaler
    }
    
    private double round(double n){
        DecimalFormat df = new DecimalFormat("#.###");
        return Double.valueOf(df.format(n));
    }
    
    @Override
    public String toString(){
        return String.valueOf(probability)+"‰";
    }
}
