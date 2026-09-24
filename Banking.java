import java.util.Scanner;
class Bankaccount{
    int Balance;
    Bankaccount( int Balance){
        this.Balance=Balance;
    }
void deposite(int amt){
    if(amt>0){
        Balance=Balance+amt;
        System.out.println("deposite successfully:"+amt);
    }else{
        System.out.println("deposite invaild");
    }
}
void withdrawal(int cash){
    if(Balance>=cash){
        Balance=Balance-cash;
        System.out.println("withdrawal your amount:"+cash);
    }else{
        System.out.println("error check your balance!");
    }
}

void Check_balance(){
    System.out.println("you the balance:"+Balance);
}
}
class Banking{
    static void Bankusage(Bankaccount obj, Scanner scan){
        while (true) {
            System.out.println("1.Deposit");
            System.out.println("2.withdrawal");
            System.out.println("3.Check_balance");
            System.out.println("4.exit");
            System.out.println("enter CHOICE");

            int value = scan.nextInt();
            switch(value){
                case 1:
                    System.out.println("Enter the amount:");
                    int amt=scan.nextInt();
                    obj.deposite(amt);
                    break;
                case 2:
                    System.out.println("Enter the amount:");
                    int cash=scan.nextInt();
                    obj.withdrawal(cash);
                    break;
                case 3:
                    obj.Check_balance();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }


    
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    Bankaccount b1=new Bankaccount(10000);
    Bankaccount b2=new Bankaccount(3000);
    Bankusage(b1, scan);
    Bankusage(b2, scan);
    }
    }

