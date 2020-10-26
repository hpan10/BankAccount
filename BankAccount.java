public class BankAccount{

  //Instance variables
  private double balance;
  private int accountID;
  private String password;

  //Constructor
  public BankAccount(int accountID, String password)
  {this.accountID = accountID; this.password = password; balance = 0;}

  //Methods
  public double getBalance()
  {return balance;}

  public int getAccountID()
  {return accountID;}

  public void setPassword(String newPass)
  {password = newPass;}


}
