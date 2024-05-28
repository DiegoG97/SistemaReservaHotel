/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Presentacion;

import Datos.vhabitacion;
import Logica.fhabitacion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Hola
 */
public class frmhabitacion extends javax.swing.JFrame {

    /**
     * Creates new form frmhabitacion
     */
    public frmhabitacion() {
        initComponents();
    }
    
    private String accion="guardar";
    
    void ocultar_columnas () {
        tabla_listado.getColumnModel() .getColumn(0) .setMaxWidth(0);
        tabla_listado.getColumnModel() .getColumn(0) .setMinWidth(0);
        tabla_listado.getColumnModel() .getColumn(0) .setPreferredWidth(0);
        
        
    }
    
    void inhabilitar () {
        txtidhabiacion1.setVisible(false);
        cbozona.setEnabled(false);
        txtnumero.setEnabled(false);
        txtdescripcion.setEnabled(false);
        txtpreciodiario.setEnabled(false);
        cboestado.setEnabled(false);
        cbotipohabitacion.setEnabled(false);
        cboservicio.setEnabled(false);
        
        btnguardar.setEnabled(false);
        btncancelar.setEnabled(false);
        btneliminar.setEnabled(false);
        txtidhabiacion1.setText("");
        txtpreciodiario.setText("");
        txtdescripcion.setText("");
        
        
        
    }
    
     void habilitar () {
        txtidhabiacion1.setVisible(false);
        
        cbozona.setEnabled(true);
        txtnumero.setEnabled(true);
        txtdescripcion.setEnabled(true);
        txtpreciodiario.setEnabled(true);
        cboestado.setEnabled(true);
        cbotipohabitacion.setEnabled(true);
        cboservicio.setEnabled(true);
        
        btnguardar.setEnabled(true);
        btncancelar.setEnabled(true);
        btneliminar.setEnabled(true);
        txtidhabiacion1.setText("");
        txtpreciodiario.setText("");
        txtdescripcion.setText("");
        
        
        
    }
    
     void mostrar (String buscar){
         try {
             DefaultTableModel modelo;
             fhabitacion func= new fhabitacion ();
             modelo=func.mostrar(buscar);
             
             tabla_listado.setModel(modelo);
             ocultar_columnas();
             lbltotalregistros.setText("Total Registros: " + Integer.toString(func.totalregistros));
             
             
             
             
         } catch (Exception e) {
             JOptionPane.showConfirmDialog(rootPane, e);
            
         }
     
     }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtnumero = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtidhabiacion1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cbozona = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtdescripcion = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtpreciodiario = new javax.swing.JTextField();
        cboestado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbotipohabitacion = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cboservicio = new javax.swing.JComboBox<>();
        btnnuevo = new javax.swing.JButton();
        btnguardar = new javax.swing.JButton();
        btncancelar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_listado = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtbuscar = new javax.swing.JTextField();
        btnbuscar = new javax.swing.JButton();
        btneliminar = new javax.swing.JButton();
        btnsalir = new javax.swing.JButton();
        lbltotalregistros = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Habitacion");

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro de Habitaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        jLabel2.setText("Número:");

        jLabel3.setText("Zona:");

