/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dvd;

/**
 *
 * @author NDIFE
 */
abstract class dvdPlayer implements Dvd{
    Play play;
    Pause pause;
    Stop stop;
    
    dvdPlayer(Play play, Pause pause, Stop stop){
        this.play = play;
        this.pause = pause;
        this.stop = stop;
    }
   @Override
   public void Loader(){
    System.out.println("disk loader");
}
   @Override
public void Control(){
    this.play.start();
    this.pause.hold();
    this.stop.stop();
}
}
