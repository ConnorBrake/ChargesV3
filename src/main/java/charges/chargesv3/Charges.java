/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package charges.chargesv3;

/**
 * Methods For Creating Point Charges
 * 
 * @author CoBra1341
 */
public class Charges {
    private double charge; 
    private static double distance;
    private static double initialDistance;
    private static double distanceOfChargeOne = 0;
    private static double distanceOfChargeTwo = 0;
    private double distanceOfCharge = 0;
    private double velocity;
    private double mass;
    private double direction;
    private double force;
    private static final double kValue = 9 * Math.pow(10, 9);
    private static final double eValue = 1.602 * Math.pow(10, -19);
    private static final double cValue = 3 * Math.pow(10, 8);
    
    /**
     * The Charge Constructor 
     * 
     * @param c
     * @param v
     * @param m
     */
    public Charges(double c, double v, double m)
    {
        velocity = v = 0;
        charge = c;
        mass = m = (c / eValue) * (1.67*Math.pow(10, -27));
    }
    
    //Accessor Methods

    /**
     * Returns the Charge of A Point Charge
     *
     * @return
     */
    public double getCharge()
    {
        return charge;
    }

    /**
     * Returns The Mass of A Point Charge
     * 
     * @return
     */
    public double getMass()
    {
        return mass;
    }

    /**
     * Returns The Present Electric Force On A Point Charge
     * 
     * @param c1
     * @param c2
     * @return
     */
    public double getElectricForce(Charges c1, Charges c2)
    {
        return (kValue * c1.getCharge() * c2.getCharge()) / (Math.pow(getDistance(), 2));
    }

    /**
     * Returns The Current Velocity of A Point Charge
     *
     * @return
     */
    public double getCurrentChargeVelocity()
    {
        return velocity;
    }

    /**
     * Returns The Acceleration of A Point Charge
     * 
     * @param c1
     * @param c2
     * @return
     */
    public double getNewChargeAcceleration(Charges c1, Charges c2)
    {
        return (getElectricForce(c1, c2)) / getMass();
    }

    /**
     * Returns The New Velocity of A Point Charge
     * 
     * @param c1
     * @param c2
     * @param d
     * @return
     */
    public double getNewChargeVelocity(Charges c1,  Charges c2, double d)
    {
        velocity = ((d * getNewChargeAcceleration(c1, c2)) * 0.000000001) + getCurrentChargeVelocity();
        return velocity; 
    }

    /**
     * Returns The New Distance of A Point Charge
     * 
     * @param c1
     * @param c2
     * @param a
     * @return
     */
    public static double getNewDistance(Charges c1, Charges c2, double a)
    {
        distanceOfChargeOne += Math.abs((c1.getCurrentChargeVelocity() * 0.000000001) + (0.5 * a * Math.pow(0.000000001, 2)));
        distanceOfChargeTwo += Math.abs((c2.getCurrentChargeVelocity() * 0.000000001) + (0.5 * a * Math.pow(0.000000001, 2)));
        distance += distanceOfChargeOne + distanceOfChargeTwo;
        return distance;
    }

    /**
     * Returns The Present Distance of A Point Charge
     * 
     * @return
     */
    public static double getDistance()
    {
        return distance;
    }

    /**
     * Returns The New Distance of A Point Charge
     * 
     * @param c1
     * @param c2
     * @param a
     * @param d
     * @return
     */
    public Double getChargeDistance(Charges c1, Charges c2, double a ,double d)
    {
        distanceOfCharge += (d * ((c2.getCurrentChargeVelocity()) * 0.000000001)) + (0.5 * a * Math.pow(0.000000001, 2));
        return distanceOfCharge + (initialDistance / 2);
    }
    
    //Mutator Methods

    /**
     * Sets The Distance Between Two Point Charges
     * 
     * @param r
     * @return
     */
    public static double setChargeDistance(double r) //Must be positive and not exactly 0
    {
        distance = r;
        initialDistance = distance;
        return distance;
    }

    /**
     * Sets The Charge of A Particular Point Charge
     * 
     * @param c
     * @return
     */
    public double setCharge(double c) //Must be positive and not exactly 0
    {
        charge = c;
        return charge;
    }

    /**
     * Sets The Mass of A Point Charge Based On Its Charge, and Only Protons Being Allowed
     * 
     * @return
     */
    public double setMass()
    {
        mass = (getCharge() / eValue) * (1.67*Math.pow(10, -27));
        return mass;
    }
}