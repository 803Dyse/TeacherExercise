/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teacherexercise;

/**
 * This is the Interim sub class which extends the Teacher superclass and modify
 * all the attributes and values to fill the java class.
 *
 * @author Bilo Alejandro Martins Gonzalez
 */
public class Interim extends Teacher {

    /**
     * This variable store the interim complement
     */
    protected double interimComplement;

    /**
     * This variable store the destination from the teacher
     */
    protected String destination;

    /**
     * This method generate the Pay roll from the teacher
     */
    @Override
    protected void generatePayRoll() {
        salary = baseSalary + interimComplement;
    }

    /**
     * This method returns the interim complement
     *
     * @return interimComplement
     */
    public double getInterimComplement() {
        return interimComplement;
    }

    /**
     * This method its to set the interim complement
     *
     * @param interimComplement
     */
    public void setInterimComplement(double interimComplement) {
        this.interimComplement = interimComplement;
    }

    /**
     * This method returns the destination
     *
     * @return destination
     */
    public String getDestination() {
        return destination;
    }

    /**
     * This method let set the destination
     *
     * @param destination
     */
    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * This is the constructor from the Interim subclass, we have the
     * constructor abstract class plus the other attributes that we asign in
     * this sub class for the interim teacher.
     *
     * @param interimComplement Salary supplement received by the teacher
     * @param destination The destination's address
     * @param name The teacher's name
     * @param surname The teacher's surname
     * @param address The teacher's address
     * @param baseSalary The teacher's base salary
     */
    public Interim(double interimComplement, String destination, String name, String surname, String address, double baseSalary) {
        super(name, surname, address, baseSalary);
        this.interimComplement = interimComplement;
        this.destination = destination;
    }

}
