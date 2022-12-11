/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.System;

import model.UserAccount.UserAccount;

/**
 *
 * @author yuujadz
 */
public class NewSystem {
    
    public static EcoSystem configure(){
        
        EcoSystem ecoSystem = new EcoSystem();  

     //   ecoSystem.getSystemAdmin();
             
        UserAccount account = new UserAccount();
        account.setUsername("admin");
        account.setPassword("admin");
        account.setRole(new SystemAdminRole());
        
        ecoSystem.setSystemAdmin(account);

  //      adminOrganization.getUserAccountDirectory().getUserAccountList().add(account);
        
        return ecoSystem;
    }
}

