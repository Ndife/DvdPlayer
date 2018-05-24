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
public class Dvd extends Electronics implements Iplayable{
    public Dvdplate plate;
    Dvd(Dvdplate plate){
        this.plate = plate;
    }

    @Override
    public void open() {
    System.out.println("shiiiiiiii..... open");    
    }

    @Override
    public void close() {
     System.out.println("closed, ready....");
    }

    @Override
    public void play() {
        this.plate.Spin();
    }

    @Override
    public void pause() {
        this.plate.holdSpin();
    }

    @Override
    public void stop() {
        this.plate.noSpin();
    }

    
}
