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
     * This is the main method
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CareerOfficer co = new CareerOfficer();
        co.setName("Paco");
        co.setSurname("Fernandez");
        co.setAddress("As neves, calle 4");
        co.setBaseSalary(1350);
        co.setOfficerComplement(350);
        co.generatePayRoll();
        System.out.println("Chámome " + co.getName() + " e o meu salario é de " + co.salary);
        co.teach();
        System.out.println("");
        Interim i = new Interim();
        i.setName("Carla");
        i.setSurname("Pacheco");
        i.setAddress("Ponteareas, calle 2");
        i.setBaseSalary(1400);
        i.setInterimComplement(600);
        i.generatePayRoll();
        System.out.println("Chámome " + i.getName() + " e o meu salario é de " + i.salary);
        i.teach();
        System.out.println("");
        Substitute su = new Substitute();
        su.setName("Yani");
        su.setSurname("Lopez");
        su.setAddress("Vigo, plaza menor");
        su.setBaseSalary(890);
        su.setDisplacement(220);
        su.generatePayRoll();
        System.out.println("Chámome " + su.getName() + " e o meu salario é de " + su.salary);
        su.teach();

    }

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

}
