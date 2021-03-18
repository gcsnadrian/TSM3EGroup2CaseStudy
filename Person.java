package tsm3ecasestudy;

public class Person 
{
    private String name;
    private String gender;
    private int empID;
    private int numD;
  
  //Method 1: Trisha Mae Mallari
     public void getName(String name)
    {
        this.name = name;
    }
    
    public String showName()
    {
        return name;
    }
    
    //Method 2: Trisha Mae Mallari
    public void getGender(String gender)
    {
        this.gender = gender;
    }
  
    public String showGender()
    {
        return gender;
    }
//Method 5: Aryan Erieneil Aquino
    public void getEmpId(int empID)
    {
        this.empID = empID;
    }
    
    public int showEmpID()
    {
        return empID;
    }
    
    //Method 6: Aryan Erieneil Aquino
    public void getNumofD(int numD)
    {
        this.numD = numD;
    }
    
    public int showNumofD()
    {
        return numD;
    }
}
