/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teacherexercise;

import java.util.ArrayList;
import java.util.GregorianCalendar;

/**
 * This class store all the kind of the teachers and store everything in the
 * "highschool" object
 *
 * @author Bilo Alejandro Martins Gonzalez
 */
public class HighSchool {

    private String name;
    private ArrayList<Teacher> teacherList;

    /**
     * This constructor allows you to asign a name to the scholl, also
     * inicializing the arraylist "teacherlist" to store all the teacher from
     * this school
     *
     * @param name
     */
    public HighSchool(String name) {
        this.name = name;
        teacherList = new ArrayList<>();
    }

    /**
     * This method calculate the most paid teacher and return the value
     */
    private Teacher mostPaid() {
        double biggestSalary = 0;
        int count = 0;
        for (int i = 0; i < teacherList.size(); i++) {
            if (biggestSalary < teacherList.get(i).getSalary()) {
                biggestSalary = teacherList.get(i).getSalary();
                count = i;
            }
        }
        return teacherList.get(count);
    }

    /**
     * This method calculates the least paid professor
     *
     */
    private Teacher leastPaid() {
        double lowestSalary = 0;
        int count = 0;
        for (int i = 0; i < teacherList.size(); i++) {
            if (lowestSalary > teacherList.get(i).getSalary()) {
                lowestSalary = teacherList.get(i).getSalary();
                count = i;
            }
        }
        return teacherList.get(count);
    }

    /**
     * This method plus all the salary and return a total salary of all the
     * teachers
     *
     */
    private double salaryCosts() {
        double total = 0;
        for (int i = 0; i < teacherList.size(); i++) {
            total = teacherList.get(i).getSalary() + total;
        }
        return total;
    }

    /**
     * This method calculate the salary average from all the teachers
     *
     */
    double salaryAverage() {
        double total = 0;
        for (int i = 0; i < teacherList.size(); i++) {
            total += teacherList.get(i).getSalary();
        }
        return total / teacherList.size();
    }

    /**
     * This is the main method
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CareerOfficer co = new CareerOfficer(250, 2001, "As neves", "Fernando", "Fernandez", "Vigo, calle 3", 1500);
        co.generatePayRoll();
        System.out.println("Chámome " + co.name + " e meu salario é de " + co.salary);
        co.teach();
        System.out.println("");
        Interim i = new Interim(250, "Vigo", "Carla", "Pacheco", "Granada", 1600);
        i.generatePayRoll();
        System.out.println("Chámome " + i.getName() + " e o meu salario é de " + i.salary);
        i.teach();
        System.out.println("");
        //We create a gregorian calendar to make a better format to the date
        GregorianCalendar gc = new GregorianCalendar(2001, 06, 04);
        Substitute su = new Substitute(500, gc.getTime(), "Jack", "Lantern", "Vigo2", 1500);
        su.generatePayRoll();
        System.out.println("Chámome " + su.name + " e meu salario é de " + su.salary);
        su.teach();

        HighSchool a = new HighSchool("Pazo da merce");
        a.teacherList.add(co);
        a.teacherList.add(i);
        a.teacherList.add(su);
        System.out.println("");
        System.out.println("El profesor que tiene mayor salario es " + a.mostPaid().getName());
        System.out.println("El profesor que tiene menor salario es " + a.leastPaid().getName());
        System.out.println("El total del salario de los profesores es de:" + a.salaryCosts());
        System.out.println("La media de salario de los profesores es de: " + a.salaryAverage());
    }

}
