/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AlphaDeployment;
import Nnet.*;
import Controllers.*;

/**
 *
 * @author José Robles Bastidas
 */
public class CheckSimple {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ForwardCheck checker = new Controllers.ForwardCheck(true);
        if(checker.check()){
            System.out.println("All went as expected, CONGRATULATIONS");
        }else{
            System.out.println("Something is wrong, my condolences");
        }
    }
    
}
