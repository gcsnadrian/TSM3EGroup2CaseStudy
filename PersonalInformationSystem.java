package tsm3ecasestudy;

import java.util.*;

public class TSM3ECaseStudy 
{
    public static void main(String[] args) 
    {
       Person p = new Person();
        
        Scanner prog = new Scanner (System.in);
        System.out.print("Full Name: ");
        String name = prog.nextLine();
        p.getName(name);
        
        System.out.print("Gender: ");
        String gender = prog.nextLine();
        p.getGender(gender);
        
        System.out.print("Address: ");
        String address = prog.nextLine();
        p.getAdress(address);
        
        System.out.print("Work: ");
        String work = prog.nextLine();
        p.getWork(work);
        
        System.out.print("Employee ID: ");
        int empID= prog.nextInt();
        p.getEmpId(0);
        
        System.out.print("No. of Days in Work(Per Month): ");
        int numD = prog.nextInt();
        p.getNumofD(numD);
        
        System.out.print("Salary Ampount per Day: ");
        int empSalary = prog.nextInt();
        p.getEmpSalary(empSalary);
        
        System.out.print("No. of Days of Overtime: ");
        int OT = prog.nextInt();
        p.getOT(OT);
        
        System.out.print("Amount of Overtime per Day: ");
        int OTAmount = prog.nextInt();
        p.getOTAmount(OTAmount);
        
        System.out.print("Amount of Tax: ");
        int tax = prog.nextInt();
        p.getTax(tax);
        
        p.result();
    }
}
