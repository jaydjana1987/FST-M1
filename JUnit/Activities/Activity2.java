package activities.Junit_M1.activity_2;

import org.junit.jupiter.api.Test;

import activities.Junit_M1.activity_2.NotEnoughFundsException;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Activity2 {

    //Write two @Test annotations, notEnoughFunds() and enoughFunds().
    @Test
    public void notEnoughFunds()
    {
        //Create an object for the BankAccount and set balance to 10.
        BankAccount bankAccount=new BankAccount(10000);

        //Add an assertion, assertThrows(), that expects the NotEnoughFundsException custom exception to be thrown.
       // assertThrows(NotEnoughFundsException.class, () -> bankAccount.withdraw(1000000),"Balance must be greater than amount of withdrawal");

        bankAccount.withdraw(1000000);

    }

    @Test
    public void enoughFunds()
    {
        // Create an object for BankAccount class
        BankAccount account = new BankAccount(100);

        // Assertion for no exceptions
        assertDoesNotThrow(() -> account.withdraw(100));

    }

}
