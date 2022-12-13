/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.System;

import java.util.ArrayList;
import model.DB4O.DB4OUtil;
import model.Network.Network;
import model.UserAccount.AccountDirectory;
import model.UserAccount.UserAccount;

/**
 *
 * @author yuujadz
 */
public class EcoSystem {
    
    private ArrayList<Network> networkList;
    private UserAccount admin;
    private AccountDirectory accountDirectory;
    private static DB4OUtil db4oUtil = DB4OUtil.getInstance();


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

//    public void setNetworkList(ArrayList<Network> networkList) {
//        this.networkList = networkList;
//    }

    public UserAccount getSystemAdmin() {
        return admin;
    }

    public void setSystemAdmin(UserAccount admin) {
        this.admin = admin;
    }

    public AccountDirectory getAccountDirectory() {
        return accountDirectory;
    }

//    public void setAccountDirectory(AccountDirectory accountDirectory) {
//        this.accountDirectory = accountDirectory;
//    }

    
}
//   
//public class EcoSystem extends Organization{
//    
//    private static EcoSystem business;
//    private RestaurantDirectory restaurantDirectory;
//    private CustomerDirectory customerDirectory;
//    private DeliveryManDirectory deliveryManDirectory;
//
//    public EcoSystem(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory) {
//
//        this.restaurantDirectory = restaurantDirectory;
//        this.customerDirectory = customerDirectory;
//        this.deliveryManDirectory = deliveryManDirectory;
//    }
//    
//    public static EcoSystem getInstance(){
//        if(business==null){
//            business=new EcoSystem();
//        }
//        return business;
//    }
//    
//    @Override
//    public ArrayList<Role> getSupportedRole() {
//        ArrayList<Role> roleList=new ArrayList<Role>();
//        roleList.add(new SystemAdminRole());
//        return roleList;
//    }
//    private EcoSystem(){
//        super(null);
//        this.restaurantDirectory = new RestaurantDirectory();
//        this.customerDirectory = new CustomerDirectory();
//        this.deliveryManDirectory = new DeliveryManDirectory();
//    }
//
//    
//    public boolean checkIfUserIsUnique(String userName){
//       
//       return false;
//    }
//
//    public RestaurantDirectory getRestaurantDirectory() {
//        if (this.restaurantDirectory == null) {
//            restaurantDirectory = new RestaurantDirectory();
//        }
//        return restaurantDirectory;
//    }
//
//    public CustomerDirectory getCustomerDirectory() {
//        if (this.customerDirectory == null) {
//            customerDirectory = new CustomerDirectory();
//        }
//        return customerDirectory;
//    }
//
//    public DeliveryManDirectory getDeliveryManDirectory() {
//        if (this.deliveryManDirectory == null) {
//            deliveryManDirectory = new DeliveryManDirectory();
//        }
//        return deliveryManDirectory;
//    }
//       