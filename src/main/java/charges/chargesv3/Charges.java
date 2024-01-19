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
    private static double initialDistance;
    private double velocity;
    private double mass;
    private double direction;
    private double force;
    private static final double kValue = 9 * Math.pow(10, 9);
    private static final double eValue = 1.602 * Math.pow(10, -19);
    private static final double cValue = 3 * Math.pow(10, 8);
    
    /**
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
     *
     * @return
     */
    public double getDirection()
    {
        return direction;
    }

    /**
     *
     * @return
     */
    public double getCharge()
    {
        return charge;
    }

    /**
     *
     * @return
     */
    public double getMass()
    {
        return mass;
    }

    /**
     *
     * @param c1
     * @param c2
     * @return
     */
    public double getElectricForce(Charges c1, Charges c2)
    {
        return (kValue * c1.getCharge() * c2.getCharge()) / (Math.pow(distance, 2));
    }

    /**
     *
     * @return
     */
    public double getCurrentChargeVelocity()
    {
        return velocity;
    }

    /**
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
     *
     * @param c1
     * @param c2
     * @param dist
     * @param t
     * @return
     */
    public double getNewChargeVelocity(Charges c1,  Charges c2, double dist,double t)
    {
        velocity = getNewChargeAcceleration(c1, c2) * t + getCurrentChargeVelocity();
        return velocity; 
    } 

    /**
     *
     * @param c1
     * @param c2
     * @param t
     * @param a
     * @return
     */
    public static double getNewDistance(Charges c1, Charges c2, double t, double a)
    {
        double distanceOfChargeOne = a * ((c1.getCurrentChargeVelocity() * t) + (0.5 * c1.getNewChargeAcceleration(c1, c2) * Math.pow(t, 2)));
        double distanceOfChargeTwo = a * ((c2.getCurrentChargeVelocity() * t) + (0.5 * c2.getNewChargeAcceleration(c1, c2) * Math.pow(t, 2)));
        distance = (distanceOfChargeOne + distanceOfChargeTwo) + distance;
        return distance;
    }

    /**
     *
     * @return
     */
    public static double getDistance()
    {
        return distance;
    }

    /**
     *
     * @param c1
     * @param c2
     * @param t
     * @return
     */
    public Double getChargeDistance(Charges c1, Charges c2, double dist, double t)
    {
        double distanceOfCharge = ((getNewChargeVelocity(c1, c2, dist, t) * t) + (0.5 * getNewChargeAcceleration(c1, c2) * Math.pow(t, 2)));
        System.out.println(getNewChargeVelocity(c1, c2, dist, t));
        return distanceOfCharge + (initialDistance / 2);
    }
    
    //Mutator Methods

    /**
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
     *
     * @return
     */
    public double setMass()
    {
        mass = (getCharge() / eValue) * (1.67*Math.pow(10, -27));
        return mass;
    }
}
