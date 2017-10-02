package grades;

import java.util.ArrayList;

public class Student {
    private String name;

    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
    public Student(){};

    // returns the student's name
    public String getName(){
        return this.name = name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grades){
        this.grades.add(grades);

    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for(Integer grade: grades) {
            sum += grade;
        }
        return sum /grades.size();
    }
    public static void main(String[] args) {
        Student student = new Student("My");
        student.addGrade(85);
        student.addGrade(86);
        student.addGrade(87);
        student.addGrade(99);
        student.addGrade(85);
        student.addGrade(90);
        System.out.println(student.getName() + "'s grade average is: " + student.getGradeAverage());
    }
}