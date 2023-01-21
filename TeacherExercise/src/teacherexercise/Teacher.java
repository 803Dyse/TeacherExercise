/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teacherexercise;

/**
 *
 * @author Alex
 */
public abstract class Teacher {

    protected String name, surname, address;
    protected double baseSalary, salary;

    protected void teach() {
        System.out.println("Dou unha clase de programación en Java");
    }

    protected abstract void generatePayRoll();

    /**
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
