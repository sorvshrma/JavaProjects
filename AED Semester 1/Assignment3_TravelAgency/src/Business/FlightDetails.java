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
public class FlightDetails {
    private String from;
    private String to;
    private double price;
    private String type;
    private int aisle;
    private int window;
    private int middle;
    private int w;
    private int m;
    private int a;

    public int getW() {
        return w;
    }

    public int getM() {
        return m;
    }

    public int getA() {
        return a;
    }
    
    /*private ArrayList<String> aisleArray;
    private ArrayList<String> windowArray;
    private ArrayList<String> middleArray;

    public ArrayList<String> getWindowArray() {
        return windowArray;
    }

    public void setWindowArray(ArrayList<String> windowArray) {
        this.windowArray = windowArray;
    }

    public ArrayList<String> getMiddleArray() {
        return middleArray;
    }

    public void setMiddleArray(ArrayList<String> middleArray) {
        this.middleArray = middleArray;
    }

    public ArrayList<String> getAisleArray() {
        return aisleArray;
    }

    public void setAisleArray(ArrayList<String> aisleArray) {
        this.aisleArray = aisleArray;
    }*/
    
    public FlightDetails(){
        this.w=0;
        this.m=0;
        this.a=0;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAisle() {
        return aisle;
    }

    public void setAisle(int aisle) {
        this.aisle = aisle;
    }

    public int getWindow() {
        return window;
    }

    public void setWindow(int window) {
        this.window = window;
    }

    public int getMiddle() {
        return middle;
    }

    public void setMiddle(int middle) {
        this.middle = middle;
    }
    
    @Override
    public String toString() {
        return this.getType();
    }

    public int decreaseAisle(int aisle) {
        --aisle;
        this.aisle = aisle;
        this.a = this.a+1;
        return aisle;
    }

    public int decreaseMiddle(int middle) {
        --middle;
        this.middle = middle;
        this.m = this.m+1;
        return middle;
    }

    public int decreaseWindow(int window) {
        --window;
        this.window = window;
        this.w = this.w+1;
        return window;
    }
    
}
