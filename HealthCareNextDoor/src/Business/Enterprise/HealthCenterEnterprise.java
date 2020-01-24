/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MyPC1
 */
public class HealthCenterEnterprise extends Enterprise {
    
    public HealthCenterEnterprise(String name){
        super(name,EnterpriseType.HealthCenter);
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
    
    public List<Organization.Type> getAllOrganizationTypes()
    {
        List<Organization.Type> orgTypes = new ArrayList<>();
        orgTypes.add(Organization.Type.Doctor);
        orgTypes.add(Organization.Type.Lab);
        orgTypes.add(Organization.Type.Patient);
        orgTypes.add(Organization.Type.Accountant);
        
        
        return orgTypes;
        
    }
    
}
