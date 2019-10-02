/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceinheritance;

/**
 *
 * @author dw
 */
public class InterfaceInheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student student = new Student("Eric Cartman", 12, "12Wa");
        Teacher teacher = new Teacher("Mr Garrison", 45, "male", "Weed Farming");
        StudentTeacher studentTeacher = new StudentTeacher("Mr Waterman", 32, "male", "Computer Science", "12W");
        System.out.println(student.Name() + " : " + student.Age() + " : " + student.Gender() + " : " + student.TutorGroup());        
        System.out.println(teacher.Name() + " : " + teacher.Age() + " : " + teacher.Gender());    
        System.out.println(studentTeacher.Name() + " : " + studentTeacher.Age() + " : " + studentTeacher.Gender() + " : " + studentTeacher.Subject()+ " : " + studentTeacher.TutorGroup());    
    }
}
