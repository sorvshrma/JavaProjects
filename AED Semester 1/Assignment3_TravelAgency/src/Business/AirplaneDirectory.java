/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author harry
 */
public class AirplaneDirectory {
    
    ArrayList<AirplaneDetails> airplane;
    
    public AirplaneDirectory(){
        airplane = new ArrayList<AirplaneDetails>();
    }
    
    public ArrayList<AirplaneDetails> getCustomer() {
        return airplane;
    }
    
    public AirplaneDetails addAirplane(){
        AirplaneDetails a = new AirplaneDetails();
        airplane.add(a);
        return a;
    }
    
    public void removeAirplane(AirplaneDetails a){
        airplane.remove(a);
    }
    
}
