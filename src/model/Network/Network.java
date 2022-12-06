/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Network;

import model.Enterprise.EnterpriseDirectory;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author yuujadz
 */
public class Network {
    
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private System system;
    private WorkQueue workQueue;

    
    public Network(String name, System ecoSystem) {
        this.name = name;
        this.system = system;
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

    public void setEnterpriseDirectory(EnterpriseDirectory enterpriseDirectory) {
        this.enterpriseDirectory = enterpriseDirectory;
    }

    public System getSystem() {
        return system;
    }

    public void setSystem(System system) {
        this.system = system;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    
}
