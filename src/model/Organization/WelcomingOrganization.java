/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Organization;

import java.util.ArrayList;
import model.Role.GymManagerRole;
import model.Role.Role;

/**
 *
 * @author yuujadz
 */
public class WelcomingOrganization extends Organization {

    public WelcomingOrganization(String name) {
        super(name, Organization.Type.MemberOrg);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new GymManagerRole());
        return roles;
    }
    
}
