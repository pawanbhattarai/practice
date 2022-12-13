class bot {  

    public static void main(String[] args) {

        Employee emp = new MonthlyBasedSalary(10);
        emp.salary = 5000;
        // emp.noOfMonth = 10;
        System.out.println(emp.calSalary());
        // System.out.println(emp.display());


    }
    
}

abstract class Employee{

    public float salary;
    abstract float calSalary();
    public void display()
    {
        System.out.println("base class");
    }

}
class MonthlyBasedSalary extends Employee{

    public int noOfMonth;
    public MonthlyBasedSalary(int noOfMonth){
        this.noOfMonth=noOfMonth;
    }
    public void printsalary(float totalsalary){
        System.out.println(totalsalary);
    }

    public float calSalary(){
        float totalsalary = salary * noOfMonth;
        printsalary(totalsalary);
        return totalsalary;
    }

}

