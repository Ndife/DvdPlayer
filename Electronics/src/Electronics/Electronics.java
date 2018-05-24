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
abstract class Electronics{
    
    
    void off(String name){
        System.out.println("The ".concat(name).concat(" is off"));
    }
    
    void on(String name){
        System.out.println("The ".concat(name).concat(" is on"));
    }
            
}
