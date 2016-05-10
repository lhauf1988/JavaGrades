/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
public class Grades 
{
    private String StudentName;
    private int StudentGrade;
    
    public Grades()
            {
                
            }
    public Grades(String ID, int Score)
            {
                StudentName = ID;
                StudentGrade = Score;
            } 
    public String getStudentName ()
    {
        return StudentName;
    }
    
    public int getStudentGrade()
    {
        return StudentGrade;
    }
    
    public void setStudentName(String ID)
    {
        StudentName = ID;
    }
    
    public void setStudentGrade(int Score)
    {
        StudentGrade = Score;
    }
            
}
