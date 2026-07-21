package StudentGradeCalculator;

public class Student {
    String name;
    int[] marks;
    public Student(String name, int[] marks){
        this.name = name;
        this.marks = marks;
    }
    public int getTotal(){
        int total = 0;
        for(int mark : marks){
            total = total+mark;
        }
        return total;
    }
    public double getAvg(){
        return(double) getTotal()/marks.length;
    }
    public String getGrade(){
        double avg = getAvg();
        if(avg>=90)
            return "A+";
            else if(avg>=85)
            return "A";
        else if (avg>=80)
            return "A-";
        else if(avg>=75)
            return "B+";
        else if(avg>=70)
            return "B";
        else if(avg>=66)
            return "B-";
        else if(avg>=63)
            return "C+";
        else if(avg>=60)
            return "C";
        else if(avg>=55)
            return "C-";
        else {
        return "F";
    }
    }
}
