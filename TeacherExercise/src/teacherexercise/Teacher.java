/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teacherexercise;

/**
 *
 * @author Bilo Alejandro Martins Gonzalez
 */
public abstract class Teacher {

    /**
     * This variable store the teacher's name
     */
    protected String name,
            /**
             * This variable store the teacher's surname
             */
            surname,
            /**
             * This variable store the teacher's address
             */
            address;

    /**
     *
     */
    protected double baseSalary,
            /**
             * This variable store the base salary
             */
            salary;

    /**
     * This method shows a message from the teacher telling they are teaching a
     * coding java class
     */
    protected void teach() {
        System.out.println("Dou unha clase de programación en Java");
    }

    /**
     * This method generate the pay roll from every teacher
     */
    protected abstract void generatePayRoll();

    /**
     * This method returns de name
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * This method sets the name
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method returns the surname
     *
     * @return surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * This method sets the surname
     *
     * @param surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * This method returns the address
     *
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method set the address
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method returns the base salary
     *
     * @return baseSalary
     */
    public double getBaseSalary() {
        return baseSalary;
    }

    /**
     * This method sets the base salary
     *
     * @param baseSalary
     */
    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    /**
     * This method returns the salary
     *
     * @return salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * This method sets the salary
     *
     * @param salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * This is the constructor from the abstract class, which can be used by the
     * subclasses to extend their attributtes already having these one
     *
     * @param name The name of the teacher
     * @param surname The surname of the teacher
     * @param address The address of the teacher
     * @param baseSalary The base salary payment of the teacher
     */
    public Teacher(String name, String surname, String address, double baseSalary) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.baseSalary = baseSalary;
    }

}