public class app2 {
    public static void main(String[] args) throws Exception {

        Student Miki = new Student();
        Miki.name = "Mikolaj";
        Miki.surname = "Kochaniak";
        Miki.age = 19;
        Miki.student_id = 12343242536543654L;
        Miki.first_year = true;
        Miki.field_of_study = "Informatyka Stosowana";
        Miki.name_of_university = "UEK";
        System.out.println(Miki.name + " " + Miki.surname + " " + Miki.age + " " + Miki.student_id + " " + Miki.first_year + " " + Miki.field_of_study + " " + Miki.name_of_university);

        
    }
}
class Student
{
    String name;
    String surname;
    int age;
    Long student_id;
    Boolean first_year;
    String field_of_study;
    String name_of_university;
    void sayHello()
    {
        System.out.println("Hello from "+name);
    }
    void displayName()
    {
        System.out.println("name : " + name)
        ;
    }
    
}