        cbozona.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Zona A", "Zona B" }));
        cbozona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbozonaActionPerformed(evt);
            }
        });

        jLabel4.setText("Descripción:");

        txtdescripcion.setColumns(20);
        txtdescripcion.setRows(5);
        jScrollPane1.setViewportView(txtdescripcion);

        jLabel5.setText("Precio diario:");

        cboestado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Disponible", "Ocupada", "Reservada", "Sucia", "En limpieza" }));
        cboestado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboestadoActionPerformed(evt);
            }
        });

        jLabel6.setText("Estado:");

        jLabel7.setText("Tipo:");

        cbotipohabitacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1 Sencilla", "2 Sencillas", "3 Sencillas", "1 Doble", "1 Doble + 1 Sencilla", "1 Doble + 2 Sencillas ", "Especial" }));
        cbotipohabitacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbotipohabitacionActionPerformed(evt);
            }
        });

        jLabel8.setText("Servicio:");

        cboservicio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ventilador", "Aire Acondicionado" }));
        cboservicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboservicioActionPerformed(evt);
            }
        });

        btnnuevo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/nuevo.png"))); // NOI18N
        btnnuevo.setText("Nuevo");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        btnguardar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/guardar.png"))); // NOI18N
        btnguardar.setText("Guardar");
        btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnguardarActionPerformed(evt);
            }
        });

        btncancelar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/cancelar.png"))); // NOI18N
        btncancelar.setText("Cancelar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cboservicio, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtpreciodiario)
                                        .addComponent(cboestado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(cbotipohabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtnumero)
                                    .addComponent(cbozona, 0, 177, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(txtidhabiacion1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(16, 16, 16)
                                .addComponent(jScrollPane1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnnuevo)
                                .addGap(52, 52, 52)
                                .addComponent(btnguardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                                .addComponent(btncancelar)))
                        .addGap(121, 121, 121))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtidhabiacion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(cbozona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtpreciodiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboestado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cbotipohabitacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(cboservicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnuevo)
                    .addComponent(btnguardar)
                    .addComponent(btncancelar))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 204, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de Habitaciones", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 1, 14))); // NOI18N

        tabla_listado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tabla_listado);

        jLabel9.setText("Buscar:");

        btnbuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/buscar.png"))); // NOI18N
        btnbuscar.setText("Buscar");

        btneliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/eliminar.png"))); // NOI18N
        btneliminar.setText("Eliminar");

        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/salir.png"))); // NOI18N
        btnsalir.setText("Salir");

        lbltotalregistros.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbltotalregistros.setText("Registros:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(btnbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btneliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnsalir, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jScrollPane2)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltotalregistros)
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnbuscar)
                    .addComponent(btneliminar)
                    .addComponent(btnsalir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbltotalregistros)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbozonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbozonaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbozonaActionPerformed

    private void cboestadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboestadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboestadoActionPerformed

    private void cbotipohabitacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbotipohabitacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbotipohabitacionActionPerformed

    private void cboservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboservicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboservicioActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        // TODO add your handling code here:
        habilitar();
        btnguardar.setText("Guardar");
        accion="guardar";
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void btnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnguardarActionPerformed
        // TODO add your handling code here:
        if (txtnumero.getText().length() ==0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un numero de Habitación");
            txtnumero.requestFocus();
            
        }
        
         if (txtdescripcion.getText().length() ==0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar ua descripción");
            txtdescripcion.requestFocus();
            
        }
         
          if (txtpreciodiario.getText().length() ==0) {
            JOptionPane.showConfirmDialog(rootPane, "Debes ingresar un Precio Diario");
            txtpreciodiario.requestFocus();
            
        }
          
        vhabitacion dts =new vhabitacion();
        fhabitacion func =new fhabitacion();
        
        dts.setNumero(txtnumero.getText());
        int seleccionado=cbozona.getSelectedIndex();
        dts.setZona (cbozona.getItemAt(seleccionado));
        
        dts.setDescripcion(txtdescripcion.getText());
      
    }//GEN-LAST:event_btnguardarActionPerformed

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
            java.util.logging.Logger.getLogger(frmhabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmhabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmhabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmhabitacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmhabitacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbuscar;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btneliminar;
    private javax.swing.JButton btnguardar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnsalir;
    private javax.swing.JComboBox<String> cboestado;
    private javax.swing.JComboBox<String> cboservicio;
    private javax.swing.JComboBox<String> cbotipohabitacion;
    private javax.swing.JComboBox<String> cbozona;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JTable tabla_listado;
    private javax.swing.JTextField txtbuscar;
    private javax.swing.JTextArea txtdescripcion;
    private javax.swing.JTextField txtidhabiacion1;
    private javax.swing.JTextField txtnumero;
    private javax.swing.JTextField txtpreciodiario;
    // End of variables declaration//GEN-END:variables
}
