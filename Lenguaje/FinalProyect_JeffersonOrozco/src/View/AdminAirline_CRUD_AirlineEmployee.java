/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controllers.ControllerAirlineEmployee;
import Model.AirlineEmployee;
import java.nio.charset.Charset;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class AdminAirline_CRUD_AirlineEmployee extends javax.swing.JPanel {

    private String namePerson;
    private String lastNamePerson;
    private int idPerson;
    private String positionPerson;

    private boolean answer;

    AirlineEmployee airlineEmployee;
    private ControllerAirlineEmployee controllerAirlineEmployee;

    /**
     * Creates new form AdminAirline_CRUD_AirlineEmployee
     */
    public AdminAirline_CRUD_AirlineEmployee() {

        controllerAirlineEmployee = new ControllerAirlineEmployee();
        initComponents();

    }

    private void createAccess() {
        namePerson = txt_namePerson.getText();
        lastNamePerson = txt_LastNamePerson.getText();
        idPerson = Integer.parseInt(txt_idPerson.getText());
        positionPerson = cb_positionPerson.getSelectedItem().toString();
        
        

        airlineEmployee = new AirlineEmployee(positionPerson, idPerson, namePerson, lastNamePerson);

    }

    private void setAccess(String namePerson, String lastNamePerson, int idPerson) {

        txt_namePerson.setText(namePerson);
        txt_LastNamePerson.setText(lastNamePerson);
        txt_idPerson.setText(Integer.toString(idPerson));
        

    }

    public void cleanSpaces() {///////////////////CleanTxt
        txt_namePerson.setText(null);
        txt_LastNamePerson.setText(null);
        txt_idPerson.setText(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txt_namePerson = new javax.swing.JTextField();
        txt_LastNamePerson = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txt_idPerson = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn_createAirlineEmployee = new javax.swing.JButton();
        btn_updateAirlineEmployeee = new javax.swing.JButton();
        btn_readAirlineEmployee = new javax.swing.JButton();
        btn_deleteAirlineEmployee = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        cb_positionPerson = new javax.swing.JComboBox<>();

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setForeground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Vista principal");

        jButton1.setText("Menu");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addContainerGap(561, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Apelllido");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("CC");

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        btn_createAirlineEmployee.setText("Guardar");
        btn_createAirlineEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createAirlineEmployeeActionPerformed(evt);
            }
        });

        btn_updateAirlineEmployeee.setText("Editar");
        btn_updateAirlineEmployeee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateAirlineEmployeeeActionPerformed(evt);
            }
        });

        btn_readAirlineEmployee.setText("Buscar");
        btn_readAirlineEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_readAirlineEmployeeActionPerformed(evt);
            }
        });

        btn_deleteAirlineEmployee.setText("Eliminar");
        btn_deleteAirlineEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteAirlineEmployeeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btn_createAirlineEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(btn_updateAirlineEmployeee, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(btn_readAirlineEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(btn_deleteAirlineEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_createAirlineEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_updateAirlineEmployeee, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_readAirlineEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deleteAirlineEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("cargo");

        cb_positionPerson.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador aerolinea", "Capitan", "Empleado logistica" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(35, 35, 35)
                                .addComponent(txt_LastNamePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(35, 35, 35)
                                .addComponent(txt_namePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(35, 35, 35)
                                .addComponent(txt_idPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(62, 62, 62)
                        .addComponent(jLabel5)
                        .addGap(30, 30, 30)
                        .addComponent(cb_positionPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_namePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(cb_positionPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_LastNamePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_idPerson, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 128, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_updateAirlineEmployeeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateAirlineEmployeeeActionPerformed
        createAccess();
        answer = controllerAirlineEmployee.updateUsers(airlineEmployee);
        if (answer) {

            JOptionPane.showMessageDialog(null, "Se modificó correctamente c:");

        } else {

            JOptionPane.showMessageDialog(null, "No se modificó >:c");
        }


    }//GEN-LAST:event_btn_updateAirlineEmployeeeActionPerformed

    private void btn_createAirlineEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createAirlineEmployeeActionPerformed
        createAccess();
        answer = controllerAirlineEmployee.createUsers(airlineEmployee);
        if (answer) {

            JOptionPane.showMessageDialog(null, "El empleado: " + namePerson + " se registró correctamente ");

            cleanSpaces();

        } else {

            JOptionPane.showMessageDialog(null, "Este empleado ya se encuentra registrado");
        }

    }//GEN-LAST:event_btn_createAirlineEmployeeActionPerformed

    private void btn_deleteAirlineEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteAirlineEmployeeActionPerformed
        createAccess();
        answer = controllerAirlineEmployee.deleteUsers(airlineEmployee);
        if (answer) {

            JOptionPane.showMessageDialog(null, "Se elimino correctamente");
            cleanSpaces();

        } else {

            JOptionPane.showMessageDialog(null, "No se eliminó >:o");

        }
    }//GEN-LAST:event_btn_deleteAirlineEmployeeActionPerformed

    private void btn_readAirlineEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_readAirlineEmployeeActionPerformed
        
        airlineEmployee = controllerAirlineEmployee.readUsers(idPerson);
        if (airlineEmployee != null) {

            setAccess(airlineEmployee.getNamePerson(), airlineEmployee.getLastNamePerson(), airlineEmployee.getIdPerson());

        } else {

            JOptionPane.showMessageDialog(null, "No se encontró");
        }

    }//GEN-LAST:event_btn_readAirlineEmployeeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_createAirlineEmployee;
    private javax.swing.JButton btn_deleteAirlineEmployee;
    private javax.swing.JButton btn_readAirlineEmployee;
    private javax.swing.JButton btn_updateAirlineEmployeee;
    private javax.swing.JComboBox<String> cb_positionPerson;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txt_LastNamePerson;
    private javax.swing.JTextField txt_idPerson;
    private javax.swing.JTextField txt_namePerson;
    // End of variables declaration//GEN-END:variables
}
