public class BankAccountTester{

  public static void main(String[]args){
    BankAccount Harry = new BankAccount(216448415, "excellentpassword");
    Harry.deposit(43000);
    Harry.withdraw(931);
    Harry.withdraw(43000);
    Harry.withdraw(-4);
    Harry.deposit(-23564);

    System.out.println(Harry.getBalance());
    System.out.println(Harry.getAccountID());
    System.out.println(Harry.toString());

    BankAccount Pan = new BankAccount(427797, "yuhyuhyuh");
    Pan.deposit(-35);
    Pan.deposit(35);
    Pan.withdraw(40);
    Pan.withdraw(5);

    System.out.println(Pan.getBalance());
    System.out.println(Pan.getAccountID());
    System.out.println(Pan.toString());

  }

}
