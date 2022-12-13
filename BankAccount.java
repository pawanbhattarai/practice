import java.util.*;

class AccountDetails{
    public String depositerName;
        
    public double AccountNumber;

    public String TypeOfAccount;

    public double BalanceAmount;


    public void initialize(String Name, Double AccNu,String Type, double Amount) {

        this.depositerName=Name;
        this.AccountNumber=AccNu;
        this.TypeOfAccount=Type;
        this.BalanceAmount=Amount;
        
    }
    public void deposite(Double Amount) {
        if(AccountNumber==0)
        System.out.println("Sorry! you do not have account!");
        else
        BalanceAmount+=Amount;
        System.out.println("Balance after deposite is"+BalanceAmount);
        System.out.println();
        
    }

    public void Withdraw(Double Amount) {

        if(AccountNumber==0){
        System.out.println("Sorry! you do not have account!");
        }else if(BalanceAmount>Amount){
             BalanceAmount-=Amount;
            System.out.println("Balance after withdraw is"+BalanceAmount);

        }else{
            System.out.println("Insufficient balance!!");
        }
        System.out.println();
       
}

    public void Display() {
        if(AccountNumber==0)
        System.out.println("Sorry! you do not have account");
        else{
        System.out.println("Name "+depositerName);
        System.out.println("Balance in Bank "+BalanceAmount);
    }
    System.out.println();
}



}

public class BankAccount {
 public static void main(String[] args) {
    AccountDetails newAccount=new AccountDetails();

    Scanner input=new Scanner(System.in);
    
    int choice;
    do{
        
        System.out.println("\n\n\t\t\t\t\t\t\t-----Welcome to Abc Bank-----\n How we can help you?\n\n");

    System.out.println("1. Open Account\n 2. Deposit Amount\n 3. Withdraw Amount\n 4. Account Details\n 5. Exit");
    choice=input.nextInt();


        switch (choice) {
            case 1: 
             System.out.println("Enter Your fullName: ");
             String Name=input.next();
             System.out.println("Enter your account type: ");
             String Type=input.next();
             Double AccNu=5676d;
    
    
             newAccount.initialize(Name, AccNu, Type, 0);
             break;
            case 2: 
             System.out.println("Enter the amount for the deposit ");
             Double Amount=input.nextDouble();
             newAccount.deposite(Amount);
             break;
    
            case 3:
             System.out.println("Enter the amount for the withdraw ");
             Double Amountw=input.nextDouble();
             newAccount.Withdraw(Amountw);
             break;
            case 4:
             newAccount.Display();
    
                
                break;
        
            default:
            System.out.println("Please choose valid Number");
                break;
        }


    }while(choice!=5);

    
    
    
 
    


 }
    
    
    
}
