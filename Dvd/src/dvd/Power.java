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
public class Power extends dvdPlayer{

    public Power(Play play, Pause pause, Stop stop) {
        super(play, pause, stop);
    }

    public Power(Open open, Close close, Play play, Pause pause) {
        super(open, close, play, pause);
    }
    
    
}
