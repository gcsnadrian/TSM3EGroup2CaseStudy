package tsm3ecasestudy;

public class Person 
{
    	private String name;
    	private String gender;
	private String address;
	private String work;
	private int empID;
    	private int numD;
	private int empSalary;
	private int OT;
	private int OTAmount;
  	private int tax;

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
	//Method  3: Angel Adriano
     public void getAdress(String address)
    {
        this.address = address;
    }
    
    public String showAddress()
    {
        return address;
    }
    
    //Method  4: Angel Adriano
    public void getWork(String work)
    {
        this.work = work;
    }
    
    public String showWork()
    {
        return work;
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

//Method 7: Jeremiah Barcelona
    public void getEmpSalary(int empSalary)
    {
        this.empSalary = empSalary;
    }
    
    public int showEmpSalary()
    {
        return empSalary;
    }
    
    //Method 8: Jeremiah Barcelona
    public void getOT(int OT)
    {
        this.OT = OT;
    }
    
    public int showOT()
    {
        return OT;
    }

//Method 9: Ma. Rosalyn Garbida
    public void getOTAmount(int OTAmount)
    {
        this.OTAmount = OTAmount;
    }
    
    public int showOTAmount()
    {
        return OTAmount;
    }
  
    //Method 10: Ma. Rosalyn Garbida
    public void getTax(int tax)
    {
        this.tax = tax;
    }
    
    public int showTax()
    {
        return tax;
    }
}
