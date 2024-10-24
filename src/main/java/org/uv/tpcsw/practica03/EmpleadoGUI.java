
package org.uv.tpcsw.practica03;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author samantha
 */
public class EmpleadoGUI extends javax.swing.JInternalFrame {


    public EmpleadoGUI() {
        initComponents();
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TabBuscarID = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        Departamento = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jNombreEmpEl = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnEliminarDep = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        BtnBuscarTodosEmpleados = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        Buscar = new javax.swing.JButton();
        EmpIDBuscar = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmpleadosporID = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        EmpModTelefono = new javax.swing.JTextField();
        EmpModDireccion = new javax.swing.JTextField();
        EmpModNombre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnGuardarModEmp = new javax.swing.JButton();
        Departamento1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        Clave = new javax.swing.JLabel();
        EmpMod = new javax.swing.JTextField();

        setClosable(true);

        TabBuscarID.setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel1.setText("Guardar");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre");

        jLabel5.setText("Direccion");

        jLabel6.setText("Telefono");

        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        Departamento.setText("Departamento");

        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Departamento> listaDepartamentos = session.createQuery("from Departamento", Departamento.class).list();

        // Loop through the list and add the department names to the JComboBox
        for (Departamento departamento : listaDepartamentos) {
            jComboBox1.addItem(departamento.getNombre());
        }
        session.getTransaction().commit();
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(Departamento))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefono))
                        .addGap(49, 49, 49)
                        .addComponent(btnGuardar)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar)
                    .addComponent(jLabel5))
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Departamento)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(305, Short.MAX_VALUE))
        );

        TabBuscarID.addTab("Guardar", jPanel2);

        jPanel4.setPreferredSize(new java.awt.Dimension(600, 400));

        jNombreEmpEl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNombreEmpElActionPerformed(evt);
            }
        });

        jLabel3.setText("Clave");

        jLabel7.setText("Eliminar");

        btnEliminarDep.setText("Eliminar");
        btnEliminarDep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDepActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jNombreEmpEl, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                        .addComponent(btnEliminarDep)
                        .addGap(92, 92, 92))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel7)
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEliminarDep)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jNombreEmpEl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(381, Short.MAX_VALUE))
        );

        TabBuscarID.addTab("Eliminar", jPanel4);

        jPanel5.setPreferredSize(new java.awt.Dimension(600, 400));

        BtnBuscarTodosEmpleados.setText("Buscar Todos");
        BtnBuscarTodosEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnBuscarTodosEmpleadosActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable2.setMaximumSize(new java.awt.Dimension(400, 100));
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(BtnBuscarTodosEmpleados)
                .addGap(32, 32, 32))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(158, 158, 158)
                        .addComponent(BtnBuscarTodosEmpleados))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        TabBuscarID.addTab("Buscar Todos", jPanel5);

        jPanel6.setPreferredSize(new java.awt.Dimension(600, 400));

        Buscar.setText("Buscar");
        Buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarActionPerformed(evt);
            }
        });

        jLabel11.setText("ID");

        EmpleadosporID.setModel(new javax.swing.table.DefaultTableModel(
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
        EmpleadosporID.setMaximumSize(new java.awt.Dimension(400, 100));
        jScrollPane1.setViewportView(EmpleadosporID);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel11)
                        .addGap(47, 47, 47)
                        .addComponent(EmpIDBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Buscar))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap(47, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(141, 141, 141))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpIDBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(Buscar))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        TabBuscarID.addTab("Buscar por ID", jPanel6);

        jPanel3.setPreferredSize(new java.awt.Dimension(600, 400));

        jLabel2.setText("Modificar");

        EmpModNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpModNombreActionPerformed(evt);
            }
        });

        jLabel8.setText("Nombre");

        jLabel9.setText("Direccion");

        jLabel10.setText("Telefono");

        btnGuardarModEmp.setText("Guardar");
        btnGuardarModEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarModEmpActionPerformed(evt);
            }
        });

        Departamento1.setText("Departamento");

        Session sess = HibernateUtil.getSessionFactory().getCurrentSession();
        sess.beginTransaction();
        List<Departamento> listaDepts = sess.createQuery("from Departamento", Departamento.class).list();

        // Create a new model for jComboBox2
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();

        // Loop through the list and add the department names to the model
        for (Departamento departamento : listaDepts) {
            comboBoxModel.addElement(departamento.getNombre());
        }
        jComboBox2.setModel(comboBoxModel);
        sess.getTransaction().commit();
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        Clave.setText("Id de empleado a modificar:");

        EmpMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpModActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Clave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EmpMod, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(170, 170, 170))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(Departamento1)
                        .addGap(30, 30, 30)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(98, 98, 98)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmpModTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EmpModNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(EmpModDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(63, 63, 63)
                                .addComponent(btnGuardarModEmp)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2)
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Clave)
                    .addComponent(EmpMod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel10))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addComponent(jLabel8))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EmpModNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(EmpModDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnGuardarModEmp)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(EmpModTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Departamento1)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(239, Short.MAX_VALUE))
        );

        TabBuscarID.addTab("Modificar", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(TabBuscarID, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TabBuscarID, javax.swing.GroupLayout.PREFERRED_SIZE, 449, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        
                SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction t = session.beginTransaction();
        
        
        
       Departamento selectedDepartamento = (Departamento) jComboBox1.getSelectedItem();
        
        Empleado empleado = new Empleado();
        empleado.setNombre(txtNombre.getText());
        empleado.setDireccion(txtDireccion.getText());
        empleado.setTelefono(txtTelefono.getText());
       empleado.setDepto(selectedDepartamento);

      
        session.save(empleado);

            JOptionPane.showMessageDialog(this, "se guardo");
 
        t.commit();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void BtnBuscarTodosEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnBuscarTodosEmpleadosActionPerformed
        // TODO add your handling code here:
        
        
           // Crear el modelo de la tabla con las columnas adecuadas
        String[] columnNames = {"Clave", "Nombre", "Dirección", "Teléfono", "Departamento"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);
        
         
        // Obtener los datos de la base de datos usando Hibernate
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Empleado> listaEmpleados = session.createQuery("from Empleado", Empleado.class).list();
        
        // Llenar el modelo de la tabla con los datos obtenidos
        for (Empleado emp : listaEmpleados) {
            Object[] rowData = {
                emp.getClave(),
                emp.getNombre(),
                emp.getDireccion(),
                emp.getTelefono(), 
                emp.getDepto()
            };
            model.addRow(rowData);
            System.out.println("Clave: " + emp.getClave() + ", Nombre: " + emp.getNombre() + ", Direccion: " + emp.getDireccion() + ", Teléfono: " + emp.getTelefono());
        }
        
        session.getTransaction().commit();
        
        // Añadir la tabla dentro de un JScrollPane para hacerla desplazable
       jTable2.setModel(model);
    
       
    }//GEN-LAST:event_BtnBuscarTodosEmpleadosActionPerformed

    private void jNombreEmpElActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNombreEmpElActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jNombreEmpElActionPerformed

    private void btnEliminarDepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDepActionPerformed
        // TODO add your handling code here:

        Empleado empleado = new Empleado();
        int clave = Integer.valueOf(jNombreEmpEl.getText());
        empleado.setClave(clave);

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction t=session.beginTransaction();

        Empleado empleadoEncontrado = session.get(Empleado.class,  empleado.getClave());

        if (empleadoEncontrado != null) {
            session.delete(empleadoEncontrado);
            JOptionPane.showMessageDialog(this,  "Empleado eliminado: " + empleadoEncontrado.getNombre());

        }
t.commit();
    }//GEN-LAST:event_btnEliminarDepActionPerformed

    private void EmpModNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpModNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpModNombreActionPerformed

    private void btnGuardarModEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarModEmpActionPerformed
        // TODO add your handling code here:
 
        Empleado empleado = new Empleado();
        empleado.setClave(Integer.valueOf(EmpMod.getText()));

        SessionFactory sf = HibernateUtil.getSessionFactory();
        Session session = sf.getCurrentSession();
        Transaction t = session.beginTransaction();

        Map<String, Departamento> departmentMap = new HashMap<>();
        List<Departamento> listaDepartamentos = session.createQuery("from Departamento", Departamento.class).list();

        for (Departamento departamento : listaDepartamentos) {
            jComboBox2.addItem(departamento.getNombre());  // Add department name to JComboBox
            departmentMap.put(departamento.getNombre(), departamento);  // Map name to object
        }

        String selectedName = (String) jComboBox2.getSelectedItem();
        if (selectedName != null) {
            Departamento selectedDepartamento = departmentMap.get(selectedName);  // Get the object from the map
            System.out.println("Selected Departamento: " + selectedDepartamento.getNombre());
        }

        Empleado empleadoEncontrado = session.get(Empleado.class, empleado.getClave());
        if (empleadoEncontrado != null) {
            empleadoEncontrado.setNombre(EmpModNombre.getText());
            empleadoEncontrado.setDireccion(EmpModDireccion.getText());
            empleadoEncontrado.setTelefono(title);

            session.update(empleadoEncontrado);
            System.out.println("Departamento actualizado: " + empleadoEncontrado.getNombre());
            JOptionPane.showMessageDialog(this, "Departamento " + empleado.getClave() + " actualizado a: " + empleadoEncontrado.getNombre());
            
        }
