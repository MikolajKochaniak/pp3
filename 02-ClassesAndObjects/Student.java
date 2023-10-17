public class Student
{
    String name;
    int age;
    long student_id;
    boolean valid_or_not;
    long semester_number;
    double Grade;
    boolean change;



    void display()
    {
        System.out.println("Age =  "+age);
    }
    void sayHello()
    {
        System.out.println("Hello from "+name);
    }
    void displayName()
    {
        System.out.println("Name =  "+name);  
    }
    void displayNumberAndGrade()
    {
        System.out.println("Number =  "+semester_number + "Grade =  "+Grade );  
    }
    void IsValid()
    {
        change = !(valid_or_not);  
    }
    void displayNameIdValid()
    {
        System.out.println("Name =  "+name+ "ID =  "+student_id + "Is it Valid =  "+change);  
    }

}
