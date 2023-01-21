/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teacherexercise;

/**
 *
 * @author Alex
 */
public class CareerOfficer extends Teacher {

    protected double officerComplement;
    protected int oppositionYear;
    protected String oppositionPlace;

    @Override

    protected void generatePayRoll() {
        salary = baseSalary+officerComplement;
    }

    public double getOfficerComplement() {
        return officerComplement;
    }

    public void setOfficerComplement(double officerComplement) {
        this.officerComplement = officerComplement;
    }

    public int getOppositionYear() {
        return oppositionYear;
    }

    public void setOppositionYear(int oppositionYear) {
        this.oppositionYear = oppositionYear;
    }

    public String getOppositionPlace() {
        return oppositionPlace;
    }

    public void setOppositionPlace(String oppositionPlace) {
        this.oppositionPlace = oppositionPlace;
    }

}
