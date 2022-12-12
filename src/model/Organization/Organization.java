/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Role.Role;

/**
 *
 * @author yuujadz
 */
public abstract class Organization {
    
    private Type type;
    private String name;
//    private WorkQueue workQueue;
//    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int idCounter;
    
    public enum Type {
        
        WelcomingOrg("Welcoming Organization"), 
        MemberOrg("Member Organization"), 
        PhisicalCheckOrg("Physical Check Organization"),
        ManagementOrg("Managment Organization"),
        PersonaTrainerOrg("Personal Trainer Organization"), 
        FinanceOrg("Finance Organization");
        
        private String value;
        
        private Type(String value) {
            this.value = value;
        }
        
        public String getValue() {
            return value;
        }
        
     @Override
        public String toString() {
            return value;
        }
        
    }

    public Organization(String name, Type type) {
        this.name = name;
        this.type = type;
//        workQueue = new WorkQueue();
//        userAccountDirectory = new UserAccountDirectory();
        organizationID = idCounter;
        ++idCounter;
    }

    public abstract ArrayList<Role> getSupportedRole();
    
//    public UserAccountDirectory getUserAccountDirectory() {
//        return userAccountDirectory;
//    }

    public int getOrganizationID() {
        return organizationID;
    }

    public Type getType() {
        return type;
    }
    
    public String getName() {
        return name;
    }

//    public WorkQueue getWorkQueue() {
//        return workQueue;
//    }

    public void setName(String name) {
        this.name = name;
    }

//    public void setWorkQueue(WorkQueue workQueue) {
//        this.workQueue = workQueue;
//    }

    @Override
    public String toString() {
        return name;
    }
    
}
