/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import javax.swing.JPanel;
import model.Enterprise.Enterprise;
import model.Enterprise.MemberEnterprise;
import model.Network.Network;
import model.Organization.Organization;
import model.Organization.WelcomingOrganization;
import model.System.EcoSystem;
import model.UserAccount.UserAccount;
import ui.GymManager.GymManagerPanel;

/**
 *
 * @author raunak
 */
public class GymManagerRole extends Role {

    public GymManagerRole() {
        this.type = RoleType.GymManager;
    }


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        this.type = RoleType.GymManager;
        return new GymManagerPanel(userProcessContainer, account, (WelcomingOrganization) organization, (MemberEnterprise) enterprise, network, ecosystem);
    }


}
