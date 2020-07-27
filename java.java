import java.util.Scanner;
public class BankingApplication {
  public static void main(final String[] args) {

    final BankAccount obj1 = new BankAccount("Skeeper", "S123");
    obj1.showMenu();
  }
}

class BankAccount {
  int balance;
  int previousTrans;
  String custName;
  String custId;

  BankAccount(final String cname, final String cid) {
    custName = cname;
    custId = cid;
  }

  void deposit(final int amount) {
    if (amount != 0) {
      balance = balance + amount;
    }
  }

  void withdraw(final int amount) {
    if (amount != 0) {
      balance = balance - amount;
      previousTrans = -amount;
    }
  }

  void getpreviousTrans() {
    if (previousTrans > 0) {
      System.out.println("Deposited: " + previousTrans);
    } else if (previousTrans < 0) {
      System.out.println("Withdrawn: " + Math.abs(previousTrans));
    } else {
      System.out.println("No transactions accured");
    }
  }

  void showMenu() {
    char option = '\0';
    final Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome " + custName);
    System.out.println("Your ID " + custId);
    System.out.println("\n");
    System.out.println("A.Check Balance");
    System.out.println("B.Deposit");
    System.out.println("C.WithDraw");
    System.out.println("D.Previous Transactions");
    System.out.println("E.Exit");

    do {
      System.out.println("===================");
      System.out.println("Enter your option: ");
      System.out.println("===================");
      option = scanner.next().charAt(0);
      System.out.println("\n");

      switch (option) {
        case 'A':
          System.out.println("______");
          System.out.println("Balance = " + balance);
          System.out.println("______");
          System.out.println("\n");
          break;
        case 'B':
          System.out.println("----------------------------");
          System.out.println("Enter your amount to deposit");
          System.out.println("----------------------------");
          final int amount = scanner.nextInt();
          deposit(amount);
          System.out.println("Amount Added To Your Account ");
          System.out.println("\n");
          break;
        case 'C':
          System.out.println("------------------------------");
          System.out.println("Enter your amount to Withdraw");
          System.out.println("------------------------------");
          final int amount2 = scanner.nextInt();
          withdraw(amount2);
          System.out.println("Amount Debited From Your Account");
          System.out.println("\n");
          break;
        case 'D':
          System.out.println("-----------");
          getpreviousTrans();
          System.out.println("-----------");
          System.out.println("\n");
          break;
        case 'E':
          System.out.println("------------");
          System.out.println("Your Exited");
          System.out.println("------------");
          break;
        default:
          System.out.println("Invalid option! Please Try again");
          break;
      }
    }
    while (option != 'E');
    System.out.println("Thank you for using Service");
  }
}