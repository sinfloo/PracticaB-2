package com.ujcm.practicab.vistas;

import com.ujcm.practicab.modelo.Detalle;
import com.ujcm.practicab.modelo.Hijo;
import com.ujcm.practicab.modelo.Padre;
import com.ujcm.practicab.modeloDAO.CrudDAO;
import com.ujcm.practicab.utils.Utils;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class Principal extends javax.swing.JFrame {

    DefaultTableModel model;

    public Principal() {
        initComponents();
        setLocationRelativeTo(null);
        btnAgregar.setEnabled(false);
        listar("");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDocumentoPadre = new javax.swing.JTextField();
        btnBuscarPadre = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombresP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellidosP = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtDocumentoHijo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnBuscarHijo = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txtNombresH = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellidosH = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        btnBuscarTodo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MODULO DE REGISTRO");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DEL PADRE"));

        jLabel1.setText("Ingrese Documento:");
        jLabel1.setToolTipText("");

        btnBuscarPadre.setText("Buscar");
        btnBuscarPadre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPadreActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese Nombres:");
        jLabel2.setToolTipText("");

        jLabel3.setText("Ingrese Apellidos:");
        jLabel3.setToolTipText("");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDocumentoPadre)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNombresP)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtApellidosP)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDocumentoPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarPadre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombresP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidosP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("DATOS DEL HIJO"));

        jLabel4.setText("Ingrese Documento:");
        jLabel4.setToolTipText("");

        btnBuscarHijo.setText("Buscar");
        btnBuscarHijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarHijoActionPerformed(evt);
            }
        });

        jLabel5.setText("Ingrese Nombres:");
        jLabel5.setToolTipText("");

        jLabel6.setText("Ingrese Apellidos:");
        jLabel6.setToolTipText("");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDocumentoHijo)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarHijo, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtNombresH)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtApellidosH)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDocumentoHijo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarHijo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombresH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellidosH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI PADRE", "PADRE", "HIJO", "DNI HIJO"
            }
        ));
        jScrollPane1.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMinWidth(50);
            table.getColumnModel().getColumn(0).setPreferredWidth(50);
            table.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnBuscarTodo.setText("Buscar");
        btnBuscarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTodoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarTodo))
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        addRegistro();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBuscarPadreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPadreActionPerformed
        buscarPadre();
    }//GEN-LAST:event_btnBuscarPadreActionPerformed

    private void btnBuscarHijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarHijoActionPerformed
        buscarHijo();
    }//GEN-LAST:event_btnBuscarHijoActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        limpiarcajasHijo();
        limpiarcajasPadre();
        txtDocumentoPadre.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBuscarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTodoActionPerformed
        limpiarTabla();
        listar(txtBuscar.getText());
    }//GEN-LAST:event_btnBuscarTodoActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    private void listar(String doc) {
        CrudDAO cdao = new CrudDAO();
        List<Object[]> lista = cdao.getData(doc);
        model = (DefaultTableModel) table.getModel();
        lista.forEach(objects -> {
            model.addRow(objects);
        });
        table.setModel(model);

    }

    private void limpiarTabla() {
        for (int i = 0; i < table.getRowCount(); i++) {
            model.removeRow(i);
            i--;
        }
    }

    private void buscarPadre() {
        CrudDAO cdao = new CrudDAO();
        if (txtDocumentoPadre.getText().equals("") || !Utils.isNumeric(txtDocumentoPadre.getText()) || !Utils.permitLength(txtDocumentoPadre.getText())) {
            Utils.addMessage("Debe Ingresar Documento Valido");
            limpiarcajasPadre();
        } else {
            Padre padre = cdao.validarPadre(txtDocumentoPadre.getText());
            if (padre != null && padre.getDni() != null) {
                Utils.addMessage("Padre ya esta registrado en la base de datos");
                txtDocumentoPadre.setText(padre.getDni());
                txtNombresP.setText(padre.getNombres());
                txtApellidosP.setText(padre.getApellidos());
            } else {
                Utils.addMessage("Padre no existe en la Base Debe Registar");
                txtNombresP.requestFocus();
                btnAgregar.setEnabled(true);
            }

        }
    }

    private void buscarHijo() {
        CrudDAO cdao = new CrudDAO();
        if (txtDocumentoHijo.getText().equals("") || !Utils.isNumeric(txtDocumentoHijo.getText()) || !Utils.permitLength(txtDocumentoHijo.getText())) {
            Utils.addMessage("Debe Ingresar Documento Valido");
            limpiarcajasHijo();
        } else {
            Hijo hijo = cdao.validarHijo(txtDocumentoHijo.getText());
            if (hijo != null && hijo.getDni() != null) {
                txtDocumentoHijo.setText(hijo.getDni());
                txtNombresH.setText(hijo.getNombres());
                txtApellidosH.setText(hijo.getApellidos());
                btnAgregar.setEnabled(true);
            } else {
                Utils.addMessage("Hijo no existe en la Base Debe Registar");
                txtNombresH.requestFocus();
                btnAgregar.setEnabled(true);
            }

        }
    }

    private void addRegistro() {
        CrudDAO cdao = new CrudDAO();
        if (txtDocumentoPadre.getText().equals("") || !Utils.isNumeric(txtDocumentoPadre.getText()) || !Utils.permitLength(txtDocumentoPadre.getText())) {
            Utils.addMessage("Debe Ingresar Documento Valido del Padre");
            limpiarcajasPadre();
        } else if (!Utils.isNumeric(txtDocumentoHijo.getText().equals("") ? "123" : txtDocumentoHijo.getText()) || !Utils.permitLength(txtDocumentoHijo.getText().equals("") ? "12345678" : txtDocumentoHijo.getText())) {
            Utils.addMessage("Debe Ingresar Documento Valido del Hijo");
            limpiarcajasHijo();
        } else {
            String docPadre = txtDocumentoPadre.getText();
            String nomPadre = txtNombresP.getText();
            String apePadre = txtApellidosP.getText();
            String docHijo = txtDocumentoHijo.getText();
            String nomHijo = txtNombresH.getText();
            String apeHijo = txtApellidosH.getText();
            Padre padre = new Padre(docPadre, nomPadre, apePadre);
            Hijo hijo = new Hijo(docHijo, nomHijo, apeHijo);
            Detalle detalle = new Detalle(padre, hijo);
            int res = cdao.addRegristo(detalle);
            if (res != 0) {
                Utils.addMessage("Se Registró con éxito");
                limpiarcajasHijo();
                Utils.addMessage("Puede seguir agregando mas hijos");
                txtDocumentoHijo.requestFocus();
                limpiarTabla();
                listar("");
                btnAgregar.setEnabled(false);
            } else {
                Utils.addMessage("Error al Registrar en la base de datos");
            }

        }

    }

    void limpiarcajasPadre() {
        txtDocumentoPadre.setText("");
        txtNombresP.setText("");
        txtApellidosP.setText("");
    }

    void limpiarcajasHijo() {
        txtDocumentoHijo.setText("");
        txtNombresH.setText("");
        txtApellidosH.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarHijo;
    private javax.swing.JButton btnBuscarPadre;
    private javax.swing.JButton btnBuscarTodo;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtApellidosH;
    private javax.swing.JTextField txtApellidosP;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtDocumentoHijo;
    private javax.swing.JTextField txtDocumentoPadre;
    private javax.swing.JTextField txtNombresH;
    private javax.swing.JTextField txtNombresP;
    // End of variables declaration//GEN-END:variables
}
