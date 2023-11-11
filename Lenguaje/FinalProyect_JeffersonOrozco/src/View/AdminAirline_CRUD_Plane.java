/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View;

import Controllers.ControllerPlanes;
import Model.Plane;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class AdminAirline_CRUD_Plane extends javax.swing.JPanel {

    private int idPlane;
    private String namePlane;
    private String statusPlane;
    private int quantitySeat;

    private boolean answer;

    private ControllerPlanes controllerPlanes;

    private Plane plane;

    /**
     * Creates new form AdminAirline_CRUD_Plane
     */
    public AdminAirline_CRUD_Plane() {
        controllerPlanes = new ControllerPlanes();
        initComponents();
    }

    private void createAccess() {

        idPlane = Integer.parseInt(txt_idPlane.getText());
        namePlane = txt_namePlane.getText();
        statusPlane = txt_StatusPlane.getText();
        quantitySeat = Integer.parseInt(txt_quantitySeats.getText());

        plane = new Plane(idPlane, namePlane, statusPlane, quantitySeat);

    }

    private void setAccess(int idPlane, String namePlane, String statusPlane, int quantitySeat) {
        txt_idPlane.setText(Integer.toString(idPlane));
        txt_namePlane.setText(namePlane);
        txt_StatusPlane.setText(statusPlane);
        txt_quantitySeats.setText(Integer.toString(quantitySeat));

    }

    public void cleanSpaces() {///////////////////CleanTxt
        txt_StatusPlane.setText(null);
        txt_idPlane.setText(null);
        txt_namePlane.setText(null);
        txt_quantitySeats.setText(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txt_namePlane = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_StatusPlane = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_idPlane = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        btn_createPlane = new javax.swing.JButton();
        btn_UpdatePlane = new javax.swing.JButton();
        btn_readPlane = new javax.swing.JButton();
        btn_deletePlane = new javax.swing.JButton();
        txt_quantitySeats = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("nombre avion");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Estado");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Codigo");

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        btn_createPlane.setText("Guardar");
        btn_createPlane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_createPlaneActionPerformed(evt);
            }
        });

        btn_UpdatePlane.setText("Editar");
        btn_UpdatePlane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdatePlaneActionPerformed(evt);
            }
        });

        btn_readPlane.setText("Buscar");
        btn_readPlane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_readPlaneActionPerformed(evt);
            }
        });

        btn_deletePlane.setText("Eliminar");
        btn_deletePlane.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deletePlaneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(btn_createPlane, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(btn_UpdatePlane, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(btn_readPlane, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75)
                .addComponent(btn_deletePlane, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_createPlane, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_UpdatePlane, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_readPlane, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_deletePlane, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Numero asientos");

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
                                .addComponent(txt_StatusPlane, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(35, 35, 35)
                                .addComponent(txt_namePlane, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_idPlane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_quantitySeats, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_namePlane, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_StatusPlane, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_idPlane, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_quantitySeats, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_createPlaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_createPlaneActionPerformed
        createAccess();
        System.out.println("Antes de llamar controlador");
        answer = controllerPlanes.createPlane(plane);
        System.out.println("Antes de llamar controlador2");
        
        if (answer) {

            JOptionPane.showMessageDialog(null, "El avion: " + namePlane + " se registró correctamente ");

            cleanSpaces();

        } else {

            JOptionPane.showMessageDialog(null, "Este empleado ya se encuentra registrado");
        }
    }//GEN-LAST:event_btn_createPlaneActionPerformed

    private void btn_UpdatePlaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdatePlaneActionPerformed
        createAccess();
        answer = controllerPlanes.updatePlanes(plane);
        if (answer) {

            JOptionPane.showMessageDialog(null, "Se modificó correctamente c:");

        } else {

            JOptionPane.showMessageDialog(null, "No se modificó >:c");
        }

    }//GEN-LAST:event_btn_UpdatePlaneActionPerformed

    private void btn_readPlaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_readPlaneActionPerformed
        
        plane = controllerPlanes.readPlane(idPlane);
        if (plane != null) {

            setAccess(plane.getIdPlane(), plane.getNamePlane(), plane.getStatusPlane(), plane.getQuantitySeat());

        } else {

            JOptionPane.showMessageDialog(null, "No se encontró");
        }
    }//GEN-LAST:event_btn_readPlaneActionPerformed

    private void btn_deletePlaneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deletePlaneActionPerformed
        createAccess();
        answer = controllerPlanes.deletePlanes(plane);
        if (answer) {

            JOptionPane.showMessageDialog(null, "Se elimino correctamente");
            cleanSpaces();

        } else {

            JOptionPane.showMessageDialog(null, "No se eliminó >:o");

        }
    }//GEN-LAST:event_btn_deletePlaneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_UpdatePlane;
    private javax.swing.JButton btn_createPlane;
    private javax.swing.JButton btn_deletePlane;
    private javax.swing.JButton btn_readPlane;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txt_StatusPlane;
    private javax.swing.JTextField txt_idPlane;
    private javax.swing.JTextField txt_namePlane;
    private javax.swing.JTextField txt_quantitySeats;
    // End of variables declaration//GEN-END:variables
}
