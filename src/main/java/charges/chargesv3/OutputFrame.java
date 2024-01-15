<<<<<<< Updated upstream
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package charges.chargesv3;

import java.util.ArrayList;
/**
 *
 * @author CoBra1341
 */
public class OutputFrame extends javax.swing.JFrame {
    public static double time = 0;
    private static int distanceSearch = 0;
    ArrayList<Double> distancesList = new ArrayList<>();
    Charges c1 = new Charges(InputFrame.inputOne, 0, 0);
    Charges c2 = new Charges(InputFrame.inputTwo, 0, 0);
    
    /**
     * Creates new form OutputFrame
     */
    public OutputFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        forceOnChargeOneOutput = new javax.swing.JTextField();
        forceOnChargeTwoOutput = new javax.swing.JTextField();
        timeOutput = new javax.swing.JTextField();
        distanceBetweenChargesOutput = new javax.swing.JTextField();
        stopSimulation = new javax.swing.JButton();
        forwardsTime = new javax.swing.JButton();
        backwardsTime = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Time (ns):");

        jLabel2.setText("Distance Between Charges (m):");

        jLabel3.setText("Force On Charge One (N):");

        jLabel4.setText("Force On Charge Two (N):");

        forceOnChargeOneOutput.setEditable(false);
        forceOnChargeOneOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forceOnChargeOneOutputActionPerformed(evt);
            }
        });

        forceOnChargeTwoOutput.setEditable(false);

        timeOutput.setEditable(false);
        timeOutput.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        timeOutput.setFocusable(false);

        distanceBetweenChargesOutput.setEditable(false);
        distanceBetweenChargesOutput.setAutoscrolls(false);
        distanceBetweenChargesOutput.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        stopSimulation.setBackground(new java.awt.Color(255, 51, 51));
        stopSimulation.setText("Stop Simulation");
        stopSimulation.setBorderPainted(false);
        stopSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopSimulationActionPerformed(evt);
            }
        });

        forwardsTime.setText("Forwards Time (+1ns)");
        forwardsTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardsTimeActionPerformed(evt);
            }
        });

        backwardsTime.setText("Backwards Time (-1ns)");
        backwardsTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backwardsTimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backwardsTime)
                            .addComponent(forceOnChargeOneOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(timeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(forceOnChargeTwoOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(59, 59, 59))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(distanceBetweenChargesOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(forwardsTime)
                        .addGap(124, 124, 124)
                        .addComponent(stopSimulation)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forceOnChargeOneOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forceOnChargeTwoOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeOutput))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(distanceBetweenChargesOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stopSimulation)
                    .addComponent(forwardsTime)
                    .addComponent(backwardsTime))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void forceOnChargeOneOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forceOnChargeOneOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forceOnChargeOneOutputActionPerformed

    private void stopSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopSimulationActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new InputFrame().setVisible(true);
    }//GEN-LAST:event_stopSimulationActionPerformed

    private void forwardsTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardsTimeActionPerformed
        // TODO add your handling code here:
        //Handles Number Outputs Forwards In Time
        if(time == 0)
        {
            c1.setChargeDistance(Double.parseDouble(distanceBetweenChargesOutput.getText()));
            distancesList.add(c1.getDistance());

            c1.setCharge(InputFrame.inputOne);
            c2.setCharge(InputFrame.inputTwo);
            c1.setMass();
            c2.setMass();
        }
        distanceSearch += 1;
        System.out.println(distanceSearch);
        time += 0.000000001;
        
        c1.getNewChargeAcceleration(c1, c2);
        c1.getNewChargeVelocity(c1, c2, time);
        c2.getNewChargeAcceleration(c1, c2);
        c2.getNewChargeVelocity(c1, c2, time);
        distanceBetweenChargesOutput.setText(Double.toString(c1.getNewDistance(c1, c2, time, 1)));
        distancesList.add(c1.getDistance());
        timeOutput.setText(Double.toString(time));
        forceOnChargeOneOutput.setText(Double.toString(c1.getElectricForce(c1, c2)));
        forceOnChargeTwoOutput.setText(Double.toString(c2.getElectricForce(c1, c2)));
    }//GEN-LAST:event_forwardsTimeActionPerformed

    private void backwardsTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backwardsTimeActionPerformed
        // TODO add your handling code here:
        //Handles Number Outputs Backwards In Time
        if(time > 0)
        {
            if(distanceSearch > 0)
            {
                distancesList.remove(distanceSearch);
                distanceSearch -= 1;
                distancesList.get(distanceSearch);
                distanceBetweenChargesOutput.setText(Double.toString(distancesList.get(distanceSearch)));
                Charges.setChargeDistance(Double.parseDouble(distanceBetweenChargesOutput.getText()));
                
                forceOnChargeOneOutput.setText(Double.toString(c1.getElectricForce(c1, c2)));
                forceOnChargeTwoOutput.setText(Double.toString(c2.getElectricForce(c1, c2)));
            }
            time -= 0.000000001;
            timeOutput.setText(Double.toString(time));
        }
    }//GEN-LAST:event_backwardsTimeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //forceOnChargeOneOutput.setText(Double.toString(InputFrame.getChargeInputOne()));
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
            java.util.logging.Logger.getLogger(OutputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OutputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OutputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OutputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OutputFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backwardsTime;
    public static javax.swing.JTextField distanceBetweenChargesOutput;
    public static javax.swing.JTextField forceOnChargeOneOutput;
    public static javax.swing.JTextField forceOnChargeTwoOutput;
    private javax.swing.JButton forwardsTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton stopSimulation;
    public static javax.swing.JTextField timeOutput;
    // End of variables declaration//GEN-END:variables
}
=======
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package charges.chargesv3;

