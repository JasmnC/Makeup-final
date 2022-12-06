/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.System;

import java.util.ArrayList;
import model.Network.Network;
import model.UserAccount.AccountDirectory;
import model.UserAccount.UserAccount;

/**
 *
 * @author yuujadz
 */
public class EcoSystem {
    
    private ArrayList<Network> networkList;
    private UserAccount systemAdmin;
    private AccountDirectory accountDirectory;

    public EcoSystem(){
        networkList = new ArrayList<Network>();
        accountDirectory = new AccountDirectory();
    }
    
    public Network createNetwork(String name){
        Network network = new Network(name,this);
        networkList.add(network);
        return network;
    }
    
    public ArrayList<Network> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<Network> networkList) {
        this.networkList = networkList;
    }

    public UserAccount getSystemAdmin() {
        return systemAdmin;
    }

    public void setSystemAdmin(UserAccount systemAdmin) {
        this.systemAdmin = systemAdmin;
    }

    public AccountDirectory getAccountDirectory() {
        return accountDirectory;
    }

    public void setAccountDirectory(AccountDirectory accountDirectory) {
        this.accountDirectory = accountDirectory;
    }

    
}
//private ArrayList<Network> networkList;
//    private UserAccount systemAdmin;
//    private UserAccountDirectory userAccountDirectory;
//    private static DB4OUtil db4oUtil = DB4OUtil.getInstance();
//    
//    public EcoSystem(){
//        networkList = new ArrayList<Network>();
//        userAccountDirectory = new UserAccountDirectory();
//    }
//   
//    public Network createNetwork(String name){
//        Network network = new Network(name,this);
//        networkList.add(network);
//        return network;
//    }
//    
//    public ArrayList<Network> getNetworkList() {
//        return networkList;
//    }
//    
//    public boolean nameIsUnique(String name){
//        for (Network n : networkList){
//            if (name.equalsIgnoreCase(n.getName())) return false;
//        }
//        return true;
//    }
//
//    public UserAccount getSystemAdmin() {
//        return systemAdmin;
//    }
//
//    public void setSystemAdmin(UserAccount systemAdmin) {
//        this.systemAdmin = systemAdmin;
//    }
//    
//    public UserAccountDirectory getUserAccountDirectory() {
//        return userAccountDirectory;
//    }
//    
