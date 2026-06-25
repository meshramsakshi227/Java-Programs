
class Student{
String Name;
int age;

Student(String n,int a){
    Name=n;
    age=a;
}
void Display(){
    System.out.println("Name = "+Name);
    System.out.println("Age ="+age);
}
}
public class OOP1{
    public static void main(String[] args) {
        Student s1 = new Student("Sakshi", 68);
        s1.Display();
    }
}

