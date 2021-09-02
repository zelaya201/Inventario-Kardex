package vistas.modulos;

import controlador.Controlador;

import utilidades.TextPrompt;

public class VistaMovimiento extends javax.swing.JPanel {

    public VistaMovimiento() {
        initComponents();
        this.btnGuardar.setActionCommand("guardarMovimiento");
        new TextPrompt("Buscar productos", tfBusqueda);
    }

    public void setControlador(Controlador control){
        this.btnGuardar.addActionListener(control);
        this.tfBusqueda.addKeyListener(control);
        this.tbProductos.addMouseListener(control);
        this.cbTipo.addItemListener(control);
        this.cbOperacion.addItemListener(control);
        //this.tfValorUnitario.addKeyListener(control);
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
        jpDetallesP = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbTipo = new RSMaterialComponent.RSComboBox();
        cbOperacion = new RSMaterialComponent.RSComboBox();
        tfCodigo = new RSMaterialComponent.RSTextFieldMaterial();
        jLabel7 = new javax.swing.JLabel();
        dcFecha = new rojeru_san.rsdate.RSDateChooser();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tfCantidad = new RSMaterialComponent.RSTextFieldMaterial();
        tfValorUnitario = new RSMaterialComponent.RSTextFieldMaterial();
        btnCancelar = new RSMaterialComponent.RSButtonMaterialRipple();
        btnGuardar = new RSMaterialComponent.RSButtonMaterialRipple();
        lbProducto = new javax.swing.JLabel();
        lbValor = new javax.swing.JLabel();
        jpBuscarP = new javax.swing.JPanel();
        tfBusqueda = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbProductos = new rojerusan.RSTableMetro();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbMovimiento = new rojerusan.RSTableMetro();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        header.setOpaque(false);
        header.setLayout(new java.awt.GridBagLayout());

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(42, 53, 66));
        jLabel3.setText("Movimientos");
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

        jpDetallesP.setBackground(new java.awt.Color(255, 255, 255));
        jpDetallesP.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "Detalles del movimiento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 16))); // NOI18N
        jpDetallesP.setLayout(new java.awt.GridBagLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Producto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 8, 0, 0);
        jpDetallesP.add(jLabel5, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Fecha");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 6.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 8, 0, 0);
        jpDetallesP.add(jLabel2, gridBagConstraints);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Operacion");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 6.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 191, 0, 0);
        jpDetallesP.add(jLabel4, gridBagConstraints);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Cod. Movimiento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 0);
        jpDetallesP.add(jLabel6, gridBagConstraints);

        cbTipo.setForeground(new java.awt.Color(184, 184, 184));
        cbTipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Entrada", "Salida" }));
        cbTipo.setColorArrow(new java.awt.Color(153, 153, 153));
        cbTipo.setColorBorde(new java.awt.Color(204, 204, 204));
        cbTipo.setColorFondo(new java.awt.Color(255, 255, 255));
        cbTipo.setColorListaItemsTXT(new java.awt.Color(184, 184, 184));
        cbTipo.setColorSeleccion(new java.awt.Color(102, 102, 102));
        cbTipo.setConBorde(true);
        cbTipo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbTipo.setPreferredSize(new java.awt.Dimension(140, 32));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weighty = 8.9;
        gridBagConstraints.insets = new java.awt.Insets(11, 15, 0, 0);
        jpDetallesP.add(cbTipo, gridBagConstraints);

