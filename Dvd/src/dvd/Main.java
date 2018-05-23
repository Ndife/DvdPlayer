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
public class Main {
    
   public static void main(String args[]){
       Open pn = new Open();
       Close cl = new Close();
       Play pl = new Play();
       Pause ps = new Pause();
       Stop st = new Stop();
       
       Power dv = new Power(pn,cl,pl,ps);
        Power put = new Power(pl,ps,st);
        dv.Loader();
        put.Control();
        
        
    }
}
