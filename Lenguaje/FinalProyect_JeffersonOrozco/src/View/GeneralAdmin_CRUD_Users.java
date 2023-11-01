/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controllers.ControllerUsers;
import Model.User;
import Singleton.Singleton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jeff
 */
public class GeneralAdmin_CRUD_Users extends javax.swing.JFrame {

    /////////////////////////////////////
    private String namePerson;
    private String lastNamePerson;
    private int idPerson;
    private String role;
    private String password;
    private String nameUser;
    /////////////////////////////////////

    ////////////////////////////////////
    User user;
    ///////////////////////////////////

    /////////////////////////////////////
    DefaultTableModel modelTableUsers;
    private ControllerUsers controllerUsers;
    /////////////////////////////////////////

    public GeneralAdmin_CRUD_Users() {

      
        //////////////////////////////////////////////////////////
        modelTableUsers = new DefaultTableModel();///Table
        controllerUsers = new ControllerUsers();
        /////////////////////////////////////////////////////////

        initComponents();
        setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
        this.setExtendedState(MAXIMIZED_BOTH);

    }

    private void createAccess() {
        namePerson = txt_NamePerson.getText();
        lastNamePerson = txt_LastNamePerson.getText();
        idPerson = Integer.parseInt(txt_idPerson.getText());
        role = cb_RoleUser.getSelectedItem().toString();
        password = txt_PasswordUser.getText();
        nameUser = txt_UserPerson.getText();

        user = new User(nameUser, password, idPerson, namePerson, lastNamePerson, role);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txt_LastNamePerson = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_idPerson = new javax.swing.JTextField();
        txt_UserPerson = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        cb_RoleUser = new javax.swing.JComboBox<>();
        txt_PasswordUser = new javax.swing.JTextField();
        txt_NamePerson = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_tableUsers = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btn_UpdateUser = new javax.swing.JButton();
        btn_CreateUser = new javax.swing.JButton();
        btn_DeleteUser = new javax.swing.JButton();
        btn_ReadUser = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(java.awt.Color.white);

        jPanel1.setBackground(java.awt.Color.white);
        jPanel1.setForeground(java.awt.Color.white);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setText("Nombre");

        txt_LastNamePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_LastNamePersonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel4.setText("Apellido");

        txt_idPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idPersonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel5.setText("CC");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel6.setText("Contraseña");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel7.setText("Usuario");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel9.setText("Tipo");

        cb_RoleUser.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleado logitica","Administrador aerolineas" }));
        cb_RoleUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_RoleUserActionPerformed(evt);
            }
        });

        txt_PasswordUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_PasswordUserActionPerformed(evt);
            }
        });

        txt_NamePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NamePersonActionPerformed(evt);
            }
        });

        tbl_tableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "CC", "Rol", "Usuario", "Contraseña"
            }
        ));
        jScrollPane1.setViewportView(tbl_tableUsers);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txt_PasswordUser, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_UserPerson, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_RoleUser, 0, 274, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_NamePerson, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_LastNamePerson, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_idPerson, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txt_NamePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(txt_LastNamePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_idPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(23, 23, 23))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txt_UserPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_PasswordUser, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(cb_RoleUser, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(58, 58, 58))
        );

        jPanel3.setBackground(new java.awt.Color(51, 0, 255));

        jLabel2.setFont(new java.awt.Font("Cantarell", 2, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Gestion de personal");

        jLabel1.setFont(new java.awt.Font("Cantarell", 2, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.lightGray);
        jLabel1.setText("GeneralAdmin");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(156, 156, 156)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 655, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(51, 51, 51))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(51, 0, 255));

        btn_UpdateUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_UpdateUser.setText("Editar");
        btn_UpdateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateUserActionPerformed(evt);
            }
        });

        btn_CreateUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_CreateUser.setText("Guardar");
        btn_CreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_CreateUserActionPerformed(evt);
            }
        });

        btn_DeleteUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_DeleteUser.setText("Eliminar");
        btn_DeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteUserActionPerformed(evt);
            }
        });

        btn_ReadUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btn_ReadUser.setText("Buscar");
        btn_ReadUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ReadUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(btn_CreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196)
                .addComponent(btn_ReadUser, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184)
                .addComponent(btn_UpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(btn_DeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_UpdateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ReadUser, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_CreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_DeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cb_RoleUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_RoleUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_RoleUserActionPerformed

    private void txt_idPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idPersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_idPersonActionPerformed

    private void txt_PasswordUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_PasswordUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_PasswordUserActionPerformed

    private void txt_NamePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NamePersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NamePersonActionPerformed

    private void txt_LastNamePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_LastNamePersonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_LastNamePersonActionPerformed

    private void btn_CreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_CreateUserActionPerformed
        /////////////////////////////////////////////////////////////////////////////////////---------------->CreateUsers
        createAccess();///////Este metodo se utiliza para darle identidad a la variables de entrada
        boolean answer = controllerUsers.createUsers(user);
        if (answer) {

            JOptionPane.showMessageDialog(null, "El Usuario: " + nameUser + " se registró correctamente como " + role);

            modelTableUsers = (DefaultTableModel) tbl_tableUsers.getModel();
            Object[] ob = new Object[6];
            ob[0] = user.getNamePerson();
            ob[1] = user.getLastNamePerson();
            ob[2] = user.getIdPerson();
            ob[3] = user.getRole();
            ob[4] = user.getNameUser();
            ob[5] = user.getPassword();
            modelTableUsers.addRow(ob);
            tbl_tableUsers.setModel(modelTableUsers);

            addRowTableUsers();
            cleanSpaces();

        } else {

            JOptionPane.showMessageDialog(null, "Este usuario ya se encuentra registrado");
        }


    }//GEN-LAST:event_btn_CreateUserActionPerformed

    private void btn_ReadUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ReadUserActionPerformed
        /*String namePerson = txt_NamePerson.getText();
        String lastNamePerson = txt_LastNamePerson.getText();
        int idPerson = Integer.parseInt(txt_idPerson.getText());
        String role = cb_RoleUser.getSelectedItem().toString();
        String password = txt_PasswordUser.getText();
        String user = txt_UserPerson.getText();*/

        GeneralAdmin_CRUD_ReadBoxUsers formGeneralAdmin_ReadBoxUsers = new GeneralAdmin_CRUD_ReadBoxUsers();
        formGeneralAdmin_ReadBoxUsers.setVisible(true);

        /*formGeneralAdmin_ReadBoxUsers.getTxt_ReadUser().setText(Integer.toString(idPerson));
        Person person = controllerUsers.readUsers(idPerson);
        if (person != null) {

            txt_NamePerson.setText(person.getNamePerson());
            txt_LastNamePerson.setText(person.getLastNamePerson());
            txt_PasswordUser.setText(person.getPassword());
            txt_UserPerson.setText(person.getUser());

        }else {

            JOptionPane.showMessageDialog(null, "El usuario: "+idPerson+" no se encuentra registrado :c");

        }*/

    }//GEN-LAST:event_btn_ReadUserActionPerformed

    private void btn_UpdateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateUserActionPerformed

        boolean answer = controllerUsers.updateUsers(user);
        if (answer) {

            JOptionPane.showMessageDialog(null, "Se modificó correctamente c:");

        } else {

            JOptionPane.showMessageDialog(null, "No se modificó >:c");
        }


    }//GEN-LAST:event_btn_UpdateUserActionPerformed

    private void btn_DeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteUserActionPerformed

        boolean answer = controllerUsers.deleteUsers(user);
        if (answer) {

            JOptionPane.showMessageDialog(null, "Se elimino correctamente");
            cleanSpaces();

        } else {

            JOptionPane.showMessageDialog(null, "No se eliminó >:o");

        }
    }//GEN-LAST:event_btn_DeleteUserActionPerformed
    public void cleanSpaces() {///////////////////CleanTxt
        txt_NamePerson.setText(null);
        txt_LastNamePerson.setText(null);
        txt_idPerson.setText(null);
        txt_PasswordUser.setText(null);
        txt_UserPerson.setText(null);

    }
    ////////////////////////////////////////////////////////////////////////TABLE

    public void addRowTableUsers() {//////////////////addRows_Jtable

    }

    public void cleanTable() {///////////////////////CleanRows_Jtable
        for (int i = 0; i < modelTableUsers.getRowCount(); i++) {
            modelTableUsers.removeRow(i);
            i = i - 1;
        }

    }

    /////////////////////////////////////////////////////////////////////////////////////////
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GeneralAdmin_CRUD_Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GeneralAdmin_CRUD_Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GeneralAdmin_CRUD_Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GeneralAdmin_CRUD_Users.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GeneralAdmin_CRUD_Users().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_CreateUser;
    private javax.swing.JButton btn_DeleteUser;
    private javax.swing.JButton btn_ReadUser;
    private javax.swing.JButton btn_UpdateUser;
    private javax.swing.JComboBox<String> cb_RoleUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_tableUsers;
    private javax.swing.JTextField txt_LastNamePerson;
    private javax.swing.JTextField txt_NamePerson;
    private javax.swing.JTextField txt_PasswordUser;
    private javax.swing.JTextField txt_UserPerson;
    private javax.swing.JTextField txt_idPerson;
    // End of variables declaration//GEN-END:variables

    public JTextField getTxt_LastNamePerson() {
        return txt_LastNamePerson;
    }

    public void setTxt_LastNamePerson(JTextField txt_LastNamePerson) {
        this.txt_LastNamePerson = txt_LastNamePerson;
    }

    public JTextField getTxt_NamePerson() {
        return txt_NamePerson;
    }

    public void setTxt_NamePerson(JTextField txt_NamePerson) {
        this.txt_NamePerson = txt_NamePerson;
    }

    public JTextField getTxt_PasswordUser() {
        return txt_PasswordUser;
    }

    public void setTxt_PasswordUser(JTextField txt_PasswordUser) {
        this.txt_PasswordUser = txt_PasswordUser;
    }

    public JTextField getTxt_UserPerson() {
        return txt_UserPerson;
    }

    public void setTxt_UserPerson(JTextField txt_UserPerson) {
        this.txt_UserPerson = txt_UserPerson;
    }

    public JTextField getTxt_idPerson() {
        return txt_idPerson;
    }

    public void setTxt_idPerson(JTextField txt_idPerson) {
        this.txt_idPerson = txt_idPerson;
    }

}