/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package charges.chargesv3;

/**
 *
 * @author CoBra1341
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Charges c1 = new Charges(1.602 * Math.pow(10, -19), 0, 0);
        Charges c2 = new Charges(1.602 * Math.pow(10, -19), 0, 0);
        double distance = Charges.setChargeDistance(0.0001);
        System.out.println("Initial Distance Between Charges = " + distance);
        System.out.println("Mass of c1 = " + c1.getMass());
        System.out.println("Mass of c2 = " + c2.getMass());
//        System.out.println("Initial Velocity of c1 = " + c1.setChargeVelocity(c1, c2, distance, c1.getMass()));
//        System.out.println("Initial Velocity of c2 = " + c2.setChargeVelocity(c1, c2, distance, c2.getMass()));
        System.out.println("Initial Acceleration of c1 = " + c1.getNewChargeAcceleration(c1, c2));
        System.out.println("Initial Acceleration of c2 = " + c2.getNewChargeAcceleration(c1, c2));
        
        for(double t = 0; t < 0.000001000; t += 0.000000001)
        {
            System.out.println("*" + distance + " *" + t);
            double dist = c1.getNewDistance(c1, c2, t);
            distance = dist;
            double vel = c1.getNewChargeVelocity(c1, c2, distance, c1.getCurrentChargeVelocity(), t);
//            System.out.println("*" + c1.getElectricForce(c1, c2, distance) + " *" + t);
//            System.out.println("*" + c1.getNewChargeAcceleration(c1, c2) + " *" + t);
//            System.out.println("*" + c1.getCurrentChargeVelocity() + " *" + t);
        }
    }
}

