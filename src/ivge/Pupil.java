package ivge;

import java.util.Arrays;

public class Pupil implements Comparable<Pupil>, Humanable {
    private int[] marks = new int[100];

    public Pupil(int[] marks) {
        this.marks = marks;
    }

    public int marksSum(){
        int sum = 0;
        for (int mark: marks)
            if (mark == 5)
                sum += mark;
        return sum;
    }

    @Override
    public String toString() {
        return "Pupil{" +
                "marks=" + Arrays.toString(marks) +
                '}';
    }

    @Override
    public int compareTo(Pupil o) {
        return this.marksSum() - o.marksSum();
    }

    public int compareTo(Student o) {
        return -1;
    }

    @Override
    public int compareTo(Humanable o) {
        return 0;
    }
}