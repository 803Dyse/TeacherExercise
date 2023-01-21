/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teacherexercise;

import java.util.Date;

/**
 *
 * @author Alex
 */
public class Substitute extends Teacher {

    protected double displacement;
    protected Date initDate;

    @Override
    protected void generatePayRoll() {
        salary = baseSalary + displacement;
    }

    @Override
    protected void teach() {
        System.out.println("Substitúo unha clase de programación en Java");
    }

    public double getDisplacement() {
        return displacement;
    }

    public void setDisplacement(double displacement) {
        this.displacement = displacement;
    }

    public Date getInitDate() {
        return initDate;
    }

    public void setInitDate(Date initDate) {
        this.initDate = initDate;
    }

}
