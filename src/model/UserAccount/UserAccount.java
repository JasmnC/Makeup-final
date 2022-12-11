/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.UserAccount;

import javax.management.relation.Role;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.Organization;
import model.WorkQueue.WorkQueue;

/**
 *
 * @author yuujadz
 */
public class UserAccount {
    
    private String username;
    private String password;
    private Role role;
    private Network network;
    private Enterprise enterprise;
    private Organization orgainization;
    private WorkQueue workQueue;

    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public Organization getOrgainization() {
        return orgainization;
    }

    public void setOrgainization(Organization orgainization) {
        this.orgainization = orgainization;
    }

    public UserAccount() {
        workQueue= new workQueue();
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

}
