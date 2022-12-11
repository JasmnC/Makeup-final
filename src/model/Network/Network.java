/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Network;

import model.Enterprise.EnterpriseDirectory;
import model.System.EcoSystem;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author yuujadz
 */
public class Network {
    
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private EcoSystem ecoSystem;
    private WorkQueue workQueue;

    
    public Network(String name, EcoSystem ecoSystem) {
        this.name = name;
        this.ecoSystem = ecoSystem;
        this.workQueue = new WorkQueue();
        enterpriseDirectory = new EnterpriseDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
//no setter in origin
    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public EcoSystem getEcoSystem() {
        return ecoSystem;
    }
//no setter in origin
    public void setEcoSystem(EcoSystem ecoSystem) {
        this.ecoSystem = ecoSystem;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    
}


//
//    @Override
//    public String toString() {
//        return name;
//    }    
//

