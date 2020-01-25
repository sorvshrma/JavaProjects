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
public class FlightDirectory {
    private ArrayList<FlightDetails> flightDetails;
    
    public FlightDirectory(){
        flightDetails = new ArrayList<FlightDetails>();
    }

    public ArrayList<FlightDetails> getFlightDetails() {
        return flightDetails;
    }
    
    public FlightDetails addFlight(){
        FlightDetails f = new FlightDetails();
        flightDetails.add(f);
        return f;
    }
    
    public void removeFlight(FlightDetails f){
        flightDetails.remove(f);
    }
    
}
