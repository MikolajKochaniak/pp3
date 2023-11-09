import java.util.Scanner;
public class StudentGrades {
    String studentName;
    double[] grades;

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
        
    }
    StudentGrades(String name, int numberOfGrades) {
        numberOfGrades =(int) Math.random() * 10 + 1;

    }
    StudentGrades(String name) {
       


    }
    double lowestGrade(){
        double min = grades[0];
        for(int i =0;i<grades.length;i++){
            if(grades[i]<=min);
            min = grades[i];
        }
        return min;
    } 
    double highestGrade(){
        double max = grades[0];
        for(int i =0;i<grades.length;i++){
            if(grades[i]<=max);
            max = grades[i];
        }
        return max;
    } 
    int numOfGrades = grades.length;
    double avarage(){
        double sum = 0;
        for(int i =0;i<grades.length;i++){
            sum+=grades[i];
        }
        return sum/numOfGrades;
    }
    public String toString(){
        return studentName + "\n" + grades + "\n" + lowestGrade() + "\n" + highestGrade() + "\n" + numOfGrades + "\n" + avarage();
    }
}
