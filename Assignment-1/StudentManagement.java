import java.util.*;
public class StudentManagement{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    Student s1=new Student();
        s1.setStudentId(1);
        s1.setName("Mounika");
        s1.setGrade("A+");
        s1.setAge(21);

        s1.displayDetails();
  }
}
class Student{
    int studentId, age;
    String name, grade;

    public void setStudentId(int studentId){
        this.studentId=studentId;
    }

    public void setAge(int age){
        this.age=age;
    }

    public void setGrade(String grade){
        this.grade=grade;
    }

    public void setName(String name){
        this.name=name;
    }

    public int getStudentId(){
        return studentId;
    }

    public int getAge(){
        return age;
    }

    public String getGrade(){
        return grade;
    }

    public String getName(){
        return name;
    }

    public void displayDetails(){
        System.out.println("Student Details: ");
        System.out.println(getStudentId()+" "+getName()+" "+getGrade()+" "+getAge());
    }
}
