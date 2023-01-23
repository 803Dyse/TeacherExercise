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
        double biggestSalary = Double.MIN_VALUE;
        Teacher mostPaidTeacher = null;
        for (Teacher teacher : teacherList) {
            if (biggestSalary > teacher.getSalary()) {
                biggestSalary = teacher.getSalary();
                mostPaidTeacher = teacher;
            }
        }
        return mostPaidTeacher;
    }

    /**
     * This method calculates the least paid teacher and return the value
     *
     */
    private Teacher leastPaid() {
        double lowestSalary = Double.MIN_VALUE;
        Teacher leastPaidTeacher = null;
        for (Teacher teacher : teacherList) {
            if (teacher.getSalary() <= lowestSalary) {
                lowestSalary = teacher.getSalary();
                leastPaidTeacher = teacher;
            }
        }
        return leastPaidTeacher;
    }

    /**
     * This method plus all the salary and return a total salary of all the
     * teachers
     *
     */
    private double salaryCosts() {
        double totalSalary = 0;
        for (Teacher teacher : teacherList) {
            totalSalary += teacher.getSalary();
        }
        return totalSalary;
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
        GregorianCalendar ca = new GregorianCalendar(1998, 3, 8);
        HighSchool a = new HighSchool("Pazo da merce");
        a.teacherList.add(new CareerOfficer(350, 2001, "Vigo", "Paco", "Lopez", "Madrid", 1500));
        a.teacherList.add(new Interim(500, "Neves", "Jorge", "Pino", "Gilpueblo", 780));
        a.teacherList.add(new Substitute(700, ca.getTime(), "Leticia", "Curi", "Barcelona", 1200));
        System.out.println("El profesor que tiene mayor salario es " + a.mostPaid().getName());
        System.out.println("El profesor que tiene menor salario es " + a.leastPaid().getName());
        System.out.println("El total del salario de los profesores es de:" + a.salaryCosts());
        System.out.println("La media de salario de los profesores es de: " + a.salaryAverage());
        System.out.println(a.salaryCosts());
    }

}
