/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;

/**
 *
 * @author yuujadz
 */
public class OrganizationDirectory {
        private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(String name, Organization.Type type){
        Organization organization = null;
        if (type.getValue().equals(Organization.Type.WelcomingOrg.getValue())){
            organization = new WelcomingOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.MemberOrg.getValue())){
            organization = new MemberOrganization(name);
            organizationList.add(organization);
        }
         else if (type.getValue().equals(Organization.Type.PhisicalCheckOrg.getValue())){
            organization = new PhisicalCheckOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.ManagementOrg.getValue())){
            organization = new ManagementOrganization(name);
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.PersonaTrainerOrg.getValue())){
            organization = new PersonaTrainerOrganization(name);
            organizationList.add(organization);
        }
       
        else if (type.getValue().equals(Organization.Type.FinanceOrg.getValue())){
            organization = new FinanceOrganization(name);
            organizationList.add(organization);
        }
        
        return organization;
    
}
    
     public boolean nameIsUnique(String name){
        for(Organization organization : organizationList){
            if(name.equalsIgnoreCase(organization.getName())){
                return false;
            }
        }
        return true;
    }
    
    public Organization getOrganizationByName(String name){
        for (Organization o : organizationList){
            if (name.equalsIgnoreCase(o.getName())) return o;
        }
        return null;
    } 
}
