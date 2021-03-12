package Lab1;

import java.util.Random;
import java.util.Scanner;

public class BankAccount1 {

    public static void main(String[] args) {
        int fee = 3;
        double interest = 0.05;

        Scanner input = new Scanner(System.in);
        System.out.println("Are you: \n1. New Customer\n2. Out of House Customer\n3. In House Customer?\nPress 1/2/3: ");
        int option = input.nextInt();
        switch (option)
        {
            case 1:
                System.out.println("Would you like to open an account? \nEnter: 1 for yes; 2 for no");
                int yn = input.nextInt();
                if (yn == 1)
                {
                    System.out.println("Welcome! Thank you for Choosing us to Open your Account.");
                    System.out.println("Enter your name to Open an account: ");
                    input.nextLine();
                    String newCustomer = input.nextLine();
                    System.out.println("Enter Initial Balance to start the account: ");
                    double startBalance = input.nextDouble();

                    System.out.println("Your Name in the Account is: "+newCustomer);
                    System.out.println("Your Starting balance is: $"+startBalance);
                    BankAccount1 ob = new BankAccount1();


                }
                else if (yn==2)
                {
                    System.out.println("Have a Good Day.");
                    System.exit(-1);
                }
                else {
                    System.out.println("Invalid Entry");
                }
                break;
            case 2:
                System.out.println("There is extra fee for each transaction. If you agree press 1, if not 2");
                int agree = input.nextInt();
                if (agree == 1)
                {
                    System.out.println("How much would you like to withdraw?");
                    int withDraw_nonCust = input.nextInt();
                    System.out.println("Your total is: $" + withdraw(fee, withDraw_nonCust));
                }
                else if (agree == 2)
                {
                    System.out.println("Have a Good Day.");
                    System.exit(-1);
                }
                else {
                    System.out.println("Invalid Entry");
                }
                break;
            case 3:
                System.out.println("Enter Your Name same as in Account: ");
                input.nextLine();
                String customer = input.nextLine();

                System.out.println("Which account would you like to access today?");
                System.out.println("Please Press: 1 for Checking AND 2 for Saving");
                int accountType = input.nextInt();

                System.out.println("Are you Depositing or Withdrawing?");
                System.out.println("Please Press: 11 to Deposit AND 12 to Withdraw");
                int transactionType = input.nextInt();

                //Deposit in Checking
                if (accountType == 1 && transactionType == 11)
                {
                    System.out.println("How much are you depositing?");
                    double depositAmount = input.nextDouble();
                    double newBalance = depositAmount + displayAccountBalance(customer);
                    System.out.println("Your Updated Balance is: "+newBalance);
                    //System.out.println("Your Account number is: ");
                    BankAccount1 ob_checking = new BankAccount1(customer);

                }
                //Withdraw from Checking
                else if (accountType == 1 && transactionType == 12)
                {
                    System.out.println("How much are you withdrawing?");
                    int withdrawAmount = input.nextInt();
                    double newBalance = displayAccountBalance(customer) - withdrawAmount;
                    System.out.println("Your Updated Balance is: "+newBalance);
                    BankAccount1 ob_checking = new BankAccount1(customer);
                }
                //Deposit in Saving
                else if (accountType == 2 && transactionType == 11)
                {
                    System.out.println("Enter Your Pin: ");
                    int pin = input.nextInt();
                    System.out.println("How much are you depositing?");
                    double depositAmount = input.nextDouble();
                    double balanceSaving = displayAccountBalance(customer,pin);
                    //System.out.println(balanceSaving);
                    deposit(depositAmount, balanceSaving);
                    //double newBalance = depositAmount + displayAccountBalance(customer,accountType);
                    //System.out.println("Your Updated Balance is: "+updatedBalance);
                    BankAccount1 ob_checking = new BankAccount1(customer,pin);
                }
                //Withdraw from Saving
                else if (accountType == 2 && transactionType == 12)
                {
                    System.out.println("Enter Your Pin: ");
                    int pin = input.nextInt();
                    System.out.println("How much are you withdrawing?");
                    int withdrawAmount = input.nextInt();
                    double newBalance = displayAccountBalance(customer,pin) - withdrawAmount;

                    System.out.println("Your Updated Balance is: "+newBalance);
                    BankAccount1 ob_checking = new BankAccount1(customer,pin);
                }
                else{
                    System.out.println("Invalid Entry");
                }
        }
    }



    //Checking Account Balance
    public static double displayAccountBalance(String customer){
        double balanceChecking = 0;
        if (customer.equals("Sam Saran")){
            balanceChecking = 124578.09;
        }
        else if (customer.equals("Ram Hari")){
            balanceChecking = 5000;
        }

        //double newBalance = balance + deposit;
        return balanceChecking;
    }

    //Saving Account Balance
    public static double displayAccountBalance(String customer, int pin) {
        double balanceSaving = 0;
        if (customer == "Sam Saran"  && pin == 123) {
            balanceSaving = 10009000.09;
        }
        else if (customer == "Ram Hari" && pin == 321) {
            balanceSaving = 50000.85;
        }

        return balanceSaving;
    }

    //withdraw for In house Customer
    public static int withdraw(){
        return withdraw();
    }

    //External customer withdraw
    public static int withdraw(int fee, int withDraw_nonCust){
        //System.out.println("There is an extra fee for external customer.");
        int total = fee + withDraw_nonCust;
        return total;
    }

  //deposit in checking
    public static double deposit(){
        return deposit();
    }

    //deposit in saving
    public static double deposit(double depositAmount, double balanceSaving){
       double interest = 0.03;
       double totalBal = interest * balanceSaving + depositAmount;
        System.out.println("Your updated saving account Balance is: "+totalBal);
        return totalBal;
    }


    //Constructors
    //Checking Account Number
    public BankAccount1(String customer){
        int accountNo = 0;
        if (customer.equals("Rajesh Hamal")){
            accountNo = 11001;
            System.out.println("Your account number is "+accountNo);
        }
        if (customer.equals("Ram Hari")){
            accountNo = 22002;
            System.out.println("Your account number is "+accountNo);
        }
    }
    //Saving Account Number
    public BankAccount1(String customer, int pin){
        int accountNo = 0;
        if (customer == "Sam Saran" && pin == 123)
        {
            accountNo = 10011;
            System.out.println("Your account number is "+accountNo);
        }
        if (customer == "Ram Hari" && pin == 321)
        {
            accountNo = 20022;
            System.out.println("Your account number is "+accountNo);
        }
    }

    //For new Customer
    public BankAccount1(){
        Random accountNumb = new Random();
        int account = accountNumb.nextInt((1000-100))+100;

        // Print random integers
        System.out.println("Your Account Number is: "+account);
    }


}
