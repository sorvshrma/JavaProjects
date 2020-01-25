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
public class AirplaneDetails {
    
    private String name;
    private int seats;
    private FlightDirectory flightDirectory;
    
    public AirplaneDetails(){
        //flightDirectory = new FlightDirectory();
    }

    /*public FlightDirectory getFlightDirectory() {
        return flightDirectory;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
    
}
