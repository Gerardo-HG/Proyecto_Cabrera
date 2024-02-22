/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Customizer.java to edit this template
 */
package Ejecutable;

import Clases.Deuda;
import Clases.Empresa;
import java.util.ArrayList;

/**
 *
 * @author user
 */
public class VRegistroDeudas extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;
    private Deuda deudaMostrada;
    /**
     * Creates new customizer VRegistroDeudas
     */
    public VRegistroDeudas() {
         initComponents();
         this.deudaMostrada = null; // Inicializar la variable deudaMostrada
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        monto_deud = new javax.swing.JTextField();
        id_deud = new javax.swing.JTextField();
        empresa_deud = new javax.swing.JTextField();
        registrar_deud = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fecha_deud = new javax.swing.JTextField();
        descripcion_deud2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Muestreo_deuda = new javax.swing.JTextPane();
        jLabel6 = new javax.swing.JLabel();
        Mostrar_deuda = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setBackground(new java.awt.Color(60, 60, 60));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 500));

        jLabel1.setFont(new java.awt.Font("Elephant", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registro de Deudas ");

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setPreferredSize(new java.awt.Dimension(300, 300));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Descripcion");

        jLabel3.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Monto");

        jLabel4.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID");

        jLabel5.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Empresa");

        monto_deud.setBackground(new java.awt.Color(102, 102, 102));
        monto_deud.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        monto_deud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monto_deudActionPerformed(evt);
            }
        });

        id_deud.setBackground(new java.awt.Color(102, 102, 102));
        id_deud.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        id_deud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_deudActionPerformed(evt);
            }
        });

        empresa_deud.setBackground(new java.awt.Color(102, 102, 102));
        empresa_deud.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        empresa_deud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empresa_deudActionPerformed(evt);
            }
        });

        registrar_deud.setBackground(new java.awt.Color(90, 90, 90));
        registrar_deud.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        registrar_deud.setForeground(new java.awt.Color(255, 255, 255));
        registrar_deud.setText("Registrar");
        registrar_deud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_deudActionPerformed(evt);
            }
        });

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Registro de datos");

        jLabel8.setFont(new java.awt.Font("Ebrima", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Fecha");

        fecha_deud.setBackground(new java.awt.Color(102, 102, 102));
        fecha_deud.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        fecha_deud.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_deudActionPerformed(evt);
            }
        });

        descripcion_deud2.setBackground(new java.awt.Color(102, 102, 102));
        descripcion_deud2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        descripcion_deud2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcion_deud2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4))
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(monto_deud, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                                        .addComponent(id_deud))
                                    .addComponent(fecha_deud, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(descripcion_deud2)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(empresa_deud, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addComponent(registrar_deud, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(66, 66, 66))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel7)
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(id_deud, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(monto_deud, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(descripcion_deud2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(empresa_deud, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fecha_deud, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(registrar_deud)
                .addGap(22, 22, 22))
        );

        Muestreo_deuda.setBackground(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(Muestreo_deuda);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Ebrima", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Mensaje del sistema:");

        Mostrar_deuda.setText("Mostrar Deudas Registradas");
        Mostrar_deuda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mostrar_deudaActionPerformed(evt);
            }
        });

        jButton3.setText("Retornar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Mostrar_deuda, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(198, 198, 198))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Mostrar_deuda)
                .addGap(18, 18, 18)
                .addComponent(jButton3)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void monto_deudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monto_deudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monto_deudActionPerformed

    private void id_deudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_deudActionPerformed
        
    }//GEN-LAST:event_id_deudActionPerformed

    private void empresa_deudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empresa_deudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empresa_deudActionPerformed

    private void Mostrar_deudaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mostrar_deudaActionPerformed
         // Mostrar la información de la deuda almacenada en deudaMostrada
    if (deudaMostrada != null) {
        Muestreo_deuda.setText(deudaMostrada.toString());
    } else {
        Muestreo_deuda.setText("No se ha registrado ninguna deuda.");
    }
    }//GEN-LAST:event_Mostrar_deudaActionPerformed

    private void registrar_deudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_deudActionPerformed
         // Crear una lista vacía de deudas
   // Crear una lista vacía de deudas
    ArrayList<Deuda> listaDeudas = new ArrayList<>();

    // Obtener la información de los campos de texto
    int idDeuda = Integer.parseInt(id_deud.getText());
    double monto = Double.parseDouble(monto_deud.getText());
    String descripcion = descripcion_deud2.getText();
    // Suponiendo que empresa_deud es un JComboBox o un JTextField
    // dependiendo de cómo obtengas la información de la empresa
    String descripcionRubro = "Descripción del Rubro"; // Aquí puedes obtener la descripción del rubro
    Empresa empresa = new Empresa(1, "Nombre de la Empresa", descripcionRubro); // Cambia estos valores por los adecuados
    
    // Crear una nueva instancia de Deuda
    Deuda nuevaDeuda = new Deuda(idDeuda, monto, descripcion, empresa);
    
    // Asignar la nueva deuda a la variable deudaMostrada
    this.deudaMostrada = nuevaDeuda;
   
    }//GEN-LAST:event_registrar_deudActionPerformed

    private void fecha_deudActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_deudActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fecha_deudActionPerformed

    private void descripcion_deud2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcion_deud2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcion_deud2ActionPerformed


    public static void main(String[] args) {
        
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Mostrar_deuda;
    private javax.swing.JTextPane Muestreo_deuda;
    private javax.swing.JTextField descripcion_deud2;
    private javax.swing.JTextField empresa_deud;
    private javax.swing.JTextField fecha_deud;
    private javax.swing.JTextField id_deud;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField monto_deud;
    private javax.swing.JButton registrar_deud;
    // End of variables declaration//GEN-END:variables
}