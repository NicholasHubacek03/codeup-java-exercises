package grades;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name){
        this.name = name;
        grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades property
    public void addGrade(int grade){
        grades.add(grade);
    }

    // returns the list of the student's grades
    public List<Integer> getGrades() {
        return grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
        double avg = 0;

        for(double grade : grades){
            avg += grade;
        }
        return avg/grades.size();
    }
}