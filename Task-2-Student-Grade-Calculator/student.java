import java.util.Scanner;
public class student {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of subjects: ");
        int n=s.nextInt();
        int[] marks=new int[n];
        for(int i=0; i<n;i++){
            System.out.println("enter the mark of subject"+(i+1)+" :");
            int a=s.nextInt();
            if(a<=100)
                marks[i]=a;
            else{
                System.out.println("enter valid marks");
                i--;
                continue;
            }
        }
        int tot=0;
        for(int i=0;i<n;i++){
            tot+=marks[i];
        }
        int avg=tot/n;
        String g;
        if(avg>95){
            g="O";
        } else if(avg>90){
            g="A+";
        } else if(avg>85){
            g="A";
        } else if(avg>80){
            g="B+";
        } else if (avg>75){
            g="B";
        } else {
            g="F";
        }
        System.out.println("totalmarks out of 100: "+tot+"\naverage "+avg+"\ngrade calculation: "+g);
    }
}
