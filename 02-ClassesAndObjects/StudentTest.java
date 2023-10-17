

public class StudentTest {    
    public static void main(String[] args) {
        
        // object creation
        Student s = new Student();
        Student s2 = new Student();
        
        // object manipulation
        s.name = "Peter";
        s.age = 21;
        s.sayHello();
        s.displayName();
        s2.name = "Miki";
        s2.age = 11;
        s2.sayHello();
        s2.displayName();
        s2.IsValid();
        
        
        
        System.out.println(s.name + " " + s.age);
    }
}

