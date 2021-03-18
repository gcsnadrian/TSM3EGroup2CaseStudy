package tsm3ecasestudy;

public class Person 
{
    private String name;
    private String gender;
	private String address;
	private String work;
  
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
}
