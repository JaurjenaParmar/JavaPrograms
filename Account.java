import java.util.*;
public class Account {
    String name;
    int amount;
    void setInformation(String name, int amount){
        this.name = name;
        this.amount = amount;
        System.out.println("Total Amount available in account is : "+ amount);
    }
    void deposit(int amount){
        if(amount< 10){
            System.out.println("Deposit amount should be more than 10");
        }else if(amount>10000){
            System.out.println("Deposit amount should be less than 10000");
        }else{
            this.amount = this.amount + amount;}
        System.out.println("Amount in account = "+ this.amount);
    }
    void withdraw(int amount){
        if(this.amount< amount){
            System.out.println("Insufficient Balance");
        }else{
            this.amount = this.amount- amount;
            System.out.println("Amount in account = "+ this.amount);
        } 
    }
    void checkBalance(){
        System.out.println("Balance in account = "+ amount);
    }
    public static void main(String args[]){
    Scanner s = new Scanner(System.in);
    int choice,depositOrWithdraw, amount;
    Account account = new Account();
    account.setInformation("Inaya", 5000);

    System.out.println("Enter your choice :\nDo you want to carry out any transcation?\nPress '1' if yes else enter '0'..");
    choice = s.nextInt();
    while(choice!=0){
        System.out.println("Enter 1 to DEPOSIT and 2 to WITHDRAW ");
        depositOrWithdraw = s.nextInt();
        switch(depositOrWithdraw){
            case 1:
                System.out.println("Enter the amount to deposit ");
                amount = s.nextInt();
                account.deposit(amount);
                break;
            case 2:
                System.out.println("Enter the amount to withdraw ");
                amount = s.nextInt();
                account.withdraw(amount);
                break;
            default: System.out.println("Enter valid input ");
            }
            System.out.println("\n\nEnter your choice :\nDo you want to continue doing more transcation?\nPress '1' if yes else enter '0'..");
            choice = s.nextInt();
        }
        account.checkBalance();
        s.close();
    }
}

