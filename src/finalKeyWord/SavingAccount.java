package finalKeyWord;

/*Create a subclass called SavingsAccount that:
        •	Tries to override the final method getBankName() (but should result in an error).
        •	Implements displayAccountDetails().*/
public class SavingAccount extends BankAccount  {

    private static String accountHolder;
    private static int accountCounter = 1000;

    private int accountNumber;
    private double accountBalance;


    SavingAccount(String Owner, double initialDeposit){

        this.accountNumber = ++accountCounter;
        this.accountBalance = initialDeposit;



    }




/*    @Override
    public final String getBankName(){
        return BANK_NAME;

    }*/


    @Override
    public void displayAccountDetails(){
        System.out.println("Account Number: "+ accountNumber);
        System.out.println("Account Type: Saving account");
        System.out.println("Balance: $" + accountBalance);

    }


    }