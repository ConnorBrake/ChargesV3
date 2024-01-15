/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package charges.chargesv3;

/**
 *
 * @author CoBra1341
 */
public class InputFrame extends javax.swing.JFrame {
    public static double inputOne;
    public static double inputTwo;
    public static double inputThree = 0;
    
    OutputFrame outputFrame = new OutputFrame();
    /**
     * Creates new form InputFrame
     */
    public InputFrame() {
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

        errorThree = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        chargeOneInput = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        chargeTwoInput = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        distanceInput = new javax.swing.JTextField();
        runSimulation = new javax.swing.JButton();
        errorOne = new javax.swing.JLabel();
        errorTwo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        errorThree.setForeground(new java.awt.Color(255, 0, 51));
        errorThree.setText("(The Input Must Be A Positive (Not Zero) Number) ");
        getContentPane().add(errorThree, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 707, 19));

        jLabel1.setText("Charge of Charge One (C):");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 151, 16));

        chargeOneInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chargeOneInputActionPerformed(evt);
            }
        });
        getContentPane().add(chargeOneInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, 105, -1));

        jLabel2.setText("Charge of Charge Two (C):");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 154, 20));

        chargeTwoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chargeTwoInputActionPerformed(evt);
            }
        });
        getContentPane().add(chargeTwoInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 105, -1));

        jLabel3.setText("Distance Between Charges (m):");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 16));

        distanceInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distanceInputActionPerformed(evt);
            }
        });
        getContentPane().add(distanceInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 105, -1));

        runSimulation.setText("Run Simulation");
        runSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runSimulationActionPerformed(evt);
            }
        });
        getContentPane().add(runSimulation, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 220, -1, -1));

        errorOne.setForeground(new java.awt.Color(255, 0, 51));
        errorOne.setText("(The Input Must Be A Positive (Not Zero) Number) ");
        getContentPane().add(errorOne, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 16));

        errorTwo.setForeground(new java.awt.Color(255, 0, 51));
        errorTwo.setText("(The Input Must Be A Positive (Not Zero) Number) ");
        errorTwo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                errorTwoComponentHidden(evt);
            }
        });
        getContentPane().add(errorTwo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 469, 18));

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\1337\\Downloads\\SchoolThing2 (2).png")); // NOI18N
        jLabel4.setAlignmentX(0.5F);
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 330, 120));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void chargeOneInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chargeOneInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chargeOneInputActionPerformed

    private void chargeTwoInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chargeTwoInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chargeTwoInputActionPerformed

    private void distanceInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distanceInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_distanceInputActionPerformed

    private void runSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_runSimulationActionPerformed
        // TODO add your handling code here:
        try{
            inputOne = Double.parseDouble(chargeOneInput.getText());
            errorOne.setVisible(false);
        }
        catch (NumberFormatException e){
            inputOne = 0;
            errorOne.setVisible(true);
        }
        if(inputOne <= 0)
        {
            errorOne.setVisible(true);
        }
        try{
            inputTwo = Double.parseDouble(chargeTwoInput.getText());
            errorTwo.setVisible(false);
        }
        catch (NumberFormatException e){
            inputTwo = 0;
            errorTwo.setVisible(true);
        }
        if(inputTwo <= 0)
        {
            errorTwo.setVisible(true);
        }
        try{
            inputThree = Double.parseDouble(distanceInput.getText());
            errorThree.setVisible(false);
        }
        catch (NumberFormatException e){
            inputThree = 0;
            errorThree.setVisible(true);
        }
        if(inputThree <= 0)
        {
            errorThree.setVisible(true);
        }
        if(inputThree <= 0 || inputTwo <= 0 || inputOne <= 0)
        {
            return;
        }
        this.dispose();
        new OutputFrame().setVisible(true);
        
        OutputFrame.forceOnChargeOneOutput.setText(Double.toString(inputOne));
        OutputFrame.forceOnChargeTwoOutput.setText(Double.toString(inputTwo));
        OutputFrame.distanceBetweenChargesOutput.setText(Double.toString(inputThree));
        OutputFrame.timeOutput.setText(Double.toString(0));
    }//GEN-LAST:event_runSimulationActionPerformed
    
    private void errorTwoComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_errorTwoComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_errorTwoComponentHidden

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
            java.util.logging.Logger.getLogger(InputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new InputFrame().setVisible(true);
                errorOne.setVisible(false);
                errorTwo.setVisible(false);
                errorThree.setVisible(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField chargeOneInput;
    private javax.swing.JTextField chargeTwoInput;
    private javax.swing.JTextField distanceInput;
    private static javax.swing.JLabel errorOne;
    private static javax.swing.JLabel errorThree;
    private static javax.swing.JLabel errorTwo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton runSimulation;
    // End of variables declaration//GEN-END:variables
}
