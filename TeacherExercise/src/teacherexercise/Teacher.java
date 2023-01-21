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
        
    protected void teach(){
        System.out.println("Dou unha clase de programación en Java");
    }
    
    protected abstract void generatePayRoll();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
    }
    
}