t.commit();
    }//GEN-LAST:event_btnGuardarModEmpActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void BuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarActionPerformed
        // TODO add your handling code here:
        
        String[] columnNames = {"Clave", "Nombre", "Direccion", "Telefono", "Departamento"};
        int id = Integer.valueOf(EmpIDBuscar.getText());
        
        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        // Obtener los datos de la base de datos usando Hibernate
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Empleado> listaDepartamentos = session.createQuery("from Empleado", Empleado.class).list();

        // Llenar el modelo de la tabla con los datos obtenidos
        for (Empleado emp : listaDepartamentos) {
               if (emp.getClave() == id){
                
            Object[] rowData = {
             
                emp.getClave(),
                emp.getNombre(),
                emp.getDireccion(),
                emp.getTelefono(),
                emp.getDepto()
                    
            };
            model.addRow(rowData);
           
        }
        }

        session.getTransaction().commit();

        // Añadir la tabla dentro de un JScrollPane para hacerla desplazable
        EmpleadosporID.setModel(model);
        
        
        
    }//GEN-LAST:event_BuscarActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void EmpModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpModActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpModActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnBuscarTodosEmpleados;
    private javax.swing.JButton Buscar;
    private javax.swing.JLabel Clave;
    private javax.swing.JLabel Departamento;
    private javax.swing.JLabel Departamento1;
    private javax.swing.JTextField EmpIDBuscar;
    private javax.swing.JTextField EmpMod;
    private javax.swing.JTextField EmpModDireccion;
    private javax.swing.JTextField EmpModNombre;
    private javax.swing.JTextField EmpModTelefono;
    private javax.swing.JTable EmpleadosporID;
    private javax.swing.JTabbedPane TabBuscarID;
    private javax.swing.JButton btnEliminarDep;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnGuardarModEmp;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jNombreEmpEl;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
