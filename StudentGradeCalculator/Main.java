package StudentGradeCalculator;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter student name: ");
        String name = sc.nextLine();
        System.out.println("enter number of subjects: ");
        int numSubjects = sc.nextInt();
        int[] marks = new int[numSubjects];
        for(int i=0; i<numSubjects; i++){
            System.out.println("enter marks for subject "+(i+1)+ " out of 100: ");
            marks[i] = sc.nextInt();
        }
        Student student = new Student(name, marks);
        System.out.println();
        System.out.println("----Student report----");
        System.out.println("name: "+ student.name);
        System.out.println("total marks: "+student.getTotal() );
        System.out.println("Average: "+ student.getAvg());
        System.out.println("Grade: "+student.getGrade());
        sc.close();
    }
}
