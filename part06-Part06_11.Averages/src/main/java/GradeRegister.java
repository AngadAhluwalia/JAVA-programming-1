
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> exampts;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.exampts= new  ArrayList<>();

    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.exampts.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }
    public double averageOfGrades(){
        if(grades.size()==0)
        return -1.0;
        double sum=0;
        int count=0;
        for(int grade:this.grades){
            sum+=grade;
            count++;
        }
        double result=sum/count;
        return result;
    }
    public double averageOfPoints(){
        if(this.exampts.size()==0)
        return -1.0;
        double sum=0;
        int ocunt =0;
        for(int pts:this.exampts){
            sum+=pts;
            ocunt++;
        }
        return sum/ocunt;
    }
    
}
