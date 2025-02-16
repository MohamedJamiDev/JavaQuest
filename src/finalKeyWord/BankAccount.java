package finalKeyWord;

/*	1.	Create a class called BankAccount with the following:
        •	A final variable BANK_NAME (set to "National Bank").
        •	A final method getBankName() that returns BANK_NAME.
        •	A non-final method displayAccountDetails() to print account details.*/

public class BankAccount {

   final String BANK_NAME = "National Bank";


    public final String getBankName(){
       return BANK_NAME;

    }

    public void displayAccountDetails(){
        System.out.println("Bank Name: "+ getBankName());
    }

}
