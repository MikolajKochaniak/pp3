public class Person {
    String name;
    double weight;
    double height;
    double BMI;
    Person(String name){
        this.name = name;
    }
    Person(String name, double weight,double height){
    this.name = name;   
    this.weight = weight;
    this.height = height;
    }
    void setWeightAndHeight(double weight, double height){
        this.weight = weight;
        this.height = height;
    }
    void calculateBMI(){
        BMI = weight/height*height;

    }
    void displayRecord(){
        if(BMI<=24.9 && BMI>=18.5){
        System.out.println(name +"\n" + weight +"\n" + height +"\n" + BMI + "BMI is fine");
        }
        if(BMI>=24.9){
        System.out.println(name +"\n" + weight +"\n" + height +"\n" + BMI + "BMI is too high");
        }
        if(BMI<=18.5){
        System.out.println(name +"\n" + weight +"\n" + height +"\n" + BMI + "BMI is too low");
        }
    }
}

    

