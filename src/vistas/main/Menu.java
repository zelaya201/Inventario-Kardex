package vistas.main;

import controlador.Controlador;
import java.awt.Color;
import javax.swing.JFrame;


public class Menu extends javax.swing.JFrame {

    boolean menuActived = true;
//    boolean opEntradas = false;
//    boolean opSalidas = false;
    
    public Menu() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
//        this.btnCompraEntradas.setVisible(false);
//        this.btnDevoEntradas.setVisible(false);
//        this.btnVentaSalidas.setVisible(false);
//        this.btnDevoSalidas.setVisible(false);
        this.btnHome.setActionCommand("Inicio");
        this.btnProducto.setActionCommand("Productos");
        this.btnReporteKardex.setActionCommand("Kardex");
    }

    public void setControlador(Controlador control){
        this.btnHome.addActionListener(control);
        this.btnProducto.addActionListener(control);
        this.btnReporteKardex.addActionListener(control);
    }
    
    public void iniciar(){
        this.setVisible(true);
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

        aside = new javax.swing.JPanel();
        modulos = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        btnReporteKardex = new newscomponents.RSButtonIcon_new();
        btnHome = new newscomponents.RSButtonIcon_new();
        btnMovimiento = new newscomponents.RSButtonIcon_new();
        btnProducto = new newscomponents.RSButtonIcon_new();
        header = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        btnMenu = new RSMaterialComponent.RSButtonIconOne();
        body = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        aside.setBackground(new java.awt.Color(42, 53, 66));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 0, 2);
        flowLayout1.setAlignOnBaseline(true);
        aside.setLayout(flowLayout1);

        modulos.setOpaque(false);
        modulos.setLayout(new java.awt.GridBagLayout());

        jLabel13.setBackground(new java.awt.Color(37, 46, 57));
        jLabel13.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("MENÚ");
        jLabel13.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jLabel13.setOpaque(true);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 202;
        gridBagConstraints.ipady = 23;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 6, 0);
        modulos.add(jLabel13, gridBagConstraints);

        btnReporteKardex.setBackground(new java.awt.Color(42, 53, 66));
        btnReporteKardex.setText("Reporte Kardex");
        btnReporteKardex.setActionCommand("Kardex");
        btnReporteKardex.setBackgroundHover(new java.awt.Color(61, 137, 248));
        btnReporteKardex.setFocusPainted(false);
        btnReporteKardex.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        btnReporteKardex.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnReporteKardex.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnReporteKardex.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.NOTE);
        btnReporteKardex.setVerifyInputWhenFocusTarget(false);
        btnReporteKardex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteKardexActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        modulos.add(btnReporteKardex, gridBagConstraints);

        btnHome.setBackground(new java.awt.Color(241, 123, 55));
        btnHome.setText("Inicio");
        btnHome.setBackgroundHover(new java.awt.Color(61, 137, 248));
        btnHome.setFocusPainted(false);
        btnHome.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        btnHome.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnHome.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnHome.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.HOME);
        btnHome.setVerifyInputWhenFocusTarget(false);
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        modulos.add(btnHome, gridBagConstraints);

        btnMovimiento.setBackground(new java.awt.Color(42, 53, 66));
        btnMovimiento.setText("Movimientos");
        btnMovimiento.setBackgroundHover(new java.awt.Color(61, 137, 248));
        btnMovimiento.setFocusPainted(false);
        btnMovimiento.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        btnMovimiento.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnMovimiento.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnMovimiento.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SETTINGS);
        btnMovimiento.setOpaque(true);
        btnMovimiento.setVerifyInputWhenFocusTarget(false);
        btnMovimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMovimientoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        modulos.add(btnMovimiento, gridBagConstraints);

        btnProducto.setBackground(new java.awt.Color(42, 53, 66));
        btnProducto.setText("Productos");
        btnProducto.setBackgroundHover(new java.awt.Color(61, 137, 248));
        btnProducto.setFocusPainted(false);
        btnProducto.setFont(new java.awt.Font("Bahnschrift", 0, 16)); // NOI18N
        btnProducto.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnProducto.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnProducto.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INBOX);
        btnProducto.setVerifyInputWhenFocusTarget(false);
        btnProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductoActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        modulos.add(btnProducto, gridBagConstraints);

        aside.add(modulos);

        getContentPane().add(aside, java.awt.BorderLayout.LINE_START);

        header.setBackground(new java.awt.Color(61, 137, 248));
        header.setLayout(new java.awt.GridBagLayout());

        jLabel10.setBackground(new java.awt.Color(61, 137, 248));
        jLabel10.setFont(new java.awt.Font("Bahnschrift", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Sistema de Control de Inventario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipady = 15;
        gridBagConstraints.weightx = 10.0;
        header.add(jLabel10, gridBagConstraints);

        btnMenu.setBackground(new java.awt.Color(61, 137, 248));
        btnMenu.setBackgroundHover(new java.awt.Color(61, 137, 248));
        btnMenu.setFocusPainted(false);
        btnMenu.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.MENU);
        btnMenu.setSizeIcon(25.0F);
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        header.add(btnMenu, gridBagConstraints);

        getContentPane().add(header, java.awt.BorderLayout.PAGE_START);

        body.setBackground(new java.awt.Color(236, 240, 245));
        body.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 20, 20, 20));
        body.setForeground(new java.awt.Color(204, 204, 204));
        body.setLayout(new javax.swing.BoxLayout(body, javax.swing.BoxLayout.LINE_AXIS));
        getContentPane().add(body, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        if(menuActived == true){
            menuActived = false;
            this.aside.setVisible(false);
        }else{
            menuActived = true;
            this.aside.setVisible(true);
        }
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnMovimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovimientoActionPerformed
//        if(opEntradas == false){
//            opEntradas = true;
//            this.btnCompraEntradas.setVisible(true);
//            this.btnDevoEntradas.setVisible(true);
//            this.btnMovimientos.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EXPAND_MORE);
//        }else{
//            opEntradas = false;
//            this.btnCompraEntradas.setVisible(false);
//            this.btnDevoEntradas.setVisible(false);
//            this.btnMovimientos.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ADD);
//        }
        resetMenu();
        this.btnMovimiento.setBackground(new Color(241,123,55));
    }//GEN-LAST:event_btnMovimientoActionPerformed

    public void resetMenu(){
        this.btnHome.setBackground(new Color(42,53,66));
        this.btnProducto.setBackground(new Color(42,53,66));
        this.btnMovimiento.setBackground(new Color(42,53,66));
        this.btnReporteKardex.setBackground(new Color(42,53,66));
    }
    
    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        resetMenu();
        this.btnHome.setBackground(new Color(241,123,55));
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductoActionPerformed
        resetMenu();
        this.btnProducto.setBackground(new Color(241,123,55));
    }//GEN-LAST:event_btnProductoActionPerformed

    private void btnReporteKardexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteKardexActionPerformed
        resetMenu();
        this.btnReporteKardex.setBackground(new Color(241,123,55));
    }//GEN-LAST:event_btnReporteKardexActionPerformed

    
//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Menu().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel aside;
    public javax.swing.JPanel body;
    public newscomponents.RSButtonIcon_new btnHome;
    private RSMaterialComponent.RSButtonIconOne btnMenu;
    private newscomponents.RSButtonIcon_new btnMovimiento;
    public newscomponents.RSButtonIcon_new btnProducto;
    public newscomponents.RSButtonIcon_new btnReporteKardex;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    public javax.swing.JPanel modulos;
    // End of variables declaration//GEN-END:variables
}