        cbOperacion.setForeground(new java.awt.Color(184, 184, 184));
        cbOperacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));
        cbOperacion.setColorArrow(new java.awt.Color(153, 153, 153));
        cbOperacion.setColorBorde(new java.awt.Color(204, 204, 204));
        cbOperacion.setColorFondo(new java.awt.Color(255, 255, 255));
        cbOperacion.setColorListaItemsTXT(new java.awt.Color(184, 184, 184));
        cbOperacion.setColorSeleccion(new java.awt.Color(102, 102, 102));
        cbOperacion.setConBorde(true);
        cbOperacion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cbOperacion.setPreferredSize(new java.awt.Dimension(140, 32));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weighty = 8.9;
        gridBagConstraints.insets = new java.awt.Insets(11, 189, 0, 0);
        jpDetallesP.add(cbOperacion, gridBagConstraints);

        tfCodigo.setForeground(new java.awt.Color(51, 51, 51));
        tfCodigo.setColorMaterial(new java.awt.Color(153, 153, 153));
        tfCodigo.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfCodigo.setPhColor(new java.awt.Color(51, 51, 51));
        tfCodigo.setPlaceholder("");
        tfCodigo.setPreferredSize(new java.awt.Dimension(130, 42));
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 10.4;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 18);
        jpDetallesP.add(tfCodigo, gridBagConstraints);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Tipo de movimiento");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 6.0;
        gridBagConstraints.insets = new java.awt.Insets(10, 15, 0, 0);
        jpDetallesP.add(jLabel7, gridBagConstraints);

        dcFecha.setForeground(new java.awt.Color(184, 184, 184));
        dcFecha.setColorBackground(new java.awt.Color(204, 204, 204));
        dcFecha.setColorButtonHover(new java.awt.Color(153, 153, 153));
        dcFecha.setColorForeground(new java.awt.Color(184, 184, 184));
        dcFecha.setFuente(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        dcFecha.setPreferredSize(new java.awt.Dimension(180, 32));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(11, 8, 0, 0);
        jpDetallesP.add(dcFecha, gridBagConstraints);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Valor unitario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 82, 0, 0);
        jpDetallesP.add(jLabel8, gridBagConstraints);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Cantidad");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 226, 0, 0);
        jpDetallesP.add(jLabel9, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Valor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(20, 10, 0, 0);
        jpDetallesP.add(jLabel10, gridBagConstraints);

        tfCantidad.setForeground(new java.awt.Color(51, 51, 51));
        tfCantidad.setColorMaterial(new java.awt.Color(153, 153, 153));
        tfCantidad.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfCantidad.setPhColor(new java.awt.Color(51, 51, 51));
        tfCantidad.setPlaceholder("");
        tfCantidad.setPreferredSize(new java.awt.Dimension(102, 42));
        tfCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCantidadActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 15000.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 226, 0, 0);
        jpDetallesP.add(tfCantidad, gridBagConstraints);

        tfValorUnitario.setForeground(new java.awt.Color(51, 51, 51));
        tfValorUnitario.setColorMaterial(new java.awt.Color(153, 153, 153));
        tfValorUnitario.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfValorUnitario.setPhColor(new java.awt.Color(51, 51, 51));
        tfValorUnitario.setPlaceholder("");
        tfValorUnitario.setPreferredSize(new java.awt.Dimension(110, 42));
        tfValorUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfValorUnitarioActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 15000.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 82, 0, 0);
        jpDetallesP.add(tfValorUnitario, gridBagConstraints);

        btnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelar.setText("Cancelar movimiento");
        btnCancelar.setBackgroundHover(new java.awt.Color(120, 120, 120));
        btnCancelar.setPreferredSize(new java.awt.Dimension(168, 40));
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.insets = new java.awt.Insets(60, 309, 0, 0);
        jpDetallesP.add(btnCancelar, gridBagConstraints);

        btnGuardar.setText("Guardar movimiento");
        btnGuardar.setPreferredSize(new java.awt.Dimension(165, 40));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 3;
        gridBagConstraints.weightx = 0.7;
        gridBagConstraints.insets = new java.awt.Insets(60, 310, 0, 0);
        jpDetallesP.add(btnGuardar, gridBagConstraints);

        lbProducto.setBackground(new java.awt.Color(153, 153, 153));
        lbProducto.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbProducto.setForeground(new java.awt.Color(51, 51, 51));
        lbProducto.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        lbProducto.setPreferredSize(new java.awt.Dimension(250, 42));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 7, 0, 0);
        jpDetallesP.add(lbProducto, gridBagConstraints);

        lbValor.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        lbValor.setForeground(new java.awt.Color(51, 51, 51));
        lbValor.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        lbValor.setPreferredSize(new java.awt.Dimension(130, 42));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.FIRST_LINE_START;
        gridBagConstraints.weighty = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        jpDetallesP.add(lbValor, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 7.1;
        jPanel1.add(jpDetallesP, gridBagConstraints);

        jpBuscarP.setBackground(new java.awt.Color(255, 255, 255));
        jpBuscarP.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true), "Buscar productos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Bahnschrift", 1, 16), new java.awt.Color(42, 53, 66))); // NOI18N
        jpBuscarP.setLayout(new java.awt.GridBagLayout());

        tfBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        tfBusqueda.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        tfBusqueda.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(204, 204, 204)), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipady = 11;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        jpBuscarP.add(tfBusqueda, gridBagConstraints);

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane2.setOpaque(false);

        tbProductos.setBackground(new java.awt.Color(255, 255, 255));
        tbProductos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        tbProductos.setForeground(new java.awt.Color(255, 255, 255));
        tbProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Producto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
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

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.3;
        gridBagConstraints.weighty = 2.1;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 0, 0);
        jpBuscarP.add(jScrollPane2, gridBagConstraints);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_18px.png"))); // NOI18N
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints.ipadx = 12;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.insets = new java.awt.Insets(3, 0, 0, 0);
        jpBuscarP.add(jLabel1, gridBagConstraints);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 300;
        gridBagConstraints.ipady = 150;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        jPanel1.add(jpBuscarP, gridBagConstraints);

        jScrollPane3.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane3.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane3.setOpaque(false);

        tbMovimiento.setBackground(new java.awt.Color(255, 255, 255));
        tbMovimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        tbMovimiento.setForeground(new java.awt.Color(255, 255, 255));
        tbMovimiento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod. Movimiento", "Fecha", "Concepto", "Producto", "Valor Unitario", "Cantidad", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbMovimiento.setAltoHead(30);
        tbMovimiento.setColorBackgoundHead(new java.awt.Color(249, 249, 249));
        tbMovimiento.setColorBordeFilas(new java.awt.Color(255, 255, 255));
        tbMovimiento.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tbMovimiento.setColorFilasBackgound2(new java.awt.Color(249, 249, 249));
        tbMovimiento.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        tbMovimiento.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        tbMovimiento.setColorForegroundHead(new java.awt.Color(0, 0, 0));
        tbMovimiento.setColorSelForeground(new java.awt.Color(51, 51, 51));
        tbMovimiento.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tbMovimiento.setFuenteFilas(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tbMovimiento.setFuenteFilasSelect(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tbMovimiento.setFuenteHead(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        tbMovimiento.setGridColor(new java.awt.Color(255, 255, 255));
        tbMovimiento.setGrosorBordeFilas(0);
        tbMovimiento.setGrosorBordeHead(0);
        tbMovimiento.setMultipleSeleccion(false);
        tbMovimiento.setRowHeight(40);
        tbMovimiento.getTableHeader().setResizingAllowed(false);
        tbMovimiento.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(tbMovimiento);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTH;
        gridBagConstraints.weightx = 1.3;
        gridBagConstraints.weighty = 2.1;
        gridBagConstraints.insets = new java.awt.Insets(17, 0, 0, 0);
        jPanel1.add(jScrollPane3, gridBagConstraints);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void tfCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCantidadActionPerformed

    private void tfValorUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfValorUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfValorUnitarioActionPerformed

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        tfCodigo.setText("");
        dcFecha.setDatoFecha(null);
        cbTipo.setSelectedIndex(0);
        cbOperacion.setSelectedIndex(0);
        lbProducto.setText("");
        tfValorUnitario.setText("");
        tfCantidad.setText("");
        lbProducto.setText("");
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonMaterialRipple btnCancelar;
    private RSMaterialComponent.RSButtonMaterialRipple btnGuardar;
    public RSMaterialComponent.RSComboBox cbOperacion;
    public RSMaterialComponent.RSComboBox cbTipo;
    public rojeru_san.rsdate.RSDateChooser dcFecha;
    public javax.swing.JPanel header;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JPanel jpBuscarP;
    private javax.swing.JPanel jpDetallesP;
    public javax.swing.JLabel lbProducto;
    public javax.swing.JLabel lbValor;
    public rojerusan.RSTableMetro tbMovimiento;
    public rojerusan.RSTableMetro tbProductos;
    public javax.swing.JTextField tfBusqueda;
    public RSMaterialComponent.RSTextFieldMaterial tfCantidad;
    public RSMaterialComponent.RSTextFieldMaterial tfCodigo;
    public RSMaterialComponent.RSTextFieldMaterial tfValorUnitario;
    // End of variables declaration//GEN-END:variables
}
