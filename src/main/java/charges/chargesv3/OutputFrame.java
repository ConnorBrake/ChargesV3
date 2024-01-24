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
    private static double chargeOneDistanceSize = 0;
    private static double chargeTwoDistanceSize = 0;
    private static int pixelChangeChargeOne = 0;
    private static int pixelChangeChargeTwo = 0;
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
        timeOutput = new javax.swing.JTextField();
        distanceBetweenChargesOutput = new javax.swing.JTextField();
        forceOnChargeOneOutput = new javax.swing.JTextField();
        forceOnChargeTwoOutput = new javax.swing.JTextField();
        forwardsTime = new javax.swing.JButton();
        backwardsTime = new javax.swing.JButton();
        stopSimulation = new javax.swing.JButton();
        chargeTwo = new javax.swing.JLabel();
        chargeOne = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Time (s):");

        jLabel2.setText("Force On Charge One (N):");

        jLabel3.setText("Force On Charge Two (N):");

        jLabel4.setText("Distance (m):");

        timeOutput.setEditable(false);
        timeOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                timeOutputActionPerformed(evt);
            }
        });

        distanceBetweenChargesOutput.setEditable(false);
        distanceBetweenChargesOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                distanceBetweenChargesOutputActionPerformed(evt);
            }
        });

        forceOnChargeOneOutput.setEditable(false);
        forceOnChargeOneOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forceOnChargeOneOutputActionPerformed(evt);
            }
        });

        forceOnChargeTwoOutput.setEditable(false);
        forceOnChargeTwoOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forceOnChargeTwoOutputActionPerformed(evt);
            }
        });

        forwardsTime.setText("Forwards Time (+1ns)");
        forwardsTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forwardsTimeActionPerformed(evt);
            }
        });

        backwardsTime.setText("Backwards Time (+1ns)");
        backwardsTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backwardsTimeActionPerformed(evt);
            }
        });

        stopSimulation.setBackground(new java.awt.Color(204, 0, 51));
        stopSimulation.setText("Stop Simulation");
        stopSimulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopSimulationActionPerformed(evt);
            }
        });

        chargeTwo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprite-0001 (1).png"))); // NOI18N

        chargeOne.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Sprite-0001 (1).png"))); // NOI18N
        chargeOne.setAlignmentY(0.0F);
        chargeOne.setAutoscrolls(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(distanceBetweenChargesOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(chargeOne)
                        .addGap(231, 231, 231)
                        .addComponent(chargeTwo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(backwardsTime)
                        .addGap(75, 75, 75)
                        .addComponent(forwardsTime)
                        .addGap(91, 91, 91)
                        .addComponent(stopSimulation))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(forceOnChargeOneOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(53, 53, 53)
                                .addComponent(timeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel2)
                                .addGap(121, 121, 121)
                                .addComponent(jLabel1)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(forceOnChargeTwoOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(15, 15, 15)))))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel3)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(forceOnChargeOneOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(timeOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forceOnChargeTwoOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(distanceBetweenChargesOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(chargeOne, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(chargeTwo)
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(backwardsTime))
                            .addComponent(forwardsTime)
                            .addComponent(stopSimulation)))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void forwardsTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forwardsTimeActionPerformed
        // TODO add your handling code here:
        //Handles Number Outputs Forwards In Time
        if(time == 0)
        {
            Charges.setChargeDistance(Double.parseDouble(distanceBetweenChargesOutput.getText()));
            distancesList.add(Charges.getDistance());
            
            c1.setCharge(InputFrame.inputOne);
            c2.setCharge(InputFrame.inputTwo);
            c1.setMass();
            c2.setMass();
        }
        
        distanceSearch += 1;
        time += 0.000000001;
        c1.getNewChargeAcceleration(c1, c2);
        c1.getNewChargeVelocity(c1, c2, time, -1);
        c2.getNewChargeAcceleration(c1, c2);
        c2.getNewChargeVelocity(c1, c2,time, 1);
        //Outputs To Output Frame Components
        distanceBetweenChargesOutput.setText(Double.toString(Charges.getNewDistance(c1, c2, time, 1)));
        distancesList.add(Charges.getDistance());
        timeOutput.setText(Double.toString(time));
        forceOnChargeOneOutput.setText(Double.toString(c1.getElectricForce(c1, c2)));
        forceOnChargeTwoOutput.setText(Double.toString(c2.getElectricForce(c1, c2)));
        //Sets Screen Charge Distances
        //Sets Screen Distance of Charge One
        chargeOneDistanceSize = distancesList.get(distanceSearch) - c1.getChargeDistance(c1, c2, time, -1);
        while((int)chargeOneDistanceSize == 0)
        {
            chargeOneDistanceSize *= 10;
        }
        while((int)chargeOneDistanceSize >= 10)
        {
            chargeOneDistanceSize /= 10;
        }
        
        //Sets Screen Distance of Charge Two
        chargeTwoDistanceSize = distancesList.get(distanceSearch) - c2.getChargeDistance(c2, c1, time, 1);
        while((int)chargeTwoDistanceSize == 0)
        {
                chargeTwoDistanceSize *= 10;
        }
        while((int)chargeTwoDistanceSize >= 10)
        {
            chargeTwoDistanceSize /= 10;
        }
        if(-10 * pixelChangeChargeOne + 145 <= 10 || 10 * pixelChangeChargeTwo + 440 >= 595)
        {
            pixelChangeChargeOne = 0;
            pixelChangeChargeTwo = 0;
        }
        pixelChangeChargeOne += (int)chargeOneDistanceSize;
        pixelChangeChargeTwo += (int)chargeTwoDistanceSize;
        chargeOne.setLocation(-10 * pixelChangeChargeOne + 145, 215);
        chargeTwo.setLocation(10 * pixelChangeChargeTwo + 440, 215); 
    }//GEN-LAST:event_forwardsTimeActionPerformed

    private void backwardsTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backwardsTimeActionPerformed
        // TODO add your handling code here:
        //Handles Number Outputs Backwards In Time
        if(time > 0)
        {
            if(distanceSearch > 0)
            {
                //Outputs To Output Frame Components
                distancesList.remove(distanceSearch);
                distanceSearch -= 1;
                distanceBetweenChargesOutput.setText(Double.toString(distancesList.get(distanceSearch)));
                forceOnChargeOneOutput.setText(Double.toString(c1.getElectricForce(c1, c2)));
                forceOnChargeTwoOutput.setText(Double.toString(c2.getElectricForce(c1, c2)));
                time -= 0.000000001;
                timeOutput.setText(Double.toString(time));
                Charges.setChargeDistance(distancesList.get(distanceSearch));
                
                //Sets Screen Charge Distances
                //Sets Screen Distance of Charge One
                chargeOneDistanceSize = distancesList.get(distanceSearch) - c1.getChargeDistance(c1, c2, time, 1);
                while((int)chargeOneDistanceSize == 0)
                {
                    chargeOneDistanceSize *= 10;
                }
                while((int)chargeOneDistanceSize >= 10)
                {
                    chargeOneDistanceSize /= 10;
                }

                //Sets Screen Distance of Charge Two
                chargeTwoDistanceSize = distancesList.get(distanceSearch) - c2.getChargeDistance(c2, c1, time, -1);
                while((int)chargeTwoDistanceSize == 0)
                {
                    chargeTwoDistanceSize *= 10;
                }
                while((int)chargeTwoDistanceSize >= 10)
                {
                    chargeTwoDistanceSize /= 10;
                }
                if(pixelChangeChargeOne <= 0 || pixelChangeChargeTwo <= 0)
                {
                    pixelChangeChargeOne = 14;
                    pixelChangeChargeTwo = 14;
                }
                pixelChangeChargeOne -= (int)chargeOneDistanceSize;
                pixelChangeChargeTwo -= (int)chargeTwoDistanceSize;
                chargeOne.setLocation(-10 * pixelChangeChargeOne + 145, 215);
                chargeTwo.setLocation(10 * pixelChangeChargeTwo + 440, 215); 
            }
        }
        else
        {
            time = 0;
            timeOutput.setText(Double.toString(time));
        }
    }//GEN-LAST:event_backwardsTimeActionPerformed

    private void stopSimulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopSimulationActionPerformed
        // TODO add your handling code here:
        //Deletion of outputframe and creation of inputframe
        this.dispose();
        new InputFrame().setVisible(true);
    }//GEN-LAST:event_stopSimulationActionPerformed

    private void timeOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_timeOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_timeOutputActionPerformed

    private void forceOnChargeOneOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forceOnChargeOneOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forceOnChargeOneOutputActionPerformed

    private void forceOnChargeTwoOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forceOnChargeTwoOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forceOnChargeTwoOutputActionPerformed

    private void distanceBetweenChargesOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_distanceBetweenChargesOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_distanceBetweenChargesOutputActionPerformed

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
            public void run() {
                new OutputFrame().setVisible(true);
                //chargeOne.setLocation(0, 0);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backwardsTime;
    public static javax.swing.JLabel chargeOne;
    public static javax.swing.JLabel chargeTwo;
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
