
package vistas.modulos;

public class Home extends javax.swing.JPanel {

    public Home() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        header = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        article1 = new javax.swing.JPanel();
        barChart = new javax.swing.JPanel();
        pChart = new javax.swing.JPanel();

        setOpaque(false);
        setLayout(new java.awt.BorderLayout());

        header.setOpaque(false);
        header.setLayout(new java.awt.GridBagLayout());

        jLabel3.setBackground(new java.awt.Color(51, 51, 51));
        jLabel3.setFont(new java.awt.Font("Bahnschrift", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(42, 53, 66));
        jLabel3.setText("Inicio / Panel de Control");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 10.0;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 15, 0);
        header.add(jLabel3, gridBagConstraints);

        add(header, java.awt.BorderLayout.PAGE_START);

        article1.setBackground(new java.awt.Color(255, 255, 255));
        article1.setOpaque(false);
        article1.setLayout(new javax.swing.BoxLayout(article1, javax.swing.BoxLayout.LINE_AXIS));

        barChart.setOpaque(false);
        barChart.setLayout(new java.awt.GridBagLayout());

        pChart.setBackground(new java.awt.Color(255, 255, 255));
        pChart.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 0, 0, 0, new java.awt.Color(241, 123, 55)));
        pChart.setLayout(new javax.swing.BoxLayout(pChart, javax.swing.BoxLayout.LINE_AXIS));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        barChart.add(pChart, gridBagConstraints);

        article1.add(barChart);

        add(article1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel article1;
    public javax.swing.JPanel barChart;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel pChart;
    // End of variables declaration//GEN-END:variables
}
