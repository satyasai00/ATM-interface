import java.util.Scanner;
public class ATM_INTERFACE{
    public static void main(String[] args) {
        int pin = 8126; 
        int balance = 200000; 
        int withdraw=0;
        int deposit=0;
        int transferamount=0;
        int accountnumber;
        Scanner sc =new Scanner(System.in); 
        System.out.println("Welcome to the BOI bank \n");
        System.out.println("Please enter your A.T.M pin: "); //asking to enter the pin
        pin =sc.nextInt();
        if(pin == 8126 ){                
            while(true) {
                System.out.println("BOI bank  A.T.M");
                System.out.println("Enter the required option you want \n");  // asking user to choose required opearation
                System.out.println("Select option 1 for withdraw");
                System.out.println("Select option 2 for deposit");
                System.out.println("Select option 3 for Check balance");
                System.out.println("Select option 4 for Transfer Amount");
                System.out.println("Select option 5 for receipt");
                System.out.println("Select option 6 for exit()");
                int n =sc.nextInt();
                switch (n) {
                case 1 :
                    System.out.println("Enter money to withdraw");
                    withdraw=sc.nextInt();
                    if(balance >= withdraw) {
                        balance=balance-withdraw;
                        System.out.println("Please collect your money \n");
                        System.out.println("Available balance is "+balance);
                        break;
                    } else {
                        System.out.println("Insufficient money ");
                    }
                    
    
                case 2 :                                                       
                    System.out.println("Enter money to be deposit");
                    deposit=sc.nextInt();
                    balance=balance+deposit;
                    System.out.println("Your money succefully deposited ");
                    System.out.println(" ");
                    break;
    
                case 3 :                                                        
                    System.out.println(" Available Balance : "+balance);
                    System.out.println(" ");
                    break;

                case 4:                                                  
                    System.out.println("Welcome to sbi bank");
                    System.out.println("Enter the IFSC code: ");
                    String ifsc = sc.next();
                    System.out.println("Entered IFSC code is:"+ifsc);
                    System.out.println("Enter the Bank Account Number:");
                    accountnumber=sc.nextInt();
                    System.out.println("Entered Bank Account Number:"+accountnumber);
                    System.out.println("Enter the amount to be tranfer:");
                    transferamount=sc.nextInt();
                    System.out.println("your amount "+transferamount+" is successfully transfered to the account number"+ accountnumber);
                    balance=balance-transferamount;
                    System.out.println("Available Balance:"+balance);   
                    
                    break;
    
                case 5 :                                                        
                    System.out.println("Welcome to sbi bank ATM ");
                    System.out.println("deposited amount"+deposit);
                    System.out.println("withdrwan amount"+withdraw);
                    System.out.println("Available balance"+balance);
                    System.out.println("Transfered Amount"+transferamount);
                    System.out.println("Thanks for Coming...");
                    System.out.println("Visit again");
                    break;
                case 6:
                    System.out.println("BOI bank A.T.M");
                    System.out.println("Thanks for coming...");
                    System.out.println("Visit Again");
                    System.exit(0);
                    
                }
            }

        }
        else {
                System.out.println("Enter the correct pin and retry");

        }
    }
}
