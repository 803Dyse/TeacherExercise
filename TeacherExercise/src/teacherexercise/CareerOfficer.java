/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teacherexercise;

/**
 * This is the CareerOfficer sub class which extends the Teacher superclass and
 * modify all the attributes and values to fill the java class.
 *
 * @author Bilo Alejandro Martins Gonzalez
 */
public class CareerOfficer extends Teacher {

    /**
     * This variable store the officer's complement.
     */
    protected double officerComplement;

    /**
     * This variable stores the year of completion of the opposition
     */
    protected int oppositionYear;

    /**
     * This variable stores the opposition place
     */
    protected String oppositionPlace;

    /**
     * This method get the base salary plus the other payment from the teacher
     * and generate the salary
     */
    @Override

    protected void generatePayRoll() {
        salary = baseSalary + officerComplement;
    }

    /**
     * This method returns the officer complement
     *
     * @return officerComplement
     */
    public double getOfficerComplement() {
        return officerComplement;
    }

    /**
     * This method sets the officer complement
     *
     * @param officerComplement
     */
    public void setOfficerComplement(double officerComplement) {
        this.officerComplement = officerComplement;
    }

    /**
     * This method returns the opposition year
     *
     * @return oppositionYear
     */
    public int getOppositionYear() {
        return oppositionYear;
    }

    /**
     * This method set the opposition year
     *
     * @param oppositionYear
     */
    public void setOppositionYear(int oppositionYear) {
        this.oppositionYear = oppositionYear;
    }

    /**
     * This method return the opposition place
     *
     * @return oppositionPlace
     */
    public String getOppositionPlace() {
        return oppositionPlace;
    }

    /**
     * This method sets the opposition place which the teacher finished
     *
     * @param oppositionPlace
     */
    public void setOppositionPlace(String oppositionPlace) {
        this.oppositionPlace = oppositionPlace;
    }

    /**
     * This is the constructor from the CareerOfficer subclass, we have the
     * constructor abstract class plus the other attributes that we asign in
     * this sub class for the career officer teacher.
     *
     * @param officerComplement Salary supplement received by the teacher
     * @param oppositionYear The year in which he completed the competitive
     * examinations
     * @param oppositionPlace place where the teacher completed the competitive
     * examinations
     * @param name The teacher's name
     * @param surname The teacher's surname
     * @param address The teacher's address
     * @param baseSalary The teacher's base salary
     */
    public CareerOfficer(double officerComplement, int oppositionYear, String oppositionPlace, String name, String surname, String address, double baseSalary) {
        super(name, surname, address, baseSalary);
        this.officerComplement = officerComplement;
        this.oppositionYear = oppositionYear;
        this.oppositionPlace = oppositionPlace;
    }

}