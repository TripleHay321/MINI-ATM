import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        try (Scanner myobj = new Scanner(System.in)) {
            String choice;
            String new_choice;
            int bal = 8500;
            int new_bal;

            System.out.println("What Transaction do you want to perform \nDeposit\nWithdrawal \nRecharge \nBalance \nExit");
            System.out.println("Enter Transaction to perform:    ");
            choice = myobj.nextLine();
            new_choice = choice.toUpperCase();

            if (new_choice.equals("DEPOSIT")) {
                int deposit;
                System.out.println("Enter amouunt to deposit:   ");
                deposit = myobj.nextInt();
                new_bal = deposit + bal;
                System.out.println("You've deposited " + deposit + " New balance is " + new_bal);
            }

            else if (new_choice.equals("WITHDRAWAL")) {
                int withdraw;
                System.out.println("Enter amount to withdraw:   ");
                withdraw = myobj.nextInt();
                if (withdraw > bal) {
                    System.out.println("Insufficient Funds");
                }
                else {
                    new_bal = bal- withdraw;
                    System.out.println("You've withdrawn " + withdraw + " New balance is " + new_bal);
                }
            }
            else if (new_choice.equals("RECHARGE")) {
                String number;
                int recharge;
                System.out.println("Enter number to recharge for:  ");
                number = myobj.nextLine();
                System.out.println( "Enter amount you want to recharge: ");
                recharge = myobj.nextInt();
                if (recharge > bal) {
                    System.out.println( "Insufficient Balance") ;
                }
                else {
                    new_bal = bal - recharge;
                    System.out.println( "You recharged " + number + " " + recharge + " worth of airtime" + " New Balance is " + new_bal );
                }
            }

            else if (new_choice.equals("BALANCE")) {
                System.out.println("New Balance is " + bal);
            }
            else if (new_choice.equals("EXIT")) {
                System.out.println("");
            }

            else {
                System.out.println("Operation do not exit");
            }
        }
    }
}
