import java.util.scanner;
abstract class employe
{
    public abstract float calsalary();



    class salarizedemployee extends employe(){
    float salary;
    int noofhrs;
    int noofmonths;
    public salarizedEmploye(float salary,int noofmonths)


{
      this.salary=salary;
      this.noofmonths=noofmonths;
      public float calsalary()
      {
        return salary*noofmonths;
   
      }
      class hourlybasedemploye extends employe
      public hourlybasedemploye(float salary,int noofhrs)
      {
          this.salary=salary;
          this.noofhrs=noofhrs;
      }
      employee emp=new salarizedemploye(5000f,2);
      print(emp.salary());
      emp=new hourlybasesalary(500f,10);
      print(emp.calsalary());
      public float calsalary()
        {
            return salary*noofhrs;
        }
      )
}
   
