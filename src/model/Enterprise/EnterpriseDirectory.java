/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author yuujadz
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> enterpriseList;
   
    public EnterpriseDirectory(){
        enterpriseList = new ArrayList<Enterprise>();
    }   
    
    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name, Enterprise.Type type){
        
        Enterprise enterprise = null;

        if (type.getValue().equals(Enterprise.Type.MemberEnterprise.getValue())) {
            enterprise = new MemberEnterprise(name);
            enterpriseList.add(enterprise);
        } 
        else if (type.getValue().equals(Enterprise.Type.PhysicalTherapistEnterprise.getValue())) {
            enterprise = new PhysicalTherapistEnterprise(name);
            enterpriseList.add(enterprise);
        } 
        else if (type.getValue().equals(Enterprise.Type.TrainingEnterprise.getValue())) {
            enterprise = new TrainingEnterprise(name);
            enterpriseList.add(enterprise);
        }
        else if (type.getValue().equals(Enterprise.Type.FinanceEnterprise.getValue())) {
            enterprise = new FinanceEnterprise(name);
            enterpriseList.add(enterprise);
        }

        return enterprise;
    }

    public boolean nameIsUnique(String name){
        for(Enterprise enterprise : enterpriseList){
            if(name.equalsIgnoreCase(enterprise.getName())) return false;
         }
        return true;
    }
    
    public Enterprise getEnterpriseByName(String name){
        for (Enterprise e : enterpriseList){
            if (name.equalsIgnoreCase(e.getName())) return e;
        }
        return null;
    }
}    

