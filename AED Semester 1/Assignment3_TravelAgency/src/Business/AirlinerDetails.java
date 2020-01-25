/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author harry
 */
public class AirlinerDetails {
    private String name;
    private String address;
    private AirplaneDirectory airplaneDirectory;
    private FlightDirectory flightDirectory;
    
    public AirlinerDetails(){
        //airplaneDirectory = new AirplaneDirectory();
        flightDirectory = new FlightDirectory();
    }

    /*public AirplaneDirectory getAirplaneDirectory() {
        return airplaneDirectory;
    }*/
    
    public FlightDirectory getFlightDirectory() {
        return flightDirectory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    @Override
    public String toString() {
        return this.getName();
    }
    
    
}
