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
public class Student implements IStudent 
{
    private String name = null;
    private int age = 0;
    private String tutorgroup = null;
    
    public Student(String name, int age, String tutorgroup) 
    {
        this.age = age;
        this.name = name;  
        this.tutorgroup = tutorgroup;
    }

    @Override
    public String Name()
    {
        return name;
    }
   
    @Override
    public int Age()
    {
        return age;
    }
    
    @Override
    public String TutorGroup()
    {
        return tutorgroup;
    }
}
