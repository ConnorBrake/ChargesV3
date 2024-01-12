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
    private static double cOne;
    private static double cTwo;
    private static double dist;
    private double inputOne = 0;
    private double inputTwo = 0;
    private double inputThree = 0;
    
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        errorThree.setForeground(new java.awt.Color(255, 0, 51));
        errorThree.setText("(The Input Must Be A Positive (Not Zero) Number) ");

        jLabel1.setText("Charge of Charge One (C):");

        chargeOneInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chargeOneInputActionPerformed(evt);
            }
        });

        jLabel2.setText("Charge of Charge Two (C):");

        chargeTwoInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chargeTwoInputActionPerformed(evt);
            }
        });

        jLabel3.setText("Distance Between Charges (m):");

        distanceInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distanceInputActionPerformed(evt);
            }
        });

        runSimulation.setText("Run Simulation");
        runSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                runSimulationActionPerformed(evt);
            }
        });

        errorOne.setForeground(new java.awt.Color(255, 0, 51));
        errorOne.setText("(The Input Must Be A Positive (Not Zero) Number) ");

        errorTwo.setForeground(new java.awt.Color(255, 0, 51));
        errorTwo.setText("(The Input Must Be A Positive (Not Zero) Number) ");
        errorTwo.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                errorTwoComponentHidden(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(errorOne))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(runSimulation)))
                .addGap(228, 228, 228))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chargeOneInput, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(chargeTwoInput, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(errorTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(distanceInput, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(errorThree, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(109, 109, 109)))
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(chargeOneInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorOne, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(chargeTwoInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorTwo, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(distanceInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errorThree, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(runSimulation)
                .addGap(42, 42, 42))
        );

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

        this.setVisible(false);
        outputFrame.setVisible(true);
        OutputFrame.forceOnChargeOneOutput.setText(Double.toString(inputOne));
        OutputFrame.forceOnChargeTwoOutput.setText(Double.toString(inputTwo));
        OutputFrame.distanceBetweenChargesOutput.setText(Double.toString(inputThree));
    }//GEN-LAST:event_runSimulationActionPerformed
    //Varible Transfer Methods
    
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
    private javax.swing.JButton runSimulation;
    // End of variables declaration//GEN-END:variables
}
