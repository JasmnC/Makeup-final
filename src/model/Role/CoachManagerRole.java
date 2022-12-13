/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import javax.swing.JPanel;
import model.Enterprise.Enterprise;
import model.Enterprise.MemberEnterprise;
import model.Enterprise.TrainingEnterprise;
import model.Network.Network;
import model.Organization.ManagementOrganization;
import model.Organization.Organization;
import model.Organization.WelcomingOrganization;
import model.System.EcoSystem;
import model.UserAccount.UserAccount;
import ui.CoachManager.coachManagerPanel;
import ui.GymMember.MemberPanel;
import ui.SystemAdmin.ManageNetwork;

/**
 *
 * @author raunak
 */
public class CoachManagerRole extends Role {

    public CoachManagerRole() {
        this.type = RoleType.CoachManager;
    }


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        this.type = RoleType.CoachManager;
        return new coachManagerPanel(userProcessContainer, account, (ManagementOrganization) organization, (TrainingEnterprise) enterprise, network, ecosystem);
    }


}
