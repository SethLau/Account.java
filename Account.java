/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgclass.example.pkg1.account;

/**
 *
 * @author Essa
 */
public class Account {
    private double balance;  // data private instance variables declarerd of type double
    private String name; // private instance variable ; object of type string
    
    // public methnods
    // constructor
    public Account()  // constructor ; no return type and its same name as class
    {
        balance  = 0.0; // initialising balance
        name = "NoName";
    }
    
    // Constructor can use parameter values to initialise instance variables
    // / Overload constructor - different signatures  
/*    public Account(String n, double b ) 
    {
        balance  = b; // initialising balance
        name = n;
    }*/
    // Distinguish between instance variable and names of parameter
    // use the 'this' to refer to the instance variable of the current object
    public Account(String name, double balance ) 
    {
        // validate if balance is > 0 ifnot
        // instance variable keeps default balance of 0
        if (balance > 0.0) 
        {
          this.balance  = balance; // assign instance variable balance 
        }
        
        this.name = name;  // assign name to instance variable
    }
    
    public void setBalance(double bal)  // setter method/ mutator method
    {
        balance = bal;
    }
    
    public void setName(String nam)
    {
       name = nam; 
    }
    
    public double getBalance()   // getter/accessoor method
    {
        return balance;
    }
    
    public String getName()   // getter/accessoor method
    {
        return name;
    }
    
    
    public void credit(double amount)
    {
        balance = balance + amount;
    }
    public boolean debit(double amount)
    {
        if(amount > balance)  // debit amount exceeds balance
        {
            return false;
        }
        else   /// debit amount does not exceed balance
        {
            balance = balance - amount;
            return true;
        }
    }
}
