import java.io.Serializable;
public class Student implements Serializable {
    private String name;
    private int rollnumber;
    private String grade;
    public Student(String name,int rollnumber,String grade){
        this.name=name;
        this.rollnumber=rollnumber;
        this.grade=grade;
    }
    public String gettingname(){
        return name;
    }
    public int gettingrollno(){
        return rollnumber;
    }
    public String gettinggrade(){
        return grade;
    }
    public void settingname(String name){
        this.name=name;
    }
    public void settinggrade(String grade){
        this.grade=grade;
    }
    public String toString(){
        return "name: "+name+" rollnumber: "+rollnumber+" grade: "+grade;
    }
}
