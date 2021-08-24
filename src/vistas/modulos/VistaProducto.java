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
        jPanel1.setLayout(new java.awt.CardLayout());

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane2.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jScrollPane2.setOpaque(false);

        tbProductos.setBackground(new java.awt.Color(255, 255, 255));
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
                "Codigo", "Imagen", "Producto", "Categoria", "Precio", "Stock", "Estado", "Editar", "Eliminar"
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

        jPanel1.add(jScrollPane2, "card2");

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel header;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public rojerusan.RSTableMetro tbProductos;
    // End of variables declaration//GEN-END:variables
}
