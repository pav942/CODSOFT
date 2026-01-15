import java.util.Scanner;
class userbankaccount {
    private double accountbalance;
    public userbankaccount(double i){
        accountbalance=i;
    }
    public void deposit(double am){
        if(am>0){
            accountbalance+=am;
            System.out.println("successful");
        } else {
            System.out.println("failure");
        }
    }
    public boolean withdraw(double am){
        if(am<=0){
            System.out.println("invalid withdrawal amount");
            return false;
        }
        if(am>accountbalance){
            System.out.println("insufficient balance");
            return false;
        }
        accountbalance-=am;
        System.out.println("successful");
        return true;
    }
    public double getbalance(){
        return accountbalance;
    }
}
public class atmmachine{
    private userbankaccount ac;
    private Scanner s;
    public atmmachine(userbankaccount ac){
        this.ac=ac;
        s=new Scanner(System.in);
    }
    public void show(){
        int c;
        do{
            System.out.println("1.withdrawing"+"\n2.depositing"+"\n3.checking the balance"+"\n4.exit");
            System.out.println("enter choice: ");
            c=s.nextInt();
            switch(c){
                case 1:
                    withdraw();
                    break;
                case 2:
                    deposit();
                    break;
                case 3:
                    checkBalance();
                    break;
                case 4:
                    System.out.println("thank you");
                    break;
                default:
                    System.out.println("invalid! try it again!");
            }
        } while(c!=4);
    }
    private void withdraw(){
        System.out.println("enter amount to withdraw: ");
        double am=s.nextDouble();
        ac.withdraw(am);
    }
    private void deposit(){
        System.out.println("enter amount to deposit: ");
        double am=s.nextDouble();
        ac.deposit(am);
    }
    private void checkBalance(){
        System.out.println("currentbalance: Rs."+ac.getbalance());
    }
    public static void main(String args[]){
        userbankaccount u=new userbankaccount(5000);
        atmmachine a=new atmmachine(u);
        a.show();
    }
}
