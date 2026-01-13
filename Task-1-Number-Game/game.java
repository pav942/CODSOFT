import java.util.Random;
import java.util.Scanner;
public class game {
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    Random r=new Random();
    int a=0;
    boolean b=true;
    while(b){
        int  c=r.nextInt(100)+1;
        int d=7;
        boolean e=false;
        System.out.println("choose a number from 1 to 100 and you have only "+d+" attempts.");
        while(d>0){
            int f=s.nextInt();
            if(f==c){
                System.out.println("guessed correctly");
                e=true;
                a++;
                break;
            } else if(f>c){
                System.out.println("too high");
            } else {
                System.out.println("too low");
            }
            d--;
            System.out.println("attempts left for you is "+d);
        }
        if(!e){
            System.out.println("you lost. answer is "+c);
        }
        System.out.println("next round yes or no: ");
        String g=s.next();
        if(!g.equalsIgnoreCase("yes")){
            b=false;
        }
    }
    System.out.println("result based on rounds won: "+a);
}
}
