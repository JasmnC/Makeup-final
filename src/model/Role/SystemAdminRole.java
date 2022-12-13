/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;


import javax.swing.JPanel;
import model.Enterprise.Enterprise;
import model.Network.Network;
import model.Organization.Organization;
import model.System.EcoSystem;
import model.UserAccount.UserAccount;
import ui.SystemAdmin.AdminPanel;

/**
 *
 * @author raunak
 */
public class SystemAdminRole extends Role{

    public SystemAdminRole() {
        this.type = RoleType.SystemAdmin;
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        this.type = RoleType.SystemAdmin;
        return new AdminPanel(userProcessContainer, account, ecosystem);
    }
    
}
