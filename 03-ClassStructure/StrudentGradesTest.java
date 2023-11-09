import java.util.Scanner;

public class StrudentGradesTest {
    public static void main(String[] args) {
    double[] uno = {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};
    StudentGrades Amanda = new StudentGrades("Amanda",uno );
    double[] due = {2.0, 3.0, 2.0, 4.5, 4.5};
    StudentGrades James = new StudentGrades("James",due );
    System.out.println(Amanda);
    System.out.println(James);
   
    
}
}
