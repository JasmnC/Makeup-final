/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Role;

import javax.swing.JPanel;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.Organization;
import model.System.EcoSystem;
import model.UserAccount.UserAccount;
import ui.SystemAdmin.adminPanel;

/**
 *
 * @author yuujadz
 */
public abstract class Role {
    
        public enum RoleType {
            
        AnimalRegister("Animal Register"),
        AnimalManager("Animal Manager"),
        Vet("Vet"),
        Pharmacist("Pharmacist"),
        BehaviorTherapist("Behavior Therapist"),
        Adopter("Adopter"),
        AdoptionManager("Adoption Manager"), 
        VolunteerManeger("Volunteer Manager"),
        Volunteer("Volunteer"),
        SystemAdmin ("System Admin");

        private String value;

        private RoleType(String value) {
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

    public RoleType type;
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem Ecosystem);

    public JPanel createAdminWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem ecosystem) {
        this.type = RoleType.SystemAdmin;
        return new adminPanel(userProcessContainer, account, ecosystem);
    }
    
    @Override
    public String toString() {
        return this.type.getValue();
    } 
}
