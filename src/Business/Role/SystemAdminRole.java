/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;

import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import userinterface.SystemAdminWorkArea.SystemAdminWorkAreaJPanel;

/**
 *
 * @author anujakale
 */

//test constructors 
public class SystemAdminRole extends Role{

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem system, JPanel jp, JSplitPane jsp) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, system, jp, jsp);
    }
    
}
