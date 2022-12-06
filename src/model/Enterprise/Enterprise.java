/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Enterprise;

import model.Organization.OrganizationDirectory;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author yuujadz
 */
public class Enterprise {
    //private Type type;
    private String name;
    private OrganizationDirectory organizationDirectory;
    private WorkQueue workQueue;
    
//    public enum Type {
//        
//
//        private String value;
//
//        private Type(String value) {
//            this.value = value;
//        }
//
//        public String getValue() {
//            return value;
//        }
//
//        @Override
//        public String toString() {
//            return value;
//        }
//    }
    
    public Enterprise(String name
//, Type type
        ) {
        this.name = name;
//        this.type = type;
        this.workQueue = new WorkQueue();
        organizationDirectory = new OrganizationDirectory();        
    }
    
//    public Type getType() {
//        return type;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    @Override
    public String toString() {
        return name;
    }
}
