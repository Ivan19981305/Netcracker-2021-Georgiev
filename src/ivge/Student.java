package ivge;

import java.util.Arrays;

public class Student implements Comparable<Student>, Humanable{
    private int[] marks = new int[100];

    public Student(int[] marks) {
        this.marks = marks;
    }



    public int marksSum(){
        int sum = 0;
        for (int mark: marks)
            sum += mark;
        return sum;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + Arrays.toString(marks) +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.marksSum() - o.marksSum();
    }
}
