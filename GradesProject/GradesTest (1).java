

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lucas
 */
import javax.swing.JOptionPane;

public class GradesTest
{
    public static void main(String[] args)
    {
        Grades Student = new Grades();
        String Name;
        int Score;
       
        Name = JOptionPane.showInputDialog(null,"Please enter student name.");
        if(Name == null)
        {
            System.exit(0);
        }
        Student.setStudentName(Name);
     while(true)
     {
        try{
        String cScore  = JOptionPane.showInputDialog(null,"Please enter student Score.");
        if(cScore == null)
        {
           System.exit(0); 
        }       
        Score = Integer.parseInt(cScore); 
       if(Score <=0)
           throw new IllegalArgumentException();
       if(Score >100)
           throw new IllegalArgumentException();
         {
        
            Student.setStudentGrade(Score);
            Student.setStudentName(Name);
         
            JOptionPane.showMessageDialog(null,"Student name is: "+Student.getStudentName()+"\nStudent Grade is: "+Student.getStudentGrade());
            System.exit(0);
         }
       }
       catch(Exception e)
               {
                   JOptionPane.showMessageDialog(null,"Please enter a valid number");
                   
               }
     }
    }

            
                
            
}
