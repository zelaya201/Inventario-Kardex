package vistas.modulos;

import controlador.Controlador;

import utilidades.TextPrompt;

public class VistaProducto extends javax.swing.JPanel {

    public VistaProducto() {
        initComponents();
    }

    public void setControlador(Controlador control){
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProductos = new rojerusan.RSTableMetro();
        iconUser1 = new javax.swing.JLabel();
        codProducto = new javax.swing.JTextField();
        CantMax = new javax.swing.JTextField();
        iconPass4 = new javax.swing.JLabel();
        referencias = new javax.swing.JTextField();
        iconPass5 = new javax.swing.JLabel();
        iconPass6 = new javax.swing.JLabel();
        productos = new javax.swing.JTextField();
        cbUnidad = new javax.swing.JComboBox<>();
        iconRol = new javax.swing.JLabel();
        iconPass7 = new javax.swing.JLabel();
        txtLocalizacion = new javax.swing.JTextField();
        iconPass8 = new javax.swing.JLabel();
        categoriaProd = new javax.swing.JTextField();
        proveedor = new javax.swing.JTextField();
        iconPass9 = new javax.swing.JLabel();
        iconPass10 = new javax.swing.JLabel();
        CantMin = new javax.swing.JTextField();
        nuevoProducto = new newscomponents.RSButtonIcon_new();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        header.setOpaque(false);
        header.setLayout(new java.awt.GridBagLayout());

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(42, 53, 66));
        jLabel3.setText("Productos / Lista de Productos");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 20.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 0);
        header.add(jLabel3, gridBagConstraints);

        add(header, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 0, 0, new java.awt.Color(210, 214, 222)));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane2.setOpaque(false);

        tbProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        tbProductos.setForeground(new java.awt.Color(255, 255, 255));
        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Categoría", "Proveedor", "Producto", "Unidad", "Cantidad mínima", "Cantidad máxima", "Referencia", "Localización"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProductos.setAltoHead(30);
        tbProductos.setColorBackgoundHead(new java.awt.Color(249, 249, 249));
        tbProductos.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tbProductos.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tbProductos.setColorFilasBackgound2(new java.awt.Color(249, 249, 249));
        tbProductos.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        tbProductos.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        tbProductos.setColorForegroundHead(new java.awt.Color(0, 0, 0));
        tbProductos.setColorSelForeground(new java.awt.Color(51, 51, 51));
        tbProductos.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tbProductos.setFuenteFilas(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tbProductos.setFuenteFilasSelect(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tbProductos.setFuenteHead(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        tbProductos.setGridColor(new java.awt.Color(255, 255, 255));
        tbProductos.setGrosorBordeFilas(0);
        tbProductos.setGrosorBordeHead(0);
        tbProductos.setMultipleSeleccion(false);
        tbProductos.setRowHeight(40);
        tbProductos.getTableHeader().setResizingAllowed(false);
        tbProductos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbProductos);
        if (tbProductos.getColumnModel().getColumnCount() > 0) {
            tbProductos.getColumnModel().getColumn(0).setResizable(false);
            tbProductos.getColumnModel().getColumn(1).setResizable(false);
            tbProductos.getColumnModel().getColumn(2).setResizable(false);
            tbProductos.getColumnModel().getColumn(3).setResizable(false);
            tbProductos.getColumnModel().getColumn(4).setResizable(false);
            tbProductos.getColumnModel().getColumn(5).setResizable(false);
            tbProductos.getColumnModel().getColumn(7).setResizable(false);
        }

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        jPanel1.add(jScrollPane2, gridBagConstraints);

        iconUser1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconUser1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barcode_22px.png"))); // NOI18N
        iconUser1.setText("Codigo");
        iconUser1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 12, 0);
        jPanel1.add(iconUser1, gridBagConstraints);

        codProducto.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(204, 204, 204)), javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0)));
        codProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codProductoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 175;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.insets = new java.awt.Insets(20, -3, 12, 0);
        jPanel1.add(codProducto, gridBagConstraints);

        CantMax.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(204, 204, 204)), javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0)));
        CantMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantMaxActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 175;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 12, 30);
        jPanel1.add(CantMax, gridBagConstraints);

        iconPass4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPass4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/warehouse_22px.png"))); // NOI18N
        iconPass4.setText("Max");
        iconPass4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 78;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(20, 22, 12, 0);
        jPanel1.add(iconPass4, gridBagConstraints);

        referencias.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(204, 204, 204)), javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0)));
        referencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                referenciasActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 225;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 12, 50);
        jPanel1.add(referencias, gridBagConstraints);

        iconPass5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPass5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/empty_box_22px.png"))); // NOI18N
        iconPass5.setText("Referencias");
        iconPass5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(20, 29, 12, 0);
        jPanel1.add(iconPass5, gridBagConstraints);

        iconPass6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPass6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/product_22px.png"))); // NOI18N
        iconPass6.setText("Productos");
        iconPass6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 12, 0);
        jPanel1.add(iconPass6, gridBagConstraints);

        productos.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(204, 204, 204)), javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0)));
        productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productosActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 7;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 225;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.insets = new java.awt.Insets(20, -5, 12, 50);
        jPanel1.add(productos, gridBagConstraints);

        cbUnidad.setForeground(new java.awt.Color(102, 102, 102));
        cbUnidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gramos", "LIbras", "Kilogramos", "Toneladas", "Unidades", "Litros", "Galones", "Barriles", "Latas", "Cajas", "Metros Cubicos", "Otros" }));
        cbUnidad.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        cbUnidad.setFocusable(false);
        cbUnidad.setLightWeightPopupEnabled(false);
        cbUnidad.setRequestFocusEnabled(false);
        cbUnidad.setVerifyInputWhenFocusTarget(false);
        cbUnidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbUnidadActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.insets = new java.awt.Insets(20, -4, 12, 0);
        jPanel1.add(cbUnidad, gridBagConstraints);

        iconRol.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconRol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/purchase_orderB_22px.png"))); // NOI18N
        iconRol.setText("Unidad");
        iconRol.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 12, 0);
        jPanel1.add(iconRol, gridBagConstraints);

        iconPass7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPass7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/package_search_25px.png"))); // NOI18N
        iconPass7.setText("Localización");
        iconPass7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 16;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 12, 0);
        jPanel1.add(iconPass7, gridBagConstraints);

        txtLocalizacion.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(204, 204, 204)), javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0)));
        txtLocalizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLocalizacionActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 175;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 12, 0);
        jPanel1.add(txtLocalizacion, gridBagConstraints);

        iconPass8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPass8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compose_22px.png"))); // NOI18N
        iconPass8.setText("Categoría");
        iconPass8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 12, 0);
        jPanel1.add(iconPass8, gridBagConstraints);

        categoriaProd.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(204, 204, 204)), javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0)));
        categoriaProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoriaProdActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 175;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 12, 30);
        jPanel1.add(categoriaProd, gridBagConstraints);

        proveedor.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(204, 204, 204)), javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0)));
        proveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proveedorActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 175;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 12, 30);
        jPanel1.add(proveedor, gridBagConstraints);

        iconPass9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPass9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/in_transit_22px.png"))); // NOI18N
        iconPass9.setText("Proveedor");
        iconPass9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 45;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(20, 22, 12, 0);
        jPanel1.add(iconPass9, gridBagConstraints);

        iconPass10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconPass10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/warehouse_22px.png"))); // NOI18N
        iconPass10.setText("Min");
        iconPass10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 78;
        gridBagConstraints.ipady = 16;
        gridBagConstraints.insets = new java.awt.Insets(20, 30, 12, 0);
        jPanel1.add(iconPass10, gridBagConstraints);

        CantMin.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(204, 204, 204)), javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 0)));
        CantMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantMinActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 174;
        gridBagConstraints.ipady = 22;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(20, 0, 12, 26);
        jPanel1.add(CantMin, gridBagConstraints);

        nuevoProducto.setBackground(new java.awt.Color(61, 137, 248));
        nuevoProducto.setText("Nuevo Producto");
        nuevoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoProductoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        jPanel1.add(nuevoProducto, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void codProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codProductoActionPerformed

    private void CantMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantMaxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantMaxActionPerformed

    private void referenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_referenciasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_referenciasActionPerformed

    private void productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_productosActionPerformed

    private void cbUnidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbUnidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbUnidadActionPerformed

    private void txtLocalizacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLocalizacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLocalizacionActionPerformed

    private void categoriaProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoriaProdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoriaProdActionPerformed

    private void proveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_proveedorActionPerformed

    private void CantMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantMinActionPerformed

    private void nuevoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField CantMax;
    public javax.swing.JTextField CantMin;
    public javax.swing.JTextField categoriaProd;
    public javax.swing.JComboBox<String> cbUnidad;
    public javax.swing.JTextField codProducto;
    public javax.swing.JPanel header;
    public javax.swing.JLabel iconPass10;
    public javax.swing.JLabel iconPass4;
    public javax.swing.JLabel iconPass5;
    public javax.swing.JLabel iconPass6;
    public javax.swing.JLabel iconPass7;
    public javax.swing.JLabel iconPass8;
    public javax.swing.JLabel iconPass9;
    public javax.swing.JLabel iconRol;
    private javax.swing.JLabel iconUser1;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private newscomponents.RSButtonIcon_new nuevoProducto;
    public javax.swing.JTextField productos;
    public javax.swing.JTextField proveedor;
    public javax.swing.JTextField referencias;
    public rojerusan.RSTableMetro tbProductos;
    public javax.swing.JTextField txtLocalizacion;
    // End of variables declaration//GEN-END:variables
}