import java.util.ArrayList;
/**
 *
 * @author CoBra1341
 */
public class OutputFrame extends javax.swing.JFrame {
    public static double time = 0;
    private static int distanceSearch = 0;
    ArrayList<Double> distancesList = new ArrayList<>();
    Charges c1 = new Charges(InputFrame.inputOne, 0, 0);
    Charges c2 = new Charges(InputFrame.inputTwo, 0, 0);
    
    /**
     * Creates new form OutputFrame
     */
    public OutputFrame() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        forceOnChargeOneOutput = new javax.swing.JTextField();
        forceOnChargeTwoOutput = new javax.swing.JTextField();
        timeOutput = new javax.swing.JTextField();
        distanceBetweenChargesOutput = new javax.swing.JTextField();
        stopSimulation = new javax.swing.JButton();
        forwardsTime = new javax.swing.JButton();
        backwardsTime = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Time (ns):");

        jLabel2.setText("Distance Between Charges (m):");

        jLabel3.setText("Force On Charge One (N):");

        jLabel4.setText("Force On Charge Two (N):");

        forceOnChargeOneOutput.setEditable(false);
        forceOnChargeOneOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forceOnChargeOneOutputActionPerformed(evt);
            }
        });

        forceOnChargeTwoOutput.setEditable(false);

        timeOutput.setEditable(false);
        timeOutput.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        timeOutput.setFocusable(false);

        distanceBetweenChargesOutput.setEditable(false);
        distanceBetweenChargesOutput.setAutoscrolls(false);
        distanceBetweenChargesOutput.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        stopSimulation.setBackground(new java.awt.Color(255, 51, 51));
        stopSimulation.setText("Stop Simulation");
        stopSimulation.setBorderPainted(false);
        stopSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopSimulationActionPerformed(evt);
            }
        });

        forwardsTime.setText("Forwards Time (+1ns)");
        forwardsTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardsTimeActionPerformed(evt);
            }
        });

        backwardsTime.setText("Backwards Time (-1ns)");
        backwardsTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backwardsTimeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backwardsTime)
                            .addComponent(forceOnChargeOneOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(timeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(forceOnChargeTwoOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(59, 59, 59))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(distanceBetweenChargesOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(278, 278, 278))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(forwardsTime)
                        .addGap(124, 124, 124)
                        .addComponent(stopSimulation)
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forceOnChargeOneOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forceOnChargeTwoOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeOutput))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(distanceBetweenChargesOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(181, 181, 181)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(stopSimulation)
                    .addComponent(forwardsTime)
                    .addComponent(backwardsTime))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void forceOnChargeOneOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forceOnChargeOneOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forceOnChargeOneOutputActionPerformed

    private void stopSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopSimulationActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new InputFrame().setVisible(true);
    }//GEN-LAST:event_stopSimulationActionPerformed

    private void forwardsTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardsTimeActionPerformed
        // TODO add your handling code here:
        //Handles Number Outputs Forwards In Time
        if(time == 0)
        {
            c1.setChargeDistance(Double.parseDouble(distanceBetweenChargesOutput.getText()));
            distancesList.add(c1.getDistance());

            c1.setCharge(InputFrame.inputOne);
            c2.setCharge(InputFrame.inputTwo);
            c1.setMass();
            c2.setMass();
        }
        distanceSearch += 1;
        System.out.println(distanceSearch);
        time += 0.000000001;
        
        c1.getNewChargeAcceleration(c1, c2);
        c1.getNewChargeVelocity(c1, c2, time);
        c2.getNewChargeAcceleration(c1, c2);
        c2.getNewChargeVelocity(c1, c2, time);
        distanceBetweenChargesOutput.setText(Double.toString(c1.getNewDistance(c1, c2, time, 1)));
        distancesList.add(c1.getDistance());
        timeOutput.setText(Double.toString(time));
        forceOnChargeOneOutput.setText(Double.toString(c1.getElectricForce(c1, c2)));
        forceOnChargeTwoOutput.setText(Double.toString(c2.getElectricForce(c1, c2)));
    }//GEN-LAST:event_forwardsTimeActionPerformed

    private void backwardsTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backwardsTimeActionPerformed
        // TODO add your handling code here:
        //Handles Number Outputs Backwards In Time
        if(time > 0)
        {
            if(distanceSearch > 0)
            {
                distancesList.remove(distanceSearch);
                distanceSearch -= 1;
                distancesList.get(distanceSearch);
                distanceBetweenChargesOutput.setText(Double.toString(distancesList.get(distanceSearch)));
                Charges.setChargeDistance(Double.parseDouble(distanceBetweenChargesOutput.getText()));
                
                forceOnChargeOneOutput.setText(Double.toString(c1.getElectricForce(c1, c2)));
                forceOnChargeTwoOutput.setText(Double.toString(c2.getElectricForce(c1, c2)));
            }
            time -= 0.000000001;
            timeOutput.setText(Double.toString(time));
        }
    }//GEN-LAST:event_backwardsTimeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //forceOnChargeOneOutput.setText(Double.toString(InputFrame.getChargeInputOne()));
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
            java.util.logging.Logger.getLogger(OutputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OutputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OutputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OutputFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new OutputFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backwardsTime;
    public static javax.swing.JTextField distanceBetweenChargesOutput;
    public static javax.swing.JTextField forceOnChargeOneOutput;
    public static javax.swing.JTextField forceOnChargeTwoOutput;
    private javax.swing.JButton forwardsTime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton stopSimulation;
    public static javax.swing.JTextField timeOutput;
    // End of variables declaration//GEN-END:variables
}
>>>>>>> Stashed changes
