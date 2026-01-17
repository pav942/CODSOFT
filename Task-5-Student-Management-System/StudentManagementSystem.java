import java.io.*;
import java.util.*;
public class StudentManagementSystem {
private List<Student> s=new ArrayList<>();
private final String fp ="students.dat";
public void addastudent(Student st){
    s.add(st);
    save();
}
public boolean removeastudent(int rollnumber){
    Iterator<Student> iterator=s.iterator();
    while (iterator.hasNext()) {
        if(iterator.next().gettingrollno()==rollnumber){
            iterator.remove();
            save();
            return true;
        }
    }
    return false;
}
public Student searchforastudent(int rollnumber){
    for(Student a:s){
        if(a.gettingrollno()==rollnumber){
            return a;
        }
    }
    return null;
}
public void displayallstudents(){
    if(s.isEmpty()){
        System.out.println("nothing found");
    } else{
        for(Student a:s){
            System.out.println(a);
        }
    }
}
public void load(){
    try(ObjectInputStream oi=new ObjectInputStream(new FileInputStream(fp))){
        s=(List<Student>) oi.readObject();
    } catch(Exception e){
        s=new ArrayList<>();
    }
}
private void save(){
    try(ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream(fp))){
        oo.writeObject(s);
    } catch(IOException e){
        System.out.println("error");
    }
}
}
