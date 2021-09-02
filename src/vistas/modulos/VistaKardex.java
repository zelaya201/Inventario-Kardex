package vistas.modulos;

import controlador.Controlador;
import java.awt.event.KeyListener;
import utilidades.TextPrompt;

public class VistaKardex extends javax.swing.JPanel {

    public VistaKardex() {
        initComponents();
        new TextPrompt("Buscar producto (por ID, nombre de artículo)", tfBusqueda);
        this.btnExportPDF.setActionCommand("ExportPDF");
               
    }
    
    public void setControlador(Controlador control){
        this.tfBusqueda.addKeyListener(control);
        this.btnExportPDF.addActionListener(control);
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

        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tfBusqueda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnExportPDF = new RSMaterialComponent.RSButtonMaterialOne();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lbProveedor = new javax.swing.JLabel();
        lbArticulo = new javax.swing.JLabel();
        lbUnidad = new javax.swing.JLabel();
        lbCantMax = new javax.swing.JLabel();
        lbReferencia = new javax.swing.JLabel();
        lbUbicacion = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tablaDetalles = new rojerusan.RSTableMetro();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane11 = new javax.swing.JScrollPane();
        tablaEntradas = new rojerusan.RSTableMetro();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tablaSalidas = new rojerusan.RSTableMetro();
        jLabel13 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane13 = new javax.swing.JScrollPane();
        tablaExistencias = new rojerusan.RSTableMetro();
        jLabel16 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        jPanel3.setOpaque(false);
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(42, 53, 66));
        jLabel3.setText("Reporte Kardex / Producto");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 20.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 0);
        jPanel3.add(jLabel3, gridBagConstraints);

        tfBusqueda.setBackground(new java.awt.Color(255, 255, 255));
        tfBusqueda.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 1, new java.awt.Color(204, 204, 204)), javax.swing.BorderFactory.createEmptyBorder(1, 5, 1, 1)));
        tfBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfBusquedaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfBusquedaKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 50;
        gridBagConstraints.ipady = 18;
        gridBagConstraints.weightx = 60.0;
        jPanel3.add(tfBusqueda, gridBagConstraints);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_property_25px.png"))); // NOI18N
        jLabel1.setLabelFor(tfBusqueda);
        jLabel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jLabel1.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 18;
        gridBagConstraints.ipady = 11;
        jPanel3.add(jLabel1, gridBagConstraints);

        btnExportPDF.setBackground(new java.awt.Color(61, 137, 248));
        btnExportPDF.setText("Exportar PDF");
        btnExportPDF.setBackgroundHover(new java.awt.Color(39, 116, 229));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 20.0;
        jPanel3.add(btnExportPDF, gridBagConstraints);

        add(jPanel3, java.awt.BorderLayout.PAGE_START);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(4, 0, 0, 0, new java.awt.Color(210, 214, 222)));
        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 25, 0);
        jPanel2.add(jLabel4, gridBagConstraints);

        lbProveedor.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbProveedor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbProveedor.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(lbProveedor, gridBagConstraints);

        lbArticulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbArticulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbArticulo.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 10;
        jPanel2.add(lbArticulo, gridBagConstraints);

        lbUnidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbUnidad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUnidad.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 25, 0);
        jPanel2.add(lbUnidad, gridBagConstraints);

        lbCantMax.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbCantMax.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCantMax.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 25, 0);
        jPanel2.add(lbCantMax, gridBagConstraints);

        lbReferencia.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbReferencia.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbReferencia.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 10;
        jPanel2.add(lbReferencia, gridBagConstraints);

        lbUbicacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbUbicacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbUbicacion.setText("-");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        jPanel2.add(lbUbicacion, gridBagConstraints);

        jLabel21.setBackground(new java.awt.Color(61, 137, 248));
        jLabel21.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Tarjeta Kardex");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 24;
        jPanel2.add(jLabel21, gridBagConstraints);

        jLabel24.setBackground(new java.awt.Color(232, 233, 235));
        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("Cantidad Máxima:");
        jLabel24.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 10;
        jPanel2.add(jLabel24, gridBagConstraints);

        jLabel25.setBackground(new java.awt.Color(232, 233, 235));
        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Unidad de Medida:");
        jLabel25.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 10;
        jPanel2.add(jLabel25, gridBagConstraints);

        jLabel26.setBackground(new java.awt.Color(232, 233, 235));
        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Referencia: ");
        jLabel26.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(jLabel26, gridBagConstraints);

        jLabel27.setBackground(new java.awt.Color(232, 233, 235));
        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("Ubicación:");
        jLabel27.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(jLabel27, gridBagConstraints);

        jLabel28.setBackground(new java.awt.Color(232, 233, 235));
        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText("Cantidad Mínima");
        jLabel28.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 10;
        jPanel2.add(jLabel28, gridBagConstraints);

        jLabel29.setBackground(new java.awt.Color(232, 233, 235));
        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("Proveedor:");
        jLabel29.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(jLabel29, gridBagConstraints);

        jLabel30.setBackground(new java.awt.Color(232, 233, 235));
        jLabel30.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(51, 51, 51));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("Artículo:");
        jLabel30.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.ipadx = 30;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.weightx = 1.0;
        jPanel2.add(jLabel30, gridBagConstraints);

        jPanel1.add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new java.awt.BorderLayout());

        jScrollPane10.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(204, 204, 204)));
        jScrollPane10.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane10.setOpaque(false);

        tablaDetalles.setBackground(new java.awt.Color(255, 255, 255));
        tablaDetalles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        tablaDetalles.setForeground(new java.awt.Color(255, 255, 255));
        tablaDetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Fecha", "Concepto", "Valor Unitario"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaDetalles.setAltoHead(30);
        tablaDetalles.setColorBackgoundHead(new java.awt.Color(249, 249, 249));
        tablaDetalles.setColorBordeFilas(new java.awt.Color(243, 243, 243));
        tablaDetalles.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tablaDetalles.setColorFilasBackgound2(new java.awt.Color(249, 249, 249));
        tablaDetalles.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        tablaDetalles.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        tablaDetalles.setColorForegroundHead(new java.awt.Color(0, 0, 0));
        tablaDetalles.setColorSelBackgound(new java.awt.Color(240, 240, 240));
        tablaDetalles.setColorSelForeground(new java.awt.Color(51, 51, 51));
        tablaDetalles.setFocusable(false);
        tablaDetalles.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tablaDetalles.setFuenteFilas(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tablaDetalles.setFuenteFilasSelect(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tablaDetalles.setFuenteHead(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        tablaDetalles.setGridColor(new java.awt.Color(204, 204, 204));
        tablaDetalles.setGrosorBordeFilas(0);
        tablaDetalles.setGrosorBordeHead(0);
        tablaDetalles.setMultipleSeleccion(false);
        tablaDetalles.setRowHeight(40);
        tablaDetalles.getTableHeader().setResizingAllowed(false);
        tablaDetalles.getTableHeader().setReorderingAllowed(false);
        jScrollPane10.setViewportView(tablaDetalles);
        if (tablaDetalles.getColumnModel().getColumnCount() > 0) {
            tablaDetalles.getColumnModel().getColumn(0).setResizable(false);
            tablaDetalles.getColumnModel().getColumn(1).setResizable(false);
            tablaDetalles.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel5.add(jScrollPane10, java.awt.BorderLayout.CENTER);

        jLabel10.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Entradas");
        jLabel10.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(255, 255, 255)), javax.swing.BorderFactory.createEmptyBorder(10, 1, 10, 1)));
        jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel5.add(jLabel10, java.awt.BorderLayout.PAGE_START);

        jPanel4.add(jPanel5);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Entradas");
        jLabel6.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 0, new java.awt.Color(204, 204, 204)), javax.swing.BorderFactory.createEmptyBorder(10, 1, 10, 1)));
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel6.add(jLabel6, java.awt.BorderLayout.PAGE_START);

        jScrollPane11.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane11.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(204, 204, 204)));
        jScrollPane11.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane11.setOpaque(false);

        tablaEntradas.setBackground(new java.awt.Color(255, 255, 255));
        tablaEntradas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        tablaEntradas.setForeground(new java.awt.Color(255, 255, 255));
        tablaEntradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cantidad", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaEntradas.setAltoHead(30);
        tablaEntradas.setColorBackgoundHead(new java.awt.Color(249, 249, 249));
        tablaEntradas.setColorBordeFilas(new java.awt.Color(243, 243, 243));
        tablaEntradas.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tablaEntradas.setColorFilasBackgound2(new java.awt.Color(249, 249, 249));
        tablaEntradas.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        tablaEntradas.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        tablaEntradas.setColorForegroundHead(new java.awt.Color(0, 0, 0));
        tablaEntradas.setColorSelBackgound(new java.awt.Color(240, 240, 240));
        tablaEntradas.setColorSelForeground(new java.awt.Color(51, 51, 51));
        tablaEntradas.setFocusable(false);
        tablaEntradas.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tablaEntradas.setFuenteFilas(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tablaEntradas.setFuenteFilasSelect(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tablaEntradas.setFuenteHead(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        tablaEntradas.setGridColor(new java.awt.Color(204, 204, 204));
        tablaEntradas.setGrosorBordeFilas(0);
        tablaEntradas.setGrosorBordeHead(0);
        tablaEntradas.setMultipleSeleccion(false);
        tablaEntradas.setRowHeight(40);
        tablaEntradas.getTableHeader().setResizingAllowed(false);
        tablaEntradas.getTableHeader().setReorderingAllowed(false);
        jScrollPane11.setViewportView(tablaEntradas);
        if (tablaEntradas.getColumnModel().getColumnCount() > 0) {
            tablaEntradas.getColumnModel().getColumn(0).setResizable(false);
            tablaEntradas.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel6.add(jScrollPane11, java.awt.BorderLayout.CENTER);

        jPanel4.add(jPanel6);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new java.awt.BorderLayout());

        jScrollPane12.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane12.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 0, new java.awt.Color(204, 204, 204)));
        jScrollPane12.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane12.setOpaque(false);

        tablaSalidas.setBackground(new java.awt.Color(255, 255, 255));
        tablaSalidas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        tablaSalidas.setForeground(new java.awt.Color(255, 255, 255));
        tablaSalidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cantidad", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaSalidas.setAltoHead(30);
        tablaSalidas.setColorBackgoundHead(new java.awt.Color(249, 249, 249));
        tablaSalidas.setColorBordeFilas(new java.awt.Color(243, 243, 243));
        tablaSalidas.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tablaSalidas.setColorFilasBackgound2(new java.awt.Color(249, 249, 249));
        tablaSalidas.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        tablaSalidas.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        tablaSalidas.setColorForegroundHead(new java.awt.Color(0, 0, 0));
        tablaSalidas.setColorSelBackgound(new java.awt.Color(240, 240, 240));
        tablaSalidas.setColorSelForeground(new java.awt.Color(51, 51, 51));
        tablaSalidas.setFocusable(false);
        tablaSalidas.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tablaSalidas.setFuenteFilas(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tablaSalidas.setFuenteFilasSelect(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tablaSalidas.setFuenteHead(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        tablaSalidas.setGridColor(new java.awt.Color(204, 204, 204));
        tablaSalidas.setGrosorBordeFilas(0);
        tablaSalidas.setGrosorBordeHead(0);
        tablaSalidas.setMultipleSeleccion(false);
        tablaSalidas.setRowHeight(40);
        tablaSalidas.getTableHeader().setResizingAllowed(false);
        tablaSalidas.getTableHeader().setReorderingAllowed(false);
        jScrollPane12.setViewportView(tablaSalidas);
        if (tablaSalidas.getColumnModel().getColumnCount() > 0) {
            tablaSalidas.getColumnModel().getColumn(0).setResizable(false);
            tablaSalidas.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel7.add(jScrollPane12, java.awt.BorderLayout.CENTER);

        jLabel13.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Salidas");
        jLabel13.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 0, new java.awt.Color(204, 204, 204)), javax.swing.BorderFactory.createEmptyBorder(10, 1, 10, 1)));
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel7.add(jLabel13, java.awt.BorderLayout.PAGE_START);

        jPanel4.add(jPanel7);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new java.awt.BorderLayout());

        jScrollPane13.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jScrollPane13.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane13.setOpaque(false);

        tablaExistencias.setBackground(new java.awt.Color(255, 255, 255));
        tablaExistencias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(249, 249, 249)));
        tablaExistencias.setForeground(new java.awt.Color(255, 255, 255));
        tablaExistencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Cantidad", "Valor"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaExistencias.setAltoHead(30);
        tablaExistencias.setColorBackgoundHead(new java.awt.Color(249, 249, 249));
        tablaExistencias.setColorBordeFilas(new java.awt.Color(243, 243, 243));
        tablaExistencias.setColorBordeHead(new java.awt.Color(255, 255, 255));
        tablaExistencias.setColorFilasBackgound2(new java.awt.Color(249, 249, 249));
        tablaExistencias.setColorFilasForeground1(new java.awt.Color(51, 51, 51));
        tablaExistencias.setColorFilasForeground2(new java.awt.Color(51, 51, 51));
        tablaExistencias.setColorForegroundHead(new java.awt.Color(0, 0, 0));
        tablaExistencias.setColorSelBackgound(new java.awt.Color(240, 240, 240));
        tablaExistencias.setColorSelForeground(new java.awt.Color(51, 51, 51));
        tablaExistencias.setFocusable(false);
        tablaExistencias.setFont(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tablaExistencias.setFuenteFilas(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tablaExistencias.setFuenteFilasSelect(new java.awt.Font("Calibri Light", 0, 14)); // NOI18N
        tablaExistencias.setFuenteHead(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        tablaExistencias.setGridColor(new java.awt.Color(204, 204, 204));
        tablaExistencias.setGrosorBordeFilas(0);
        tablaExistencias.setGrosorBordeHead(0);
        tablaExistencias.setMultipleSeleccion(false);
        tablaExistencias.setRowHeight(40);
        tablaExistencias.getTableHeader().setResizingAllowed(false);
        tablaExistencias.getTableHeader().setReorderingAllowed(false);
        jScrollPane13.setViewportView(tablaExistencias);
        if (tablaExistencias.getColumnModel().getColumnCount() > 0) {
            tablaExistencias.getColumnModel().getColumn(0).setResizable(false);
            tablaExistencias.getColumnModel().getColumn(1).setResizable(false);
        }

        jPanel8.add(jScrollPane13, java.awt.BorderLayout.CENTER);

        jLabel16.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("Existencias");
        jLabel16.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 0, 1, new java.awt.Color(204, 204, 204)), javax.swing.BorderFactory.createEmptyBorder(10, 1, 10, 1)));
        jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel8.add(jLabel16, java.awt.BorderLayout.PAGE_START);

        jPanel4.add(jPanel8);

        jPanel1.add(jPanel4, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void tfBusquedaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBusquedaKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBusquedaKeyPressed

    private void tfBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfBusquedaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfBusquedaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public RSMaterialComponent.RSButtonMaterialOne btnExportPDF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    public javax.swing.JLabel lbArticulo;
    public javax.swing.JLabel lbCantMax;
    public javax.swing.JLabel lbProveedor;
    public javax.swing.JLabel lbReferencia;
    public javax.swing.JLabel lbUbicacion;
    public javax.swing.JLabel lbUnidad;
    public rojerusan.RSTableMetro tablaDetalles;
    public rojerusan.RSTableMetro tablaEntradas;
    public rojerusan.RSTableMetro tablaExistencias;
    public rojerusan.RSTableMetro tablaSalidas;
    public javax.swing.JTextField tfBusqueda;
    // End of variables declaration//GEN-END:variables
}
