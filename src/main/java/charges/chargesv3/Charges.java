/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package charges.chargesv3;

/**
 *
 * @author CoBra1341
 */
public class Charges {
    private double charge; 
    private static double distance;
    private double velocity;
    private double mass;
    private double force;
    private static final double kValue = 9 * Math.pow(10, 9);
    private static final double eValue = 1.602 * Math.pow(10, -19);
    private static final double cValue = 3 * Math.pow(10, 8);
    
    public Charges(double c, double v, double m)
    {
        velocity = v = 0;
        charge = c;
        mass = m = (c / eValue) * (1.67*Math.pow(10, -27));
    }
    
    //Accessor Methods
    public double getCharge()
    {
        return charge;
    }
    public double getMass()
    {
        return mass;
    }
    public double getElectricForce(Charges c1, Charges c2)
    {
        return (kValue * c1.getCharge() * c2.getCharge()) / (Math.pow(distance, 2));
    }
    public double getCurrentChargeVelocity()
    {
        return velocity;
    }
    public double getNewChargeAcceleration(Charges c1, Charges c2)
    {
        return ((kValue * c1.getCharge() * c2.getCharge()) / (Math.pow(distance, 2))) / getMass();
    }
    public double getNewChargeVelocity(Charges c1,  Charges c2, double t)
    {
        velocity = (getNewChargeAcceleration(c1, c2) * t + getCurrentChargeVelocity());
        return velocity; 
    }
    public static double getNewDistance(Charges c1, Charges c2, double t)
    {
        double distanceOfChargeOne = (c1.getCurrentChargeVelocity() * t) + (0.5 * c1.getNewChargeAcceleration(c1, c2) * Math.pow(t, 2));
        double distanceOfChargeTwo = (c2.getCurrentChargeVelocity() * t) + (0.5 * c2.getNewChargeAcceleration(c1, c2) * Math.pow(t, 2));
        distance = distanceOfChargeOne + distanceOfChargeTwo + distance;
        return distance;
    }
    
    //Mutator Methods
    public static double setChargeDistance(double r) //Must be positive and not exactly 0
    {
        distance = r;
        return distance;
    }
    public double setCharge(double c) //Must be positive and not exactly 0
    {
        charge = c;
        return charge;
    }
    public double setMass()
    {
        mass = (getCharge() / eValue) * (1.67*Math.pow(10, -27));
        return mass;
    }
//    public static double setChargeVelocity(Charges c1, Charges c2, double r, double m) //Must use after charge instatiation and initialization
//    {
//        velocity = Math.sqrt(2 * ((kValue * c1.getCharge() * c2.getCharge()) / r) / (0.5 * m));
//        return velocity;
//    }
}
