package finalKeyWord;

/*The final keyword in Java can be used in three ways:
    1.	Final Variable → Its value cannot be changed once assigned.
	2.	Final Method → Cannot be overridden by subclasses.
	3.	Final Class → Cannot be extended (inherited).*/


//Expected Output
/*Bank Name: National Bank
Savings Account Details:
Account Holder: John Doe
Balance: $5000.0
Converted Amount: 115.0 USD*/

public class Main {

    public static void main(String[] args) {

        BankAccount ac1 = new BankAccount();
        ac1.displayAccountDetails();

        SavingAccount s1 = new SavingAccount("Mohamed", 10000);
        s1.displayAccountDetails();

        ac1.displayAccountDetails();
        SavingAccount s2 = new SavingAccount("Alee", 10000);
        s2.displayAccountDetails();



    }
}
