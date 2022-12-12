/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Role;

import javax.swing.JPanel;
import model.Enterprise.Enterprise;
import model.Enterprise.MemberEnterprise;
import model.Enterprise.PhysicalTherapistEnterprise;
import model.Network.Network;
import model.Organization.Organization;
import model.Organization.PhisicalCheckOrganization;
import model.System.EcoSystem;
import model.UserAccount.UserAccount;
import ui.FittnessTester.TesterPanel;

/**
 *
 * @author raunak
 */
public class TesterRole extends Role {

    public TesterRole() {
        this.type = RoleType.Tester;
    }


    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem ecosystem) {
        this.type = RoleType.Tester;
        return new TesterPanel(userProcessContainer, account, (PhisicalCheckOrganization) organization, (PhysicalTherapistEnterprise) enterprise, network, ecosystem);
    }


}
