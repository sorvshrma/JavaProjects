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
public class VitalSignHistory {
    
    private ArrayList<VitalSigns> vitalSignList;
    
    public VitalSignHistory(){
        vitalSignList = new ArrayList<VitalSigns>();
    }

    public ArrayList<VitalSigns> getVitalSignList() {
        return vitalSignList;
    }

    public void setVitalSignList(ArrayList<VitalSigns> vitalSignList) {
        this.vitalSignList = vitalSignList;
    }
    
    public VitalSigns addVitalSign(){
        VitalSigns vs = new VitalSigns();
        vitalSignList.add(vs);
        return vs;
    }
    
    public void deleteSign(VitalSigns v){
        vitalSignList.remove(v);
    }
    
    public ArrayList<VitalSigns> abnormalSignsList(double minBP, double maxBP){
        ArrayList<VitalSigns> list = new ArrayList<>();
        
        for(VitalSigns vs : getVitalSignList()){
            if(vs.getBloodPressure() > maxBP || vs.getBloodPressure() < minBP){
                list.add(vs);
            }
        }
        return list;
    }
}
