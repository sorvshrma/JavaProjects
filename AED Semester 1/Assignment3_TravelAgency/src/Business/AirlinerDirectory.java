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
public class AirlinerDirectory {
    private ArrayList<AirlinerDetails> airliner;
    
    public AirlinerDirectory(){
        airliner = new ArrayList<AirlinerDetails>();
    }

    public ArrayList<AirlinerDetails> getAirliner() {
        return airliner;
    }
    
    public AirlinerDetails addAirliner(){
        AirlinerDetails a = new AirlinerDetails();
        airliner.add(a);
        return a;
    }
    
    public void removeAirliner(AirlinerDetails a){
        airliner.remove(a);
    }

}
