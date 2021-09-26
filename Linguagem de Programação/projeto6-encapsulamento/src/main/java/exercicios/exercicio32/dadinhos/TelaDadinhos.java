package exercicios.exercicio32.dadinhos;

/*
 * @author Luiz Carlos Dinani
 */
public class TelaDadinhos extends javax.swing.JFrame {

    /**
     * Creates new form TelaDadinhos
     */
    public TelaDadinhos() {
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

        btnSortear = new javax.swing.JButton();
        lblDado1 = new javax.swing.JLabel();
        lblDado2 = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        lblVitoriasDado1 = new javax.swing.JLabel();
        lblVitoriasDado2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnSortear.setText("Sortear Dadinhos");
        btnSortear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSortearActionPerformed(evt);
            }
        });

        lblDado1.setText("Dadinho 1: ");

        lblDado2.setText("Dadinho 2: ");

        lblResultado.setText("Resultado: ");

        lblVitoriasDado1.setText("Vitórias do  Dadinho 1: 0");

        lblVitoriasDado2.setText("Vitórias do Dadinho 2: 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblDado1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblDado2)
                .addGap(74, 74, 74))
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVitoriasDado1)
                    .addComponent(lblResultado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(lblVitoriasDado2)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnSortear)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDado1)
                    .addComponent(lblDado2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(lblResultado)
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVitoriasDado1)
                    .addComponent(lblVitoriasDado2))
                .addGap(42, 42, 42)
                .addComponent(btnSortear)
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        Dadinho dado1 = new Dadinho();
        Dadinho dado2 = new Dadinho();                

    private void btnSortearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSortearActionPerformed
        
        dado1.sortear();
        dado2.sortear();
        
        lblDado1.setText("Dadinho 1: " + dado1.getNumSorteado().toString());
        lblDado2.setText("Dadinho 2: " + dado2.getNumSorteado().toString());
        
        if(dado1.getNumSorteado()>dado2.getNumSorteado()){
            dado1.darVitoria();                                    
            lblResultado.setText("Resultado: O dadinho 1 venceu");
            lblVitoriasDado1.setText("Vitorias do dadinho 1: " + dado1.getVitorias());
            lblVitoriasDado2.setText("Vitorias do dadinho 2: " + dado2.getVitorias());            
        }else if(dado2.getNumSorteado()>dado1.getNumSorteado()){
            dado2.darVitoria();                        
            lblResultado.setText("Resultado: O dadinho 2 venceu");
            lblVitoriasDado1.setText("Vitorias do dadinho 1: " + dado1.getVitorias());
            lblVitoriasDado2.setText("Vitorias do dadinho 2: " + dado2.getVitorias());
        }else{                                    
            lblResultado.setText("Resultado: Empate");
            lblVitoriasDado1.setText("Vitorias do dadinho 1: " + dado1.getVitorias());
            lblVitoriasDado2.setText("Vitorias do dadinho 2: " + dado2.getVitorias());
        }
    }//GEN-LAST:event_btnSortearActionPerformed

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
            java.util.logging.Logger.getLogger(TelaDadinhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDadinhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDadinhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDadinhos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDadinhos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSortear;
    private javax.swing.JLabel lblDado1;
    private javax.swing.JLabel lblDado2;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblVitoriasDado1;
    private javax.swing.JLabel lblVitoriasDado2;
    // End of variables declaration//GEN-END:variables
}
