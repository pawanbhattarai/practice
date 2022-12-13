public class Untitled0 {
  

    public static void main(String[] args) {

        Employee emp=new Employee();
        emp.salary=10000;
        
        MonthlyBasedSalary MBS=new MonthlyBasedSalary();
        // MBS.salary=`6000;
        MBS.noOfMonth=6;
        float ans=MBS.calSalary();
       
        System.out.println(ans);


        HourlyBasedSalary HBS= new HourlyBasedSalary();
       
       // HBS.salary=5000;
        HBS.noOfHour=5;
        // // Salary=HBS.findSalary();
        
        System.out.println(HBS.findSalary());


    }
    
}

class Employee{

    public String name;
    public float salary;
    public String Address;

}
class MonthlyBasedSalary extends Employee{

    public int noOfMonth;

    public float calSalary(){
        return salary*noOfMonth;
    }

}

class HourlyBasedSalary extends Employee{
    public int noOfHour;

    public float findSalary(int salary){
        return noOfHour*salary;
    }
}
