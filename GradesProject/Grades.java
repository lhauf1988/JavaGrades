// ClassName.........: GradeTest
// Developed By......: Lucas Hauf
// Week..............: Week 3
// Date Created......: 08/04/2015
// Purpose...........: A class to hold the private values
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
