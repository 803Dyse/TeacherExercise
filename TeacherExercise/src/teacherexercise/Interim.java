/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teacherexercise;

/**
 *
 * @author Alex
 */
public class Interim extends Teacher {

    protected double interimComplement;
    protected String destination;

    @Override
    protected void generatePayRoll() {
        salary = baseSalary + interimComplement;
    }

    public double getInterimComplement() {
        return interimComplement;
    }

    public void setInterimComplement(double interimComplement) {
        this.interimComplement = interimComplement;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

}
