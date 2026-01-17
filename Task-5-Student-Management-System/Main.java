import java.util.Scanner;
public class Main {
public static void main(String args[]){
    StudentManagementSystem sm=new StudentManagementSystem();
    sm.load();
    Scanner scan=new Scanner(System.in);
    int c;
    do{
        System.out.print("1.adding a new student"+"\n2.editing an existing student information"+"\n3.removing the student");
        System.out.print("\n4.searching for a student"+"\n5.displaying all students"+"\n 6.exiting the application");
        System.out.print("\nenter the choice: ");
        while (!scan.hasNextInt()) {
            System.out.println("enter number: ");
            scan.next();
        }
        c=scan.nextInt();
        switch (c) {
            case 1->{
                scan.nextLine();
                System.out.println("enter name: ");
                String name=scan.nextLine();
                System.out.println("enter rollnumber: ");
                int rollnumber=scan.nextInt();
                scan.nextLine();
                System.out.println("enter garde: ");
                String grade=scan.nextLine();
                if(name.isEmpty()||grade.isEmpty()){
                    System.out.println("fields cannot empty");
                } else {
                    sm.addastudent(new Student(name, rollnumber, grade));
                    System.out.println("adding the student is successfull");
                }
            }
            case 2->{
                System.out.println("enter rollnumber: ");
                int rollnumber=scan.nextInt();
                scan.nextLine();
                Student a=sm.searchforastudent(rollnumber);
                if(a!=null){
                    System.out.println("enter name: ");
                    a.settingname(scan.nextLine());
                    System.out.println("enter grade: ");
                    a.settinggrade(scan.nextLine());
                    System.out.println("student details updated");
                } else{
                    System.out.println("student not found");
                }
            }
            case 3->{
                System.out.println("enter rollnumber: ");
                int rollnumber=scan.nextInt();
            if(sm.removeastudent(rollnumber)){
                System.out.println("the student is removed");
            } else {
                System.out.println("student not found");
            }
            }
            case 4->{
                System.out.println("enter rollnumber: ");
                int rollnumber=scan.nextInt();
                Student a=sm.searchforastudent(rollnumber);
                if(a!=null){
                    System.out.println(a);
            } else{
                System.out.println("student not found");
            }
            }
            case 5-> sm.displayallstudents();
            case 6-> System.out.println("exited");
            default-> System.out.println("invalid. choose the correct choice");
        }
    } while (c!=6);
        
    
}
}
