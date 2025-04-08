package ClassesAndObjects;

import java.util.ArrayList;

public class Student {

    String name;
    ArrayList<Float> grades;


    public Student(String name, ArrayList<Float>grades){
        this.name = name;
        this.grades = grades;

    }

    public static void main(String[] args) {

        // Adding grades for each student in ArrayList

        ArrayList<Float>grades1 = new ArrayList<>();
        grades1.add(2.44f);
        grades1.add(3.75f);
        grades1.add(5.55f);

        ArrayList<Float>grades2 = new ArrayList<>();
        grades2.add(2.0f);
        grades2.add(3.22f);
        grades2.add(5.15f);

        ArrayList<Float>grades3 = new ArrayList<>();
        grades3.add(3.2f);
        grades3.add(4.75F);
        grades3.add(5.55f);


        Student myStudent = new Student("Rumen",grades1);
        Student myStudent1 = new Student("Gosho",grades2);
        Student myStudent3= new Student("Ivan",grades3);

        myStudent1.displayInfoStudent();
        myStudent3.displayInfoStudent();
        myStudent.displayInfoStudent();
    }

    public float printAverageGrades(){

        float sum = 0.0F;
        for (float grade :grades){
            sum = sum + grade;
        }
        return sum / grades.size();
    }

    public void displayInfoStudent(){
        System.out.println("Name:" + name);
        System.out.println("Grades:" + printAverageGrades());
        System.out.println();
    }
}
