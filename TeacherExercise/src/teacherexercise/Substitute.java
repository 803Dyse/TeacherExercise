/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teacherexercise;

import java.util.Date;

/**
 * This is the substitute sub class which extends the Teacher superclass and
 * modify all the attributes and values to fill the java class.
 *
 * @author Bilo Alejandro Martins Gonzalez
 */
public class Substitute extends Teacher {

    /**
     * This variable store the displacement price from the substitute
     */
    protected double displacement;

    /**
     * This variable store the inicial date which the teacher started teaching
     */
    protected Date initDate;

    /**
     * This method generate the pay roll from the Substitute
     */
    @Override
    protected void generatePayRoll() {
        salary = baseSalary + displacement;
    }

    /**
     * This method shows an message by the teacher saying they are teaching, in
     * this case the substitute override the method to say he is replacing a
     * java class.
     */
    @Override
    protected void teach() {
        System.out.println("Substitúo unha clase de programación en Java");
    }

    /**
     * This method return the displacement value
     *
     * @return displacement
     */
    public double getDisplacement() {
        return displacement;
    }

    /**
     * This method set the displacement value
     *
     * @param displacement
     */
    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    /**
     * This method returns the init date
     *
     * @return initDate
     */
    public Date getInitDate() {
        return initDate;
    }

    /**
     * This method sets the init date
     *
     * @param initDate
     */
    public void setInitDate(Date initDate) {
        this.initDate = initDate;
    }

    /**
     * This is the constructor from the Substitute subclass, we have the
     * constructor abstract class plus the other attributes that we asign in
     * this sub class
     *
     * @param displacement The payment of the displacement for the teacher
     * @param initDate The date which he was starting the classes
     * @param name The teacher's name
     * @param surname The teacher's surname
     * @param address The teacher's address
     * @param baseSalary The teacher's base salary
     */
    public Substitute(double displacement, Date initDate, String name, String surname, String address, double baseSalary) {
        super(name, surname, address, baseSalary);
        this.displacement = displacement;
        this.initDate = initDate;
    }

}
