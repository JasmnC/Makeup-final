/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import javax.swing.JPanel;
import model.Enterprise.Enterprise;
import model.Enterprise.FinanceEnterprise;
import model.Enterprise.MemberEnterprise;
import model.Enterprise.TrainingEnterprise;
import model.Network.Network;
import model.Organization.FinanceOrganization;
import model.Organization.ManagementOrganization;
import model.Organization.Organization;
import model.Organization.PersonaTrainerOrganization;
import model.Organization.WelcomingOrganization;
import model.System.EcoSystem;
import model.UserAccount.UserAccount;
import ui.Accountant.AccountantPanel;
import ui.CoachManager.coachManagerPanel;
import ui.GymMember.MemberPanel;
import ui.PersonalTrainer.PersonalTrainerPanel;
import ui.SystemAdmin.ManageNetwork;

/**
 *
 * @author raunak
 */
public class AccountantRole extends Role {

    public AccountantRole() {
        this.type = RoleType.Accountant;
    }


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        this.type = RoleType.Accountant;
        return new AccountantPanel(userProcessContainer, account, (FinanceOrganization) organization, (FinanceEnterprise) enterprise, network, ecosystem);
    }


}
