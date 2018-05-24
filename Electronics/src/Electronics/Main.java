/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Electronics;

/**
 *
 * @author NDIFE
 */
public class Main {
    
    public static void main(String args[]){
        Dvdplate dvplate = new Dvdplate();
        Dvd  dv = new Dvd(dvplate);
        dv.on("DVD");
        dv.open();
        dv.close();
        dv.play();
        dv.pause();
        dv.stop();
        dv.off("DVD");
        Calculator cal = new Calculator();
        cal.on("Calculator");
        cal.solve();
        cal.off("Calculator");
    }
}
